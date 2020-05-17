package com.company;

public class MediStaff extends Human {

    private String Name;
    private int Age;
    private String profession ;
    private String programwork;
    private String treatment;
    private int price;
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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




}
