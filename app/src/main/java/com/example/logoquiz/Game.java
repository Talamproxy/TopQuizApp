package com.example.logoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.logoquiz.models.QuestionBank;
import com.example.logoquiz.models.Questionlist;
import com.example.logoquiz.models.Questions;


import java.util.Arrays;

public class Game extends AppCompatActivity implements View.OnClickListener {
    public QuestionBank mQuestionlist;
    public Button mButton1, mButton2, mButton3,mButton4;
    public Questions mCurrentQuestions;
    public TextView mQuizText, mPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionlist= Questionlist.generateQuestions();
        mButton1 =  findViewById(R.id.btn_quiz_1);
        mButton2 = findViewById(R.id.btn_quiz_2);
        mButton3 = findViewById(R.id.btn_quiz_3);
        mButton4 = findViewById(R.id.btn_quiz_4);
        mQuizText = findViewById(R.id.question_text);
        mPoints =findViewById(R.id.points);


        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);

        mButton1.setTag(0);
        mButton2.setTag(1);
        mButton3.setTag(2);
        mButton4.setTag(3);

        mCurrentQuestions = mQuestionlist.getQuestions();
        this.displayQuestion(mCurrentQuestions);
    }

    private void displayQuestion(final Questions questions){
        mQuizText.setText(questions.getQuestions());
        mButton1.setText(questions.getChoiceList().get(0));
        mButton2.setText(questions.getChoiceList().get(1));
        mButton3.setText(questions.getChoiceList().get(2));
        mButton4.setText(questions.getChoiceList().get(3));


    }
    public void functpoints(){
        int points=0;


        String stripoints=getText(points).toString();
        mPoints.setText(stripoints);


    }



    @Override
    public void onClick(View v) {
        int ansIndex=(int) v.getTag();
        if(ansIndex== mQuestionlist.getQuestions().getQuestionsIndex()){
            Toast.makeText(Game.this,"correct!", Toast.LENGTH_LONG).show();
            Intent refresh=new Intent(Game.this,Game.class);
            String status="Correct";
            mPoints.setText(status);
            startActivity(refresh);
        }else{

            Toast.makeText(Game.this,"Wrong !", Toast.LENGTH_LONG).show();
            Intent refresh=new Intent(Game.this,Game.class);
            String status="Wrong";
            mPoints.setText(status);
            startActivity(refresh);


        }

    }
}
