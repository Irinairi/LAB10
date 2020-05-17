import com.ANIMAL;

public class Dog extends ANIMAL {


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

    public void run() {
        System.out.println("fast..");
    }

    public void sleep() {
        System.out.println("szzz..");
    }

    public  void life (){System.out.println("in the house");}



}






