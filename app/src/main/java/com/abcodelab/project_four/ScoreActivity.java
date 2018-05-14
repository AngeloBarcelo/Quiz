package com.abcodelab.project_four;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.abcodelab.project_four.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {
    static int correctAnswer;
    static int wrongAnswer;
    static int answerAttempt;
    static int viewedQuestion;
    static int totalScore;

    public ScoreActivity(int correctAnswer, int wrongAnswer, int answerAttempt, int viewedQuestion, int totalScore) {
        this.correctAnswer += correctAnswer;
        this.wrongAnswer += wrongAnswer;
        this.answerAttempt += answerAttempt;
        this.viewedQuestion += viewedQuestion;
        this.totalScore = totalScore;
    }

    public ScoreActivity() {
    }

    public static int getCorrectAnswer() {
        return correctAnswer;
    }

    public static void setCorrectAnswer(int correctAnswer) {
        ScoreActivity.correctAnswer += correctAnswer;
    }

    public static int getWrongAnswer() {
        return wrongAnswer;
    }

    public static void setWrongAnswer(int wrongAnswer) {
        ScoreActivity.wrongAnswer += wrongAnswer;
    }

    public static int getAnswerAttempt() {
        return answerAttempt;
    }

    public static void setAnswerAttempt(int answerAttempt) {
        ScoreActivity.answerAttempt += answerAttempt;
    }

    public static int getViewedQuestion() {
        return viewedQuestion;
    }

    public static void setViewedQuestion(int viewedQuestion) {
        ScoreActivity.viewedQuestion += viewedQuestion;
    }

    public static double getTotalScore() {
        double ts = (double) getCorrectAnswer() / getAnswerAttempt() * 100.00;
        return ts;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityScoreBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_score);
        binding.correctNumb.setText(String.valueOf(getCorrectAnswer()));
        binding.wrongAnswerNumb.setText(String.valueOf(getWrongAnswer()));
        binding.questAnsweredNumb.setText(String.valueOf(getAnswerAttempt()));
        binding.timesViewedNumb.setText(String.valueOf(getViewedQuestion()));
        binding.finalScore.setText(String.valueOf((int) getTotalScore()) + "%");
    }
}
