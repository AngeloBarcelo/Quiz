/***************************************************************************************************
 *** Since question 3&4 are both checkbox view and the only thing that changes is the question   ***
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
import android.view.View;
import android.widget.Toast;

import com.abcodelab.project_four.databinding.CheckboxLayoutBinding;

public class CheckboxQuestionActivity extends AppCompatActivity {
    int onePoint = 1;
    int randomBackgroundNumber = (int) (5.0 * Math.random());
    int randomQuestionGenerated = (int) (4.0 * Math.random());
    CheckboxLayoutBinding binding;
    Bundle savedExtra;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.checkbox_layout);
        savedExtra = getIntent().getExtras();
        ScoreActivity.setViewedQuestion(onePoint);

        //Sets background image
        switch (randomBackgroundNumber) {
            case 0:
                binding.checkboxTopLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.mbbgfb26));
                break;
            case 1:
                binding.checkboxTopLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.mbbgfb27));
                break;
            case 2:
                binding.checkboxTopLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.mbbgfb28));
                break;
            case 3:
                binding.checkboxTopLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.pinkyellowandblue));
                break;
            case 4:
                binding.checkboxTopLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.redblue));
                break;
            case 5:
                binding.checkboxTopLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.yellowgreenandblue));
                break;
        }
        String questionNumber = getString(R.string.question_numb_title);
        questionNumber = String.format(questionNumber, String.valueOf(savedExtra.get("questionPassed")));
        binding.questionNumber.setText(questionNumber);

        //Sets question one based on random number. There are five question choices for Q3 & Q4
        switch (Integer.parseInt(String.valueOf(savedExtra.get("questionPassed")))) {
            case 3:
                if (randomQuestionGenerated == 0) {
                    binding.cbQuestionText.setText(R.string.cb_q1);
                    binding.cbAnswer1.setText(R.string.cb_q1_a);
                    binding.cbAnswer2.setText(R.string.cb_q1_b);
                    binding.cbAnswer3.setText(R.string.cb_q1_c);
                    binding.cbAnswer4.setText(R.string.cb_q1_d);
                } else if (randomQuestionGenerated == 1) {
                    binding.cbQuestionText.setText(R.string.cb_q2);
                    binding.cbAnswer1.setText(R.string.cb_q2_a);
                    binding.cbAnswer2.setText(R.string.cb_q2_b);
                    binding.cbAnswer3.setText(R.string.cb_q2_c);
                    binding.cbAnswer4.setText(R.string.cb_q2_d);
                } else if (randomQuestionGenerated == 2) {
                    binding.cbQuestionText.setText(R.string.cb_3);
                    binding.cbAnswer1.setText(R.string.cb_q3_a);
                    binding.cbAnswer2.setText(R.string.cb_q3_b);
                    binding.cbAnswer3.setText(R.string.cb_q3_c);
                    binding.cbAnswer4.setText(R.string.cb_q3_d);
                } else if (randomQuestionGenerated == 3) {
                    binding.cbQuestionText.setText(R.string.cb_q4);
                    binding.cbAnswer1.setText(R.string.cb_q4_a);
                    binding.cbAnswer2.setText(R.string.cb_q4_b);
                    binding.cbAnswer3.setText(R.string.cb_q4_c);
                    binding.cbAnswer4.setText(R.string.cb_q4_d);
                } else {
                    binding.cbQuestionText.setText(R.string.cb_q5);
                    binding.cbAnswer1.setText(R.string.cb_q5_a);
                    binding.cbAnswer2.setText(R.string.cb_q5_b);
                    binding.cbAnswer3.setText(R.string.cb_q5_c);
                    binding.cbAnswer4.setText(R.string.cb_q5_d);
                }
                break;

            case 4:
                if (randomQuestionGenerated == 0) {
                    binding.cbQuestionText.setText(R.string.cb_q6);
                    binding.cbAnswer1.setText(R.string.cb_q6_a);
                    binding.cbAnswer2.setText(R.string.cb_q6_b);
                    binding.cbAnswer3.setText(R.string.cb_q6_c);
                    binding.cbAnswer4.setText(R.string.cb_q6_d);
                } else if (randomQuestionGenerated == 1) {
                    binding.cbQuestionText.setText(R.string.cb_q7);
                    binding.cbAnswer1.setText(R.string.cb_q7_a);
                    binding.cbAnswer2.setText(R.string.cb_q7_b);
                    binding.cbAnswer3.setText(R.string.cb_q7_c);
                    binding.cbAnswer4.setText(R.string.cb_q7_d);
                } else if (randomQuestionGenerated == 2) {
                    binding.cbQuestionText.setText(R.string.cb_q8);
                    binding.cbAnswer1.setText(R.string.cb_q8_a);
                    binding.cbAnswer2.setText(R.string.cb_q8_b);
                    binding.cbAnswer3.setText(R.string.cb_q8_c);
                    binding.cbAnswer4.setText(R.string.cb_q8_d);
                } else if (randomQuestionGenerated == 3) {
                    binding.cbQuestionText.setText(R.string.cb_q9);
                    binding.cbAnswer1.setText(R.string.cb_q9_a);
                    binding.cbAnswer2.setText(R.string.cb_q9_b);
                    binding.cbAnswer3.setText(R.string.cb_q9_c);
                    binding.cbAnswer4.setText(R.string.cb_q9_d);
                } else {
                    binding.cbQuestionText.setText(R.string.cb_q10);
                    binding.cbAnswer1.setText(R.string.cb_q10_a);
                    binding.cbAnswer2.setText(R.string.cb_q10_b);
                    binding.cbAnswer3.setText(R.string.cb_q10_c);
                    binding.cbAnswer4.setText(R.string.cb_q10_d);
                }
                break;
        }
    }

    //Checks question 3&4 answers
    public void submitCheckboxAnswers(View v) {

        //Nothing selected
        if (!binding.cbAnswer1.isChecked() && !binding.cbAnswer2.isChecked() &&
                !binding.cbAnswer3.isChecked() && !binding.cbAnswer4.isChecked()) {
            Toast.makeText(getApplicationContext(),
                    R.string.pick_something_please, Toast.LENGTH_SHORT).show();
        }

        //Two items selected
        else if ((binding.cbAnswer1.isChecked() && binding.cbAnswer2.isChecked()) ||
                (binding.cbAnswer3.isChecked() && binding.cbAnswer4.isChecked()) ||
                (binding.cbAnswer1.isChecked() || binding.cbAnswer2.isChecked()) &&
                        (binding.cbAnswer3.isChecked() || binding.cbAnswer4.isChecked())) {
            ScoreActivity.setAnswerAttempt(onePoint);

            //Correct answer
            if (binding.cbAnswer1.isChecked() && binding.cbAnswer4.isChecked()) {
                ScoreActivity.setCorrectAnswer(onePoint);
            } else {
                ScoreActivity.setWrongAnswer(onePoint);
            }
            String questionNumber = getString(R.string.question_numb_title);
            questionNumber = String.format(questionNumber, String.valueOf(savedExtra.get("questionPassed")));

            if (Integer.parseInt(String.valueOf(savedExtra.get("questionPassed"))) == 3) {
                MainActivity.q3Answered = true;
            } else if (Integer.parseInt(String.valueOf(savedExtra.get("questionPassed"))) == 4) {
                MainActivity.q4Answered = true;
            }
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), R.string.select_one_more, Toast.LENGTH_SHORT).show();
        }
    }
}