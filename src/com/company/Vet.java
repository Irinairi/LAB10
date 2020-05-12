package com.company;

import com.ANIMAL;
import jdk.dynalink.beans.StaticClass;

public class Vet extends ANIMAL {


    private String profession ;
    private String programwork;
    private String treatment;
    private int price;



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



}

