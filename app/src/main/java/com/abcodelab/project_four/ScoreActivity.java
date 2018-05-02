package com.abcodelab.project_four;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.abcodelab.project_four.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {
    int correctAnswer;
    int wrongAnswer;
    int answerAttempt;
    int viewedQuestion;
    int totalScore;
    ActivityScoreBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_score);

        //binding = DataBindingUtil.setContentView(this, R.layout.activity_score);
        //setContentView(R.layout.activity_score);
    }
    public ScoreActivity(int correctAnswer,int wrongAnswer, int answerAttempt, int viewedQuestion ) {
        this.correctAnswer = correctAnswer;
        this.wrongAnswer = wrongAnswer;
        this.answerAttempt = answerAttempt;
        this.viewedQuestion = viewedQuestion;
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
        this.viewedQuestion += viewedQuestion;
    }
    public void setTotalScore(int correctAnswer,int answerAttempt) {
        totalScore = correctAnswer/answerAttempt;
        this.totalScore = totalScore;
        binding.textView8.setText(String.valueOf(getTotalScore()));
    }
    public int getTotalScore() {
        totalScore= correctAnswer/answerAttempt;
        return totalScore;
    }

}
