package com;

public class ANIMAL {

    private String Name ;
    private int age ;
    private String color ;
    private String race;
    private int weighr ;
    private int Height  ;
    private int MoodLevel ;
    private String Sleep ;
    private int healthlevel ;
    private int Hungerlevel;
    //private String Speak;



   // public String getSpeak() {
      //  return Speak;
  //  }

    //public void setSpeak(String speak) {
       // Speak = speak;
   // }



    public String getRace() {

        return race;
    }

    public void setRace(String race) {

        this.race = race;
    }



    public int getWeighr() {
        return weighr;
    }

    public void setWeighr(int weighr) {
        this.weighr = weighr;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getMoodLevel() {
        return MoodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        MoodLevel = moodLevel;
    }

    public String getSleep() {
        return Sleep;
    }

    public void setSleep(String sleep) {
        Sleep = sleep;
    }

   public int getHealthlevel() {
        return healthlevel;
    }

    public void setHealthlevel(int healthlevel) {
       this.healthlevel = healthlevel;
    }

    public int getHungerlevel() {

        return Hungerlevel;
    }

    public void setHungerlevel(int hungerlevel) {

        this.Hungerlevel = hungerlevel;
    }

    public String getRecreActivity() {
        return RecreActivity;
    }

    public void setRecreActivity(String recreActivity) {
        RecreActivity = recreActivity;
    }

    private String RecreActivity ;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }



    public void eat(){
        System.out.println("eating ");
    }

    public  void run (){
        System.out.println("running.");
    }

    public void sleep(){
        System.out.println("sleaping..");
    }

    public void speak (){System.out.println("sunete");}

    public  void life (){System.out.println("earth");}






}






