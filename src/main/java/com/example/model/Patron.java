package com.example.model;

import javax.persistence.Entity;

@Entity
public class Patron{
    String first;
    String last;
    int id;
    int pin;
    int numBooks;
    float fines;
    //constructors
    Patron(){
        this.first = null;
        this.last = null;
        this.id = -1;
        this.pin = -1;
        this.numBooks = 0;
        this.fines = 0;
    }
    //getters
    public String getFirst(){
        return this.first;
    }
    public String getLast(){
        return this.last;
    }
    public int getId(){
        return this.id;
    }
    public int getPIN(){
        return this.pin;
    }
    public int getNumBooks(){
        return this.numBooks;
    }
    public float getFines(){
        return this.fines;
    }
    //setters
    public void setFirstName(String first){
        this.first = first;
    } 
    public void setLastName(String last){
        this.last = last;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setPIN(int pin){
        this.pin = pin;
    }
    public void setNumBooks(int numBooks){
        this.numBooks = numBooks;
    }
    public void setFines(float fines){
        this.fines = fines;
    }
}