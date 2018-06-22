/***************************************************************************************************
 *** Since question 5&6 are both text questions and the only thing that changes is the question  ***
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
import com.abcodelab.project_four.databinding.TextEntryActivityBinding;

public class TextEntryActivity extends AppCompatActivity {
    TextEntryActivityBinding binding;
    int onePoint = 1;
    int randomBackgroundNumber = (int) (5.0 * Math.random());
    int randomQuestionGenerated = (int) (4.0 * Math.random());

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.text_entry_activity);
        Bundle savedExtra = getIntent().getExtras();
        ScoreActivity.setViewedQuestion(onePoint);

        String questionNumber = getString(R.string.question_numb_title);
        questionNumber = String.format(questionNumber,
                String.valueOf(savedExtra.get("questionPassed")));
        binding.questionNumber.setText(questionNumber);

        switch (randomBackgroundNumber) {
            case 0:
                binding.parentLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.mbbgfb26));
                break;
            case 1:
                binding.parentLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.mbbgfb27));
                break;
            case 2:
                binding.parentLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.mbbgfb28));
                break;
            case 3:
                binding.parentLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.pinkyellowandblue));
                break;
            case 4:
                binding.parentLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.redblue));
                break;
            case 5:
                binding.parentLayout.setBackground(ContextCompat.
                        getDrawable(getApplicationContext(), R.drawable.yellowgreenandblue));
                break;
        }
        switch (Integer.parseInt(String.valueOf(savedExtra.get("questionPassed")))) {
            case 5:
                if (randomQuestionGenerated == 0) {
                    binding.questionText.setText(R.string.TQ_Q1);
                } else if (randomQuestionGenerated == 1) {
                    binding.questionText.setText(R.string.tq_q2);
                } else if (randomQuestionGenerated == 2) {
                    binding.questionText.setText(R.string.tq_q3);
                } else if (randomQuestionGenerated == 3) {
                    binding.questionText.setText(R.string.tq_q4);
                } else {
                    binding.questionText.setText(R.string.tq_q5);
                }
                break;

            case 6:
                if (randomQuestionGenerated == 0) {
                    binding.questionText.setText(R.string.tq_q6);
                } else if (randomQuestionGenerated == 1) {
                    binding.questionText.setText(R.string.tq_q7);
                } else if (randomQuestionGenerated == 2) {
                    binding.questionText.setText(R.string.tq_q8);
                } else if (randomQuestionGenerated == 3) {
                    binding.questionText.setText(R.string.tq_q9);
                } else {
                    binding.questionText.setText(R.string.tq_q10);
                }
                break;
        }
    }

    public void submit(View v) {
        if (binding.questionAnswer.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), R.string.enter_answer, Toast.LENGTH_SHORT).show();

            //Non empty results
        } else {

            //Checks question and answer at the same time
            ScoreActivity.setAnswerAttempt(onePoint);
            if (binding.questionText.getText().toString().equalsIgnoreCase(getResources().getString(R.string.TQ_Q1)) &&
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q1_answer1)) ||
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q1_answer2)) ||
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q1_answer3)) ||
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q1_answer4))) {
                ScoreActivity.setCorrectAnswer(onePoint);

            } else if (binding.questionText.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q2)) &&
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q2_answer))) {
                ScoreActivity.setCorrectAnswer(onePoint);

            } else if (binding.questionText.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q3)) &&
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q3_answer1)) ||
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q3_answer2))) {
                ScoreActivity.setCorrectAnswer(onePoint);

            } else if (binding.questionText.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q4)) &&
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q4_answer))) {
                ScoreActivity.setCorrectAnswer(onePoint);

            } else if (binding.questionText.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q5)) &&
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q5_answer))) {
                ScoreActivity.setCorrectAnswer(onePoint);

            } else if (binding.questionText.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q6)) &&
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q6_answer))) {
                ScoreActivity.setCorrectAnswer(onePoint);

            } else if (binding.questionText.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q7)) &&
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q7_answer))) {
                ScoreActivity.setCorrectAnswer(onePoint);

            } else if (binding.questionText.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q8)) &&
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q8_answer))) {
                ScoreActivity.setCorrectAnswer(onePoint);

            } else if (binding.questionText.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q9)) &&
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q9_answer))) {
                ScoreActivity.setCorrectAnswer(onePoint);

            } else if (binding.questionText.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q10)) &&
                    binding.questionAnswer.getText().toString().equalsIgnoreCase(getResources().getString(R.string.tq_q10_answer))) {
                ScoreActivity.setCorrectAnswer(onePoint);

            } else {
                ScoreActivity.setWrongAnswer(onePoint);
            }

            Bundle savedExtra = getIntent().getExtras();
            String questionNumber = getString(R.string.question_numb_title);
            questionNumber = String.format(questionNumber, String.valueOf(savedExtra.get("questionPassed")));
            if (Integer.parseInt(String.valueOf(savedExtra.get("questionPassed"))) == 1) {
                MainActivity.q1Answered = true;
            } else if (Integer.parseInt(String.valueOf(savedExtra.get("questionPassed"))) == 2) {
                MainActivity.q2Answered = true;
            }
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
