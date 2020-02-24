package com.example.logoquiz.models;

import java.util.List;





public class Questions {

    private String questions;
   private List<String> choiceList;

//question name, question choices, index answer
    public Questions(String questions, List<String> choiceList, int questionsIndex) {
        this.questions = questions;
        this.choiceList = choiceList;
        this.questionsIndex = questionsIndex;
    }

   public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public List<String> getChoiceList() {
        return choiceList;
    }

   public void setChoiceList(List<String> choiceList) {
        this.choiceList = choiceList;
    }

    public int getQuestionsIndex() {
        return questionsIndex;
    }

    public void setQuestionsIndex(int questionsIndex) {
        this.questionsIndex = questionsIndex;
    }

    private int questionsIndex;


}
