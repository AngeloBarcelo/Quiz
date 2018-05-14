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
    int randomQuestionGenerated = 0;//(int) (4.0 * Math.random());
    CheckboxLayoutBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.checkbox_layout);
        Bundle savedExtra = getIntent().getExtras();

        ScoreActivity.setViewedQuestion(onePoint);

        //Sets background image
        switch (randomBackgroundNumber) {
            case 0:
                binding.checkboxTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.mbbgfb26));
                break;
            case 1:
                binding.checkboxTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.mbbgfb27));
                break;
            case 2:
                binding.checkboxTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.mbbgfb28));
                break;
            case 3:
                binding.checkboxTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.pinkyellowandblue));
                break;
            case 4:
                binding.checkboxTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.redblue));
                break;
            case 5:
                binding.checkboxTopLayout.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.yellowgreenandblue));
                break;
        }
        String questionNumber = getString(R.string.question_numb_title);
        questionNumber = String.format(questionNumber, String.valueOf(savedExtra.get("questionPassed")));

        //Sets question one based on random number. There are five question choices for Q1 & Q2
        //Yes, a switch would have been better. But requirements dictated if/then statement
        switch (Integer.parseInt(String.valueOf(savedExtra.get("questionPassed")))) {
            case 3:
                if (randomQuestionGenerated == 0) {
                    binding.questionNumber.setText(questionNumber);
                    binding.qustionText.setText("Who was the first president of the United States?");
                    binding.checkboxOne.setText("George Washington");
                    binding.checkBoxTwo.setText("John Denver");
                    binding.checkBoxThree.setText("Who know's ");
                    binding.checkBoxFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 1) {
                    binding.questionNumber.setText(questionNumber);
                    binding.qustionText.setText("Who was the second president of the United States?");
                    binding.checkboxOne.setText("George Washington");
                    binding.checkBoxTwo.setText("John Denver");
                    binding.checkBoxThree.setText("Who know's ");
                    binding.checkBoxFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 2) {
                    binding.questionNumber.setText(questionNumber);
                    binding.qustionText.setText("Who was the third president of the United States?");
                    binding.checkboxOne.setText("George Washington");
                    binding.checkBoxTwo.setText("John Denver");
                    binding.checkBoxThree.setText("Who know's ");
                    binding.checkBoxFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 3) {
                    binding.questionNumber.setText(questionNumber);
                    binding.qustionText.setText("Who was the fourth president of the United States?");
                    binding.checkboxOne.setText("George Washington");
                    binding.checkBoxTwo.setText("John Denver");
                    binding.checkBoxThree.setText("Who know's ");
                    binding.checkBoxFour.setText("Donald Trump");
                } else {
                    binding.questionNumber.setText(questionNumber);
                    binding.qustionText.setText("Who was the current president of the United States?");
                    binding.checkboxOne.setText("George Washington");
                    binding.checkBoxTwo.setText("John Denver");
                    binding.checkBoxThree.setText("Who know's ");
                    binding.checkBoxFour.setText("Donald Trump");
                }
                break;

            case 4:
                if (randomQuestionGenerated == 0) {
                    binding.questionNumber.setText(questionNumber);
                    binding.qustionText.setText("Who was the first VP of the United States?");
                    binding.checkboxOne.setText("George Washington");
                    binding.checkBoxTwo.setText("John Denver");
                    binding.checkBoxThree.setText("Who know's ");
                    binding.checkBoxFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 1) {
                    binding.questionNumber.setText(questionNumber);
                    binding.qustionText.setText("Who was the 2nd VP of the United States?");
                    binding.checkboxOne.setText("George Washington");
                    binding.checkBoxTwo.setText("John Denver");
                    binding.checkBoxThree.setText("Who know's ");
                    binding.checkBoxFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 2) {
                    binding.questionNumber.setText(questionNumber);
                    binding.qustionText.setText("Who was the 3rd VP of the United States?");
                    binding.checkboxOne.setText("George Washington");
                    binding.checkBoxTwo.setText("John Denver");
                    binding.checkBoxThree.setText("Who know's ");
                    binding.checkBoxFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 3) {
                    binding.questionNumber.setText(questionNumber);
                    binding.qustionText.setText("Who was the 4th VP of the United States?");
                    binding.checkboxOne.setText("George Washington");
                    binding.checkBoxTwo.setText("John Denver");
                    binding.checkBoxThree.setText("Who know's ");
                    binding.checkBoxFour.setText("Donald Trump");
                } else {
                    binding.questionNumber.setText(questionNumber);
                    binding.qustionText.setText("Who was the 5th VP of the United States?");
                    binding.checkboxOne.setText("George Washington");
                    binding.checkBoxTwo.setText("John Denver");
                    binding.checkBoxThree.setText("Who know's ");
                    binding.checkBoxFour.setText("Donald Trump");
                }
                break;
        }
    }

    //Checks question 3&4 answers
    public void submitCheckboxAnswers(View v) {
        //Nothing selected
        if (!binding.checkboxOne.isChecked() && !binding.checkBoxTwo.isChecked() &&
                !binding.checkBoxThree.isChecked() && !binding.checkBoxFour.isChecked()) {
            Toast.makeText(getApplicationContext(), R.string.pick_something_please, Toast.LENGTH_SHORT).show();
        }
        //Two items selected
        else if ((binding.checkboxOne.isChecked() && binding.checkBoxTwo.isChecked()) ||
                (binding.checkBoxThree.isChecked() && binding.checkBoxFour.isChecked()) ||
                (binding.checkboxOne.isChecked() || binding.checkBoxTwo.isChecked()) &&
                        (binding.checkBoxThree.isChecked() || binding.checkBoxFour.isChecked())) {
            ScoreActivity.setAnswerAttempt(onePoint);

            //Correct answer
            if (binding.checkboxOne.isChecked() && binding.checkBoxFour.isChecked()) {
                ScoreActivity.setCorrectAnswer(onePoint);
            } else {
                ScoreActivity.setWrongAnswer(onePoint);
            }
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), R.string.select_one_more, Toast.LENGTH_SHORT).show();
        }
    }

    public void results(View v) {
        Intent intent = new Intent(this, ScoreActivity.class);
        startActivity(intent);
    }
}
