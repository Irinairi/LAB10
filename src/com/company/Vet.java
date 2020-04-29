package com.company;

import jdk.dynalink.beans.StaticClass;

public class Vet {

    private String Namevet ;
    private String profession ;
    private String programwork;
    private String treatment;
    private int price;
    private int age;

    public String getNamevet(){

        return Namevet;
    }
    public void setNamevet(String Namevet)
    {
        this.Namevet=Namevet;
    }
    public String getProfession(){

       return  profession;
    }
    public void setProfession(String vete){
        this.profession=profession;
    }

    public String getTreatment(){

        return treatment;
    }
    public void setTreatment(String treatment){

        this.treatment=treatment;
    }
   public String getProgramwork(){

        return programwork;
   }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }


    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}

