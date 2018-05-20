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
import android.view.View;
import android.widget.Toast;

import com.abcodelab.project_four.databinding.RadioBtnLayoutBinding;
import com.abcodelab.project_four.databinding.ActivityMainBinding;

public class RadioQuestionActivity extends AppCompatActivity {
    int zeroPoints;
    int onePoint = 1;
    int randomBackgroundNumber = (int) (5.0 * Math.random());
    int randomQuestionGenerated = 0;//(int) (4.0 * Math.random());
    RadioBtnLayoutBinding binding;
    ActivityMainBinding mainBinding;

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
                    binding.question.setText("Who was the first president of the United States?");
                    binding.answerOne.setText("George Washington");
                    binding.answerTwo.setText("John Denver");
                    binding.answerThree.setText("Who know's ");
                    binding.answerFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 1) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText("Who was the second president of the United States?");
                    binding.answerOne.setText("George Washington");
                    binding.answerTwo.setText("John Denver");
                    binding.answerThree.setText("Who know's ");
                    binding.answerFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 2) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText("Who was the third president of the United States?");
                    binding.answerOne.setText("George Washington");
                    binding.answerTwo.setText("John Denver");
                    binding.answerThree.setText("Who know's ");
                    binding.answerFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 3) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText("Who was the fourth president of the United States?");
                    binding.answerOne.setText("George Washington");
                    binding.answerTwo.setText("John Denver");
                    binding.answerThree.setText("Who know's ");
                    binding.answerFour.setText("Donald Trump");
                } else {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText("Who was the current president of the United States?");
                    binding.answerOne.setText("George Washington");
                    binding.answerTwo.setText("John Denver");
                    binding.answerThree.setText("Who know's ");
                    binding.answerFour.setText("Donald Trump");
                }
                break;

            //Title btn #2 is selected
            case 2:
                if (randomQuestionGenerated == 0) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText("Who was the first VP of the United States?");
                    binding.answerOne.setText("George Washington");
                    binding.answerTwo.setText("John Denver");
                    binding.answerThree.setText("Who know's ");
                    binding.answerFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 1) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText("Who was the second VP of the United States?");
                    binding.answerOne.setText("George Washington");
                    binding.answerTwo.setText("John Denver");
                    binding.answerThree.setText("Who know's ");
                    binding.answerFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 2) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText("Who was the third VP of the United States?");
                    binding.answerOne.setText("George Washington");
                    binding.answerTwo.setText("John Denver");
                    binding.answerThree.setText("Who know's ");
                    binding.answerFour.setText("Donald Trump");
                } else if (randomQuestionGenerated == 3) {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText("Who was the fourth VP of the United States?");
                    binding.answerOne.setText("George Washington");
                    binding.answerTwo.setText("John Denver");
                    binding.answerThree.setText("Who know's ");
                    binding.answerFour.setText("Donald Trump");
                } else {
                    binding.questionNumber.setText(questionNumber);
                    binding.question.setText("Who was the current VP of the United States?");
                    binding.answerOne.setText("George Washington");
                    binding.answerTwo.setText("John Denver");
                    binding.answerThree.setText("Who know's ");
                    binding.answerFour.setText("Donald Trump");
                }
                break;
        }
    }

    public void submitRadioAnswers(View v) {
        if (!binding.answerOne.isChecked() && !binding.answerTwo.isChecked() &&
                !binding.answerThree.isChecked() && !binding.answerFour.isChecked()) {
            Toast.makeText(getApplicationContext(), R.string.pick_something_please, Toast.LENGTH_SHORT).show();
        } else {
            int receivedView = v.getId();
            ScoreActivity.setAnswerAttempt(onePoint);

            //This is the correct answer for Q1 &Q2
            if (binding.answerOne.isChecked()) {
                ScoreActivity.setCorrectAnswer(onePoint);
            } else {
                ScoreActivity.setWrongAnswer(onePoint);
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


