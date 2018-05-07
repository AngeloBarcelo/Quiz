package com.abcodelab.project_four;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.abcodelab.project_four.databinding.ActivityMainBinding;
import com.abcodelab.project_four.databinding.ActivityScoreBinding;

import static java.lang.Integer.*;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ActivityScoreBinding scoreActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        scoreActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_score);
    }

    //Nothing gets returned. Just intents to start the other activities.
    //The extra'a are sent to generate the title question number.
    public void questioBtnPressed(View v) {
        int received_ID = v.getId();
        Log.i("btn: ", String.valueOf(received_ID));
ScoreActivity scoreActivity = new ScoreActivity(0,0,0,0);
        Log.i("Corrt", String.valueOf(scoreActivity.getCorrectAnswer()));

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
}
