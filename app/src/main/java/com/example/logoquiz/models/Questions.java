package com.example.logoquiz.models;

import java.util.List;

public class Questions {

    private String questions;
    private List<String> choiceList;
    private int questionsIndex;

    public Questions(String question, List<String> choiceList, int questionIndex) {
        this.setQuestions(question);
        this.setChoiceList(choiceList);
        this.setQuestionsIndex(questionIndex);
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
}
