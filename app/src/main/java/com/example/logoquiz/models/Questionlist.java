package com.example.logoquiz.models;

import java.util.Arrays;
import java.util.List;

public class Questionlist {

   public static QuestionBank generateQuestions(){

       Questions question1 = new Questions("What is the name of the current french president?",
               Arrays.asList("François Hollande", "Emmanuel Macron", "Jacques Chirac", "François Mitterand"),
               1);

       Questions question2 = new Questions("How many countries are there in the European Union?",
               Arrays.asList("15", "24", "28", "32"),
               2);

       Questions question3 = new Questions("Who is the creator of the Android operating system?",
               Arrays.asList("Andy Rubin", "Steve Wozniak", "Jake Wharton", "Paul Smith"),
               0);

       Questions question4 = new Questions("When did the first man land on the moon?",
               Arrays.asList("1958", "1962", "1967", "1969"),
               3);

       Questions question5 = new Questions("What is the capital of Romania?",
               Arrays.asList("Bucarest", "Warsaw", "Budapest", "Berlin"),
               0);

       Questions question6 = new Questions("Who did the Mona Lisa paint?",
               Arrays.asList("Michelangelo", "Leonardo Da Vinci", "Raphael", "Carravagio"),
               1);

       Questions question7 = new Questions("In which city is the composer Frédéric Chopin buried?",
               Arrays.asList("Strasbourg", "Warsaw", "Paris", "Moscow"),
               2);

       Questions question8 = new Questions("What is the country top-level domain of Belgium?",
               Arrays.asList(".bg", ".bm", ".bl", ".be"),
               3);

       Questions question9 = new Questions("What is the house number of The Simpsons?",
               Arrays.asList("42", "101", "666", "742"),
               3);

       return new QuestionBank(Arrays.asList(question1,
               question2,
               question3,
               question4,
               question5,
               question6,
               question7,
               question8,
               question9));



   }


}
