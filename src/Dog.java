import com.ANIMAL;

public class Dog extends ANIMAL {


    private int chipNr ;
    private int weighr ;
    private int Height  ;
    private int MoodLevel ;
    private String Sleep ;
    private int healthlevel ;
    private int hungerlevel;
    private String RecreActivity ;




      public int  getChipNr(){
               return chipNr;

      }
      public void setChipNr(int chipNr) {
            this.chipNr=chipNr;
      }

        public int  getHungerlevel(){
             return hungerlevel;

      }
      public void sethungerlever(int hungerlevel){
        this.hungerlevel=hungerlevel;

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

        this.Height= height;
    }

    public int getMoodLevel() {

        return MoodLevel;
    }

    public void setMoodLevel(int moodLevel) {
       this.MoodLevel = moodLevel;
    }
    public String getSleep(){

        return Sleep;
    }
    public void setSleep(String Sleep) {

        this.Sleep = Sleep;
    }

    public int getHealthlevel() {

        return healthlevel;
    }

    public void setHealthlevel(int healthlevel) {

        this.healthlevel = healthlevel;
    }


    public String getRecreActivity() {
        return RecreActivity;
    }

    public void setRecreActivity(String RecreActivity) {

        this.RecreActivity = RecreActivity;
    }
    public void eat(){
          System.out.println("eating..");
    }

    public  void run (){
          System.out.println("running..");
      }
    public void sleep(){
          System.out.println("szzz..");
    }
}





