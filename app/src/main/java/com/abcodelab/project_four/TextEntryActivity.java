package com.abcodelab.project_four;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.abcodelab.project_four.databinding.TextEntryActivityBinding;

public class TextEntryActivity extends AppCompatActivity {
    TextEntryActivityBinding binding;
    int onePoint = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.text_entry_activity);
        ScoreActivity.setViewedQuestion(onePoint);
    }

    public void submit(View v) {
        String enteredAnswer = binding.editText.getText().toString();

        ScoreActivity.setAnswerAttempt(onePoint);
        if (enteredAnswer.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please enter an answer", Toast.LENGTH_SHORT).show();

            //Non empty results
        } else {

            //Correct answer
            if (enteredAnswer.equalsIgnoreCase(("Jeff Bezos")) ||
                    enteredAnswer.equalsIgnoreCase("JB") ||
                    enteredAnswer.equalsIgnoreCase("Jeff") ||
                    enteredAnswer.equalsIgnoreCase("Bezos")) {
                ScoreActivity.setCorrectAnswer(onePoint);
            } else {
                ScoreActivity.setWrongAnswer(onePoint);
            }
            Intent intent = new Intent(this, ScoreActivity.class);
            startActivity(intent);
        }
    }
}
