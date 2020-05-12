import com.ANIMAL;

public class cat extends ANIMAL  {

    private int chipNr ;
    private int weighr ;
    private int Height  ;
    private int MoodLevel ;
    private String Sleep ;
    private int healthlevel ;
    private int hungerlevel;
    private String RecreActivity ;

    public int getChipNr() {
        return chipNr;
    }

    public void setChipNr(int chipNr) {
        this.chipNr = chipNr;
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
        return hungerlevel;
    }

    public void setHungerlevel(int hungerlevel) {
        this.hungerlevel = hungerlevel;
    }

    public String getRecreActivity() {
        return RecreActivity;
    }

    public void setRecreActivity(String recreActivity) {
        RecreActivity = recreActivity;
    }
    public void eat(){
        System.out.println("eating food cat..");
    }

    public  void run (){
        System.out.println("silent..");
    }
    public void sleep(){
        System.out.println("szzz..");
    }

}
