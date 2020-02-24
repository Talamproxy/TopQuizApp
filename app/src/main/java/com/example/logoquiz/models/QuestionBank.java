package com.example.logoquiz.models;

import java.util.Collections;
import java.util.List;

public class QuestionBank {
    private List<Questions> mQuestionList;
    private   int mNextQuestionIndex;

    public QuestionBank(List<Questions> questionList)
    {
        mQuestionList = questionList;
        Collections.shuffle(mQuestionList);
        mNextQuestionIndex=0;



    }

    public Questions getQuestions(){
        if(mNextQuestionIndex==mQuestionList.size()){
            mNextQuestionIndex=0;
        }

            return mQuestionList.get(mNextQuestionIndex++);

    }

}
