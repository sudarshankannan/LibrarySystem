package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patron{
    String first;
    String last;
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    Long pin;
    int numBooks;
    float fines;
    //constructors
    Patron(){
        this.first = null;
        this.last = null;
        this.id = -1;
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
    public Long getPIN(){
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
    public void setPIN(Long pin){
        this.pin = pin;
    }
    public void setNumBooks(int numBooks){
        this.numBooks = numBooks;
    }
    public void setFines(float fines){
        this.fines = fines;
    }
}