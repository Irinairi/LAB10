import com.ANIMAL;

public class cat extends ANIMAL {

    private int chipNr;


    public int getChipNr() {
        return chipNr;
    }



    public void eat(){
        System.out.println("fish..");
    }

    public  void run (){
        System.out.println("silent..");
    }

    public void sleep(){
        System.out.println("szzfffff z..");
    }

    public void speak (){System.out.println("Miow");}

    @Override
    public void life() {
        System.out.println("on the couch");
    }


}
