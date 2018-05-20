package com.abcodelab.project_four;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.abcodelab.project_four.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //Sets the progressbar by the total # of questions answered regardless of the question
        switch (ScoreActivity.getAnswerAttempt()) {
            case 0:
                binding.progressBar.setProgress(0);
                break;
            case 1:
                binding.progressBar.setProgress(17);
                break;
            case 2:
                binding.progressBar.setProgress(34);
                break;
            case 3:
                binding.progressBar.setProgress(51);
            case 4:
                binding.progressBar.setProgress(68);
                break;
            case 5:
                binding.progressBar.setProgress(85);
                break;
            default:
                binding.progressBar.setProgress(100);
        }
    }

    //Nothing gets returned. Just intents to start the other activities.
    //The extra'a are sent to generate the title question number.
    public void questioBtnPressed(View v) {
        int received_ID = v.getId();
        switch (received_ID) {
            case R.id.title_btn1:
                Intent intent1 = new Intent(getApplicationContext(), RadioQuestionActivity.class);
                intent1.putExtra("questionPassed", 1);
                startActivity(intent1);
                break;
            case R.id.title_btn2:
                Intent intent2 = new Intent(getApplicationContext(), RadioQuestionActivity.class);
                intent2.putExtra("questionPassed", "2");
                startActivity(intent2);
                break;
            case R.id.title_btn3:
                Intent intent3 = new Intent(getApplicationContext(), CheckboxQuestionActivity.class);
                intent3.putExtra("questionPassed", "3");
                startActivity(intent3);
                break;
            case R.id.title_btn4:
                Intent intent4 = new Intent(getApplicationContext(), CheckboxQuestionActivity.class);
                intent4.putExtra("questionPassed", "4");
                startActivity(intent4);
                break;
            case R.id.title_btn5:
                Intent intent5 = new Intent(getApplicationContext(), TextEntryActivity.class);
                intent5.putExtra("questionPassed", "5");
                startActivity(intent5);
                break;
            case R.id.title_btn6:
                Intent intent6 = new Intent(getApplicationContext(), TextEntryActivity.class);
                intent6.putExtra("questionPassed", "6");
                startActivity(intent6);
                break;
        }
    }

    public void scoreDisplay(View v) {
        String line1 = String.format(getString(R.string.total_score), ScoreActivity.getTotalScore() + "%");
        String line2 = String.format(getString(R.string.correct_answers), String.valueOf(ScoreActivity.getCorrectAnswer()));
        String line3 = String.format(getString(R.string.incorrect_answers), String.valueOf(ScoreActivity.getWrongAnswer()));
        String line4 = String.format(getString(R.string.viewed_questions), String.valueOf(ScoreActivity.getViewedQuestion()));
        String line5 = String.format(getString(R.string.total_questions), String.valueOf(ScoreActivity.getAnswerAttempt()));
        String line6 = getString(R.string.view_score_screen);

        String outputMessage = line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n\n" + line6;
        Toast.makeText(getApplicationContext(), outputMessage, Toast.LENGTH_SHORT).show();
    }
}