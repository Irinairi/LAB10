import com.company.Vet;

public class AppMain {

       public static void main(String[]args){
        Dog myPet = new Dog() ;
        myPet.setName("Archi") ;
       myPet.setAge(2);
       myPet.setColor("brown");
       myPet.setRace("huski");
       myPet.setChipNr(1222233);
       myPet.setHeight(80);
       myPet.sethungerlever(10);
       myPet.setMoodLevel(10);
       myPet.setRecreActivity("the ball");
       myPet.setSleep("hhhz");
       myPet.setWeighr(40);

       System.out.println(myPet.getName());
       System.out.println(myPet.getColor());
       System.out.println(myPet.getRace());
       System.out.println(myPet.getAge());
       System.out.println(myPet.getHeight());
       System.out.println(myPet.getHealthlevel());
       System.out.println(myPet.getHungerlevel());
       System.out.println(myPet.getChipNr());
       System.out.println(myPet.getWeighr());
       System.out.println(myPet.getMoodLevel());
       System.out.println(myPet.getRecreActivity());
       System.out.println(myPet.getChipNr());

       System.out.println("");

         Food myfood = new Food();

          myfood.setFavoriteFood("berries");
          myfood.setPrice(89);;
          myfood.setQuantity(4);
          myfood.setAvailabilitystok(14);


         System.out.println(myfood.getName());
         System.out.println(myfood.getFavoriteFood());
         System.out.println(myfood.getAvailabilitystok());
         System.out.println(myfood.getPrice());
         System.out.println();

         Girl myObject1 =  new Girl();
         myObject1.setNameGirl("Mary");
         myObject1.setWash("dog");
         myObject1.setTretment("");
         myObject1.setPlays("ball");
         myObject1.setHair("black");
         myObject1.setEyes("green");
         myObject1.setAge(14);
         System.out.println(myObject1.getnameGirl());
         System.out.println(myObject1.getPlays());
         System.out.println(myObject1.getwalkTheDog());
         System.out.println(myObject1.getage());


       Vet medi =new Vet();

        medi.setNamevet("Bud Marius");
         medi.setProfession("vete");
         medi.setPrice(100);
         medi.setTreatment("treatment");
         System.out.println(medi.getNamevet());
         System.out.println(medi.getTreatment());
         System.out.println(medi.getProgramwork());
         System.out.println(medi.getTreatment());
         System.out.println(medi.getPrice());
         System.out.println(medi.getAge());
         System.out.println("");

    }
}
