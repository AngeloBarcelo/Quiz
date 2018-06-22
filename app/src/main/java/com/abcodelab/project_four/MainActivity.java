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
    static boolean q1Answered = false;
    static boolean q2Answered = false;
    static boolean q3Answered = false;
    static boolean q4Answered = false;
    static boolean q5Answered = false;
    static boolean q6Answered = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.textTitleBtn1.setText(R.string.text_q1_title);
        binding.textTitleBtn2.setText(R.string.text_q2_title);
        binding.textTitleBtn3.setText(R.string.text_q3_title);
        binding.textTitleBtn4.setText(R.string.text_q4_title);
        binding.textTitleBtn5.setText(R.string.text_q5_title);
        binding.textTitleBtn6.setText(R.string.text_q6_title);
        binding.textTitleScoring.setText(R.string.text_scoring_title);
        binding.textTitleScoring.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ScoreActivity.class);
                startActivity(intent);
                return false;
            }
        });

        //Sets the progressbar by the total # of questions answered regardless of the question
        if(MainActivity.q1Answered==true ||MainActivity.q2Answered==true||MainActivity.q3Answered==true||MainActivity.q4Answered==true||MainActivity.q5Answered==true||MainActivity.q6Answered==true)
        switch (ScoreActivity.getAnswerAttempt()) {
            case 0:
                binding.progressBar.setProgress(binding.progressBar.getProgress()+17);
                break;
            case 1:
                binding.progressBar.setProgress(binding.progressBar.getProgress()+17);
                break;
            case 2:
                binding.progressBar.setProgress(binding.progressBar.getProgress()+17);
                break;
            case 3:
                binding.progressBar.setProgress(binding.progressBar.getProgress()+17);
            case 4:
                binding.progressBar.setProgress(binding.progressBar.getProgress()+17);
                break;
            case 5:
                binding.progressBar.setProgress(binding.progressBar.getProgress()+17);
                break;
            default:
                binding.progressBar.setProgress(binding.progressBar.getProgress()+17);
        }
    }

    //Nothing gets returned. Just intents to start the other activities.
    //The extra'a are sent to generate the title question number.
    public void questioBtnPressed(View v) {
        int received_ID = v.getId();
        switch (received_ID) {

            case R.id.title_btn1:
                if (MainActivity.q1Answered == false) {
                    Intent intent1 = new Intent(getApplicationContext(), RadioQuestionActivity.class);
                    intent1.putExtra("questionPassed", "1");
                    startActivity(intent1);
                } else {
                    binding.textTitleBtn1.setText("Answered");
                    Toast.makeText(getApplicationContext(), getString(R.string.answered_already), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.text_title_btn2:
            case R.id.title_btn2:
                if (MainActivity.q2Answered == false) {
                    Intent intent2 = new Intent(getApplicationContext(), RadioQuestionActivity.class);
                    intent2.putExtra("questionPassed", "2");
                    startActivity(intent2);
                } else {
                    binding.textTitleBtn2.setText("Answered");
                    Toast.makeText(getApplicationContext(), getString(R.string.answered_already), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.text_title_btn3:
            case R.id.title_btn3:
                if (MainActivity.q3Answered == false) {
                    Intent intent3 = new Intent(getApplicationContext(), CheckboxQuestionActivity.class);
                    intent3.putExtra("questionPassed", "3");
                    startActivity(intent3);
                } else {
                    binding.textTitleBtn3.setText("Answered");
                    Toast.makeText(getApplicationContext(), getString(R.string.answered_already), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.text_title_btn4:
            case R.id.title_btn4:
                if (MainActivity.q4Answered == false) {
                    Intent intent4 = new Intent(getApplicationContext(), CheckboxQuestionActivity.class);
                    intent4.putExtra("questionPassed", "4");
                    startActivity(intent4);
                } else {
                    binding.textTitleBtn4.setText("Answered");
                    Toast.makeText(getApplicationContext(), getString(R.string.answered_already), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.text_title_btn5:
            case R.id.title_btn5:
                if (MainActivity.q5Answered == false) {
                    Intent intent5 = new Intent(getApplicationContext(), TextEntryActivity.class);
                    intent5.putExtra("questionPassed", "5");
                    startActivity(intent5);
                } else {
                    binding.textTitleBtn5.setText("Answered");
                    Toast.makeText(getApplicationContext(), getString(R.string.answered_already), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.title_btn6:
            case R.id.text_title_btn6:
                if (MainActivity.q6Answered == false) {
                    Intent intent6 = new Intent(getApplicationContext(), TextEntryActivity.class);
                    intent6.putExtra("questionPassed", "6");
                    startActivity(intent6);
                } else {
                    binding.textTitleBtn6.setText("Answered");
                    Toast.makeText(getApplicationContext(), getString(R.string.answered_already), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public void scoreDisplay(View v) {
        String line1 = String.format(getString(R.string.total_score), ScoreActivity.getTotalScore() + "%");
        String line2 = String.format(getString(R.string.correct_answers),
                String.valueOf(ScoreActivity.getCorrectAnswer()));
        String line3 = String.format(getString(R.string.incorrect_answers),
                String.valueOf(ScoreActivity.getWrongAnswer()));
        String line4 = String.format(getString(R.string.viewed_questions),
                String.valueOf(ScoreActivity.getViewedQuestion()));
        String line5 = String.format(getString(R.string.total_questions),
                String.valueOf(ScoreActivity.getAnswerAttempt()));
        String line6 = getString(R.string.view_score_screen);

        String outputMessage = line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 +
                "\n\n" + line6;
        Toast.makeText(getApplicationContext(), outputMessage, Toast.LENGTH_SHORT).show();
    }
}