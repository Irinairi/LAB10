package com.company;

public class Human {
    private String Name;
    private int Age;
    private String eyes;
    private String Walk;
    private String cares;



    public String getSpeak() {
        return Speak;
    }

    public void setSpeak(String speak) {
        Speak = speak;
    }

    private String Speak;

    public String getWalk() {
        return Walk;
    }

    public void setWalk(String walk) {
        Walk = walk;
    }

    public String getCares() {
        return cares;
    }

    public void setCares(String cares) {
        this.cares = cares;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    private String hair;

    public String getName() {

        return Name;
    }

    public void setName(String name) {

        this.Name = name;
    }

    public int getAge() {

        return Age;
    }

    public void setAge(int  age) {

    this.Age = age;
    }

    public String getEyes() {

        return eyes;
    }

    public void setEyes(String eyes) {

        this.eyes = eyes;
    }

    public void eat(){
        System.out.println(" food");
    }

    public  void run (){ System.out.println(" "); }

    public void sleep(){
        System.out.println(" sleep");
    }

    public void hobby(){ System.out.println(" I like..");}

    public void genremuzic(){System.out.println("all ");}

    public void Sport(){System.out.println("fodbal");}

    public void book(){System.out.println(" the book");}

    public void studies(){System.out.println(" studies");}



}
