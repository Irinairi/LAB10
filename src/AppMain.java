import com.company.*;


public class AppMain {

    public static void main(String[] args) {
        Dog myPet = new Dog();
        myPet.setName("Archi");
        myPet.setAge(2);
        myPet.setColor("brown");
        myPet.setRace("huski");
        myPet.setChipNr(1222233);
        myPet.setHeight(80);
        myPet.setMoodLevel(10);
        myPet.setRecreActivity("the ball");
        myPet.setSleep("hhhz");
        myPet.setWeighr(40);
        myPet.eat();
        myPet.run();
        myPet.sleep();


        System.out.println(myPet.getName());
        System.out.println(myPet.getColor());
        System.out.println(myPet.getRace());
        System.out.println(myPet.getAge());
        System.out.println(myPet.getHeight());
        System.out.println(myPet.getHealthlevel());
        System.out.println(myPet.getChipNr());
        System.out.println(myPet.getWeighr());
        System.out.println(myPet.getMoodLevel());
        System.out.println(myPet.getRecreActivity());
        System.out.println(myPet.getSleep());




        Duck myanim = new Duck();
        myanim.setName("Ratusca urata");
        myanim.setRace("rata salbatica");
        myanim.setAge(3);
        myanim.setColor("white");
        myanim.setHeight(4);
        myanim.setHungerlevel(10);
        myanim.eat();
        myanim.run();
        myanim.sleep();
        myanim.life();

        System.out.println(myanim.getName());
        System.out.println(myanim.getRace());
        System.out.println(myanim.getAge());
        System.out.println(myanim.getColor());
        System.out.println(myanim.getHeight());
        System.out.println(myanim.getHungerlevel());


        Food myfood = new Food();

        myfood.setPrice(89);
        myfood.setQuantity(4);
        myfood.setAvailabilitystok(14);

        System.out.println(myfood.getName());
        System.out.println(myfood.getAvailabilitystok());
        System.out.println(myfood.getPrice());
        System.out.println();

        FoodDog objectdog = new FoodDog();
        objectdog.setName(" Bones");
        objectdog.setQuantity(1);
        objectdog.setPrice(70);
        System.out.println(objectdog.getName());
        System.out.println(objectdog.getQuantity());
        System.out.println(objectdog.getQuantity());
        System.out.println(objectdog.getPrice());

        FoodCat objectcat = new FoodCat();
        objectcat.setName("fish ");
        objectcat.setPrice(20);
        objectcat.setQuantity(1);
        objectcat.setAvailabilitystok(3);

        System.out.println(objectcat.getName());
        System.out.println(objectcat.getPrice());
        System.out.println(objectcat.getQuantity());
        System.out.println(objectcat.getAvailabilitystok());


        Girl myObject1 = new Girl();
        myObject1.setName("Mary");
        myObject1.setWalk(" in the forest whit dog");
        myObject1.setCares(" love animal");
        myObject1.setHair("black");
        myObject1.setEyes("green");
        myObject1.setAge(14);
        myObject1.setSpeak("English and French");
        myObject1.genremuzic();
        myObject1.hobby();
        myObject1.Sport();
        myObject1.book();
        myObject1.studies();
        System.out.println(myObject1.getName());
        System.out.println(myObject1.getWalk());
        System.out.println(myObject1.getEyes());
        System.out.println(myObject1.getHair());
        System.out.println(myObject1.getAge());
        System.out.println(myObject1.getSpeak());


        Boy myObject = new Boy();
        myObject.setName("Alex");
        myObject.setAge(17);
        myObject.setEyes("black");
        myObject.setHair("brown");
        myObject.setCares(" love animal");
        myObject.setWalk("take the dog for a walk");
        myObject.Speak();
        myObject.hobby();
        myObject.genremuzic();
        myObject.Sport();

        System.out.println(myObject.getName());
        System.out.println(myObject.getAge());
        System.out.println(myObject.getEyes());
        System.out.println(myObject.getHair());
        System.out.println(myObject.getCares());
        System.out.println(myObject.getWalk());


        Vet medi = new Vet();

        medi.setName("Bud Marius");
        medi.setProfession("vete");
        medi.setAge(35);
        medi.setPrice(100);
        medi.setTreatment("treatment");
        medi.genremuzic();
        medi.hobby();
        medi.Sport();
        medi.drink();

        System.out.println(medi.getName());
        System.out.println(medi.getTreatment());
        System.out.println(medi.getPrice());
        System.out.println(medi.getAge());


        cat myobject = new cat();

        myobject.setName("Murca");
        myobject.setAge(2);
        myobject.setColor("brown");
        myobject.setHeight(3);
        myobject.setMoodLevel(10);
        myobject.setHealthlevel(10);
        myobject.setRecreActivity("playful");
        myobject.speak();
        myobject.life();


        System.out.println(myobject.getName());
        System.out.println(myobject.getAge());
        System.out.println(myobject.getColor());
        System.out.println(myobject.getHeight());
        System.out.println(myobject.getMoodLevel());


        Pug riki = new Pug() ;
        riki.setAge(4);
        riki.setChipNr(5577);
        riki.setColor("white");
        riki.setHeight(10);
        riki.setMoodLevel(10);
        riki.sleep();
        riki.eat();

        System.out.println(riki.getAge());
        System.out.println(riki.getChipNr());
        System.out.println(riki.getColor());
        System.out.println(riki.getHeight());
        System.out.println(riki.getMoodLevel());


        Chiuaua chiuaua =new Chiuaua() ;
        chiuaua.setAge(5);
        chiuaua.setChipNr(88888);
        chiuaua.setColor("brown");
        chiuaua.setHeight(10);
        chiuaua.setWeighr(12);
        chiuaua.setRace("buldog fracez");
        chiuaua.eat();
        chiuaua.run();

        System.out.println(chiuaua.getAge());
        System.out.println(chiuaua.getChipNr());
        System.out.println(chiuaua.getColor());


        }



    }






