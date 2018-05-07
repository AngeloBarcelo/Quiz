package com.abcodelab.project_four;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.abcodelab.project_four.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {
    int correctAnswer =99;
    int wrongAnswer =99;
    int answerAttempt =99;
    int viewedQuestion =99;
    int totalScore;

    ActivityScoreBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_score);

        Bundle savedExtra = getIntent().getExtras();
        correctAnswer += Integer.parseInt(String.valueOf(savedExtra.get("correctAnswer")));

        //binding = DataBindingUtil.setContentView(this, R.layout.activity_score);
        //setContentView(R.layout.activity_score);
    }
    public ScoreActivity(int correctAnswer,int wrongAnswer, int answerAttempt, int viewedQuestion ) {
        this.correctAnswer += correctAnswer;
        this.wrongAnswer += wrongAnswer;
        this.answerAttempt += answerAttempt;
        this.viewedQuestion += viewedQuestion;
    }
    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer += correctAnswer;
    }

    public int getWrongAnswer() {
        return wrongAnswer;
    }

    public void setWrongAnswer(int wrongAnswer) {
        this.wrongAnswer += wrongAnswer;
    }

    public int getAnswerAttempt() {
        return answerAttempt;
    }

    public void setAnswerAttempt(int answerAttempt) {
        this.answerAttempt += answerAttempt;
    }

    public int getViewedQuestion() {
        return viewedQuestion;
    }

    public void setViewedQuestion(int viewedQuestion) {
        this.viewedQuestion = viewedQuestion;
    }
    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}
