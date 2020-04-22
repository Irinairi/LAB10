import com.company.Vet;

public class AppMain {

       public static void main(String[]args){
        Dog myPet = new Dog() ;

         System.out.println(myPet.name);
         System.out.println(myPet.race);
         System.out.println(myPet.color);
         System.out.println(myPet.age);
         System.out.println(myPet.chipNr);
         System.out.println(myPet.weighr);
         System.out.println(myPet.height);
         System.out.println(myPet.moodlevel);
         System.out.println(myPet.sleep);
         System.out.println(myPet.hungerlevel);
        System.out.printf(myPet.preferredRecreationalActivity);

         DogFood Object = new DogFood();

         System.out.println(Object.foodName);
         System.out.println(Object.favoriteFood);
         System.out.println(Object.quantity);
         System.out.println(Object.Availabilitystok);
         System.out.println(Object.price);


         Girl myObject =  new Girl();

         System.out.println(myObject.nameGirl);
         System.out.println(myObject.go);
         System.out.println(myObject.wash);
         System.out.println(myObject.tretment);
         System.out.println(myObject.plays);
         System.out.println(myObject.adopt);



         Vet medi =new Vet();

         System.out.println(medi.namevet);
         System.out.println(medi.profession);
         System.out.println(medi.programwork);
         System.out.println(medi.treatment);
         System.out.println();
    }


    }

