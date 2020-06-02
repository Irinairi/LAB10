package com.company;

import com.ANIMAL;

public  class Dog extends ANIMAL {


    public int getChipNr() {
        return chipNr;
    }

    public void setChipNr(int chipNr) {
        this.chipNr = chipNr;
    }

    private int chipNr;

    public void speak(){
        System.out.println("hamham");
    }

    public void eat() { System.out.println("eat pedigree"); }

    @Override
    public void run() {
        System.out.println("run fast ");
    }


    public void sleep() {
        System.out.println("szzz.snores.");
    }

    public  void life (){System.out.println("in the your  house");}

}
