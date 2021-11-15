package com.example.model;

public class Librarian{
    int userID;
    long pin;
    //constructors
    Librarian(){
        this.userID = -1;
        this.pin = -1;
    }
    //getters
    int getUserID(){
        return this.userID;
    }
    long getPIN(){
        return this.pin;
    }
    //setters
    void setFirstName(int userID){
        this.userID = userID;
    }
    void setPIN(long pin){
        this.pin = pin;
    }
}