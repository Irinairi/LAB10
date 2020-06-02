package com.company;

public abstract class Human {
    private String Name;
    private int Age;
    private String eyes;
    private String Walk;
    private String cares;

    private String Profession ;
    private String programwork;
    private String treatment;

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public String getProgramwork() {
        return programwork;
    }

    public void setProgramwork(String programwork) {
        this.programwork = programwork;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;



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

    public abstract void eat();

    public abstract void run ();

    public abstract void sleep();

    public abstract void hobby();

    public abstract  void genremuzic();
    public abstract void Sport();

    public abstract void book();

    public abstract void studies();



}
