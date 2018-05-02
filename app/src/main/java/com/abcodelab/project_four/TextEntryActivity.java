package com.abcodelab.project_four;

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
    ScoreActivity scoring = new ScoreActivity(0,0,0,0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.text_entry_activity);
    }

    public void submit(View v) {
        String enteredAnswer = binding.editText.getText().toString();

        scoring.setAnswerAttempt(1);
        if (enteredAnswer.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please enter an answer", Toast.LENGTH_SHORT).show();
        } else {
            if (enteredAnswer.equals("green")) {
                scoring.setCorrectAnswer(1);
                Toast.makeText(getApplicationContext(), "coorect", Toast.LENGTH_SHORT).show();
                Log.i("Message ", "good answer");
            } else {
                scoring.setWrongAnswer(1);
                Log.i("Message ", "wrong answer");
            }
        }
    }
}
