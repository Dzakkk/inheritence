package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public Main(){
        dateCreated = new java.util.Date();
    }

    public Main(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDataCreated(){
        return dateCreated;
    }

    public String toString(){
        return "Create on " + dateCreated + "\nColor: " +  color + " and filled: "
                + filled;
    }
}