package com.akshar.project.onlineexamapp.data.model;

import java.util.ArrayList;

public class Question {
    public String question;
    public String answer;
    public ArrayList<String> mcq;


   public Question(String question,String answer,ArrayList<String> mcq){
        this.question=question;
        this.answer=answer;
        this.mcq=mcq;
    }

}
