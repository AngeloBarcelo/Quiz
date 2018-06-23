/***************************************************************************************************
 *** Since question 1&2 are both radio buttons and the only thing that changes is the question   ***
 *** being asked. I combined the two questions into one activity instead of having two sep ones. ***
 **************************************************************************************************/

package com.abcodelab.project_four;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.abcodelab.project_four.databinding.RadioBtnLayoutBinding;
import com.abcodelab.project_four.databinding.ActivityMainBinding;

public class RadioQuestionActivity extends AppCompatActivity {
    int onePoint = 1;
    int randomBackgroundNumber = (int) (5.0 * Math.random());
    int randomQuestionGenerated = (int) (4.0 * Math.random());
    RadioBtnLayoutBinding binding;
    
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.radio_btn_layout);
        Bundle savedExtra = getIntent().getExtras();
        ScoreActivity.setViewedQuestion(onePoint);

        //Sets background image
        switch (randomBackgroundNumber) {
            case 0:
                binding.radioTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.mbbgfb26));
                break;
            case 1:
                binding.radioTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.mbbgfb27));
                break;
            case 2:
                binding.radioTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.mbbgfb28));
                break;
            case 3:
                binding.radioTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pinkyellowandblue));
                break;
            case 4:
                binding.radioTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.redblue));
                break;
            case 5:
                binding.radioTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.yellowgreenandblue));
                break;
        }
        String questionNumber = getString(R.string.question_numb_title);
        questionNumber = String.format(questionNumber, String.valueOf(savedExtra.get("questionPassed")));


        //Sets question one based on random number. There are five question choices for Q1 & Q2
        //Yes, a switch would have been better. But requirements dictated if/else statement
        switch (Integer.parseInt(String.valueOf(savedExtra.get("questionPassed")))) {

            //Title btn #1 is selected
            case 1:
                if (randomQuestionGenerated == 0) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText(R.string.rb_q1);
                    binding.answerOne.setText(R.string.rb_q1_a1);
                    binding.answerTwo.setText(R.string.rb_q1_a2);
                    binding.answerThree.setText(R.string.rb_q1_a3);
                    binding.answerFour.setText(R.string.rb_q1_a4);
                } else if (randomQuestionGenerated == 1) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText(R.string.rb_q2);
                    binding.answerOne.setText(R.string.rb_q1_a2);
                    binding.answerTwo.setText(R.string.rb_q1_a4);
                    binding.answerThree.setText(R.string.rb_q1_a3);
                    binding.answerFour.setText(R.string.rb_q1_a1);
                } else if (randomQuestionGenerated == 2) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText(R.string.rb_q3);
                    binding.answerOne.setText(R.string.rb_q1_a3);
                    binding.answerTwo.setText(R.string.rb_q1_a2);
                    binding.answerThree.setText(R.string.rb_q1_a1);
                    binding.answerFour.setText(R.string.rb_q1_a4);
                } else if (randomQuestionGenerated == 3) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText(R.string.rb_q4);
                    binding.answerOne.setText(R.string.rb_q1_a4);
                    binding.answerTwo.setText(R.string.rb_q1_a1);
                    binding.answerThree.setText(R.string.rb_q1_a2);
                    binding.answerFour.setText(R.string.rb_q1_a3);
                } else {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText(R.string.rb_q5);
                    binding.answerOne.setText(R.string.rb_q1_a4);
                    binding.answerTwo.setText(R.string.rb_q1_a3);
                    binding.answerThree.setText(R.string.rb_q1_a1);
                    binding.answerFour.setText(R.string.rb_q1_a2);
                }
                break;

            //Title btn #2 is selected
            case 2:
                if (randomQuestionGenerated == 0) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText(R.string.rb_q6);
                    binding.answerOne.setText(R.string.rb_q6_a1);
                    binding.answerTwo.setText(R.string.rb_q8_a1);
                    binding.answerThree.setText(R.string.rb_q7_a1);
                    binding.answerFour.setText(R.string.rb_q10_a1);
                } else if (randomQuestionGenerated == 1) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText(R.string.rb_q7);
                    binding.answerOne.setText(R.string.rb_q7_a1);
                    binding.answerTwo.setText(R.string.rb_q6_a1);
                    binding.answerThree.setText(R.string.rb_q8_a1);
                    binding.answerFour.setText(R.string.rb_q10_a1);
                } else if (randomQuestionGenerated == 2) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText(R.string.rb_q8);
                    binding.answerOne.setText(R.string.rb_q8_a1);
                    binding.answerTwo.setText(R.string.rb_q7_a1);
                    binding.answerThree.setText(R.string.rb_q6_a1);
                    binding.answerFour.setText(R.string.rb_q10_a1);
                } else if (randomQuestionGenerated == 3) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText(R.string.rb_q9);
                    binding.answerOne.setText(R.string.rb_q9_a1);
                    binding.answerTwo.setText(R.string.rb_q7_a1);
                    binding.answerThree.setText(R.string.rb_q8_a1);
                    binding.answerFour.setText(R.string.rb_q6_a1);
                } else {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText(R.string.rb_q10);
                    binding.answerOne.setText(R.string.rb_q10_a1);
                    binding.answerTwo.setText(R.string.rb_q8_a1);
                    binding.answerThree.setText(R.string.rb_q6_a1);
                    binding.answerFour.setText(R.string.rb_q7_a1);
                }
                break;
        }
    }

    public void submitRadioAnswers(View v) {
        Bundle savedExtra = getIntent().getExtras();
        String questionNumber = getString(R.string.question_numb_title);
        questionNumber = String.format(questionNumber, String.valueOf(savedExtra.get("questionPassed")));

        if (!binding.answerOne.isChecked() && !binding.answerTwo.isChecked() &&
                !binding.answerThree.isChecked() && !binding.answerFour.isChecked()) {
            Toast.makeText(getApplicationContext(), R.string.pick_something_please, Toast.LENGTH_SHORT).show();
        } else {
            //int receivedView = v.getId();
            ScoreActivity.setAnswerAttempt(onePoint);

            //This is the correct answer for Q1 &Q2
            if (binding.answerOne.isChecked()) {
                ScoreActivity.setCorrectAnswer(onePoint);
            } else {
                ScoreActivity.setWrongAnswer(onePoint);
            }

            if (Integer.parseInt(String.valueOf(savedExtra.get("questionPassed"))) == 1) {
                MainActivity.q1Answered = true;
            } else if (Integer.parseInt(String.valueOf(savedExtra.get("questionPassed"))) == 2) {
                MainActivity.q2Answered = true;
            }
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void finalResults(View v) {
        Intent intent = new Intent(this, ScoreActivity.class);
        startActivity(intent);
    }
}


