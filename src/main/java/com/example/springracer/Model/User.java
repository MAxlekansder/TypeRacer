package com.example.springracer.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String time;
    private int percentCorrect;
    private String correctString;
    private String userText;

    public User(String name){
        this.name = name;
    }

    public User()
    {

    }

    public void setStats(String time, int percentCorrect, String correctString, String userText){
        this.time = time;
        this.percentCorrect = percentCorrect;
        this.correctString = correctString;
        this.userText = userText;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getPercentCorrect()
    {
        return percentCorrect;
    }

    public void setPercentCorrect(String percentCorrect)
    {
        this.percentCorrect = percentCorrect;
    }

    public String getCorrectString()
    {
        return correctString;
    }

    public void setCorrectString(String correctString)
    {
        this.correctString = correctString;
    }

    public String getUserText()
    {
        return userText;
    }

    public void setUserText(String userText)
    {
        this.userText = userText;
    }
}
