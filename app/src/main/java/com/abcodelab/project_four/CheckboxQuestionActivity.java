package com.abcodelab.project_four;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.abcodelab.project_four.databinding.CheckboxLayoutBinding;

public class CheckboxQuestionActivity extends AppCompatActivity {
    CheckboxLayoutBinding binding;
    ScoreActivity scoring = new ScoreActivity(0,0,0,0);
    String savedExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.checkbox_layout);
        savedExtra = getIntent().getStringExtra("questionPassesd");
    }

    public void submitCheckboxAnswers(View v) {
        switch (savedExtra) {
            case "3":
                Log.i("Total case 3", String.valueOf(scoring.getTotalScore()));
                Log.i("Attempts", String.valueOf(scoring.getViewedQuestion()));
                Log.i("Correct", String.valueOf(scoring.getCorrectAnswer()));
                if (!((binding.checkboxOne.isChecked() || binding.checkBoxTwo.isChecked()) && (binding.checkBoxThree.isChecked() || binding.checkBoxFour.isChecked()))) {
                    Toast.makeText(getApplicationContext(), "Please choose two answers", Toast.LENGTH_SHORT).show();
                } else {
                    scoring.setAnswerAttempt(1);
                    if (binding.checkboxOne.isChecked() && binding.checkBoxFour.isChecked()) {
                        scoring.setCorrectAnswer(1);
                    } else {
                        scoring.setWrongAnswer(1);
                    }
                    break;
                }
            case "4":
                Log.i("Total case 4", String.valueOf(scoring.getTotalScore()));
                Log.i("Attempts", String.valueOf(scoring.getViewedQuestion()));
                Log.i("Correct", String.valueOf(scoring.getCorrectAnswer()));
                if (!((binding.checkboxOne.isChecked() || binding.checkBoxTwo.isChecked()) && (binding.checkBoxThree.isChecked() || binding.checkBoxFour.isChecked()))) {
                    Toast.makeText(getApplicationContext(), "Please choose two answers", Toast.LENGTH_SHORT).show();
                } else {
                    scoring.setAnswerAttempt(1);
                    if (binding.checkboxOne.isChecked() && binding.checkBoxFour.isChecked()) {
                        scoring.setCorrectAnswer(1);
                    } else {
                        scoring.setWrongAnswer(1);
                    }
                    break;
                }

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
        }
    }
    public void results(View v){
        scoring.getTotalScore();

//        Intent intent = new Intent(this, ScoreActivity.class);
//        startActivity(intent);
    }
}
