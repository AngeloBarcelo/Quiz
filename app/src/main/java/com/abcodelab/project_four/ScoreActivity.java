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
    int totalScore;

    public ScoreActivity(int correctAnswer, int wrongAnswer, int answerAttempt, int viewedQuestion) {
        ScoreActivity.correctAnswer +=correctAnswer;
        ScoreActivity.wrongAnswer +=wrongAnswer;
        ScoreActivity.answerAttempt +=answerAttempt;
        ScoreActivity.viewedQuestion +=viewedQuestion;

    }

    public ScoreActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityScoreBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_score);
        binding.correctNumb.setText(String.valueOf(getCorrectAnswer()));
        binding.wrongAnswerNumb.setText(String.valueOf(getWrongAnswer()));
        binding.questAnsweredNumb.setText(String.valueOf(getAnswerAttempt()));
        binding.timesViewedNumb.setText(String.valueOf(getViewedQuestion()));
        binding.finalScore.setText(String.valueOf(getTotalScore())+"%");


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

    public void setTotalScore(int correctAnswer, int answerAttempt) {
        int ts = (this.correctAnswer / this.answerAttempt) * 100;
        this.totalScore = ts;
    }

    public int getTotalScore() {
        int ts = ((100*correctAnswer) / (100*answerAttempt));
        return ts;
    }
}
