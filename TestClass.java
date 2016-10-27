package Pets;

/**
 * Created by ZHARKOOE on 13.10.2016.
 */
public class TestClass {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Jack Russel" , "boy" , "Lucky" );
        Dog dog = new Dog("Балонка" , "girl" , "Dobi");

        dog.bark("Dobi");
        dog.bite("Dobi");
        dog.jump("Dobi");
        dog.run("Dobi");

        puppy.bark("Lucky");
        puppy.bite("Lucky");
        puppy.jump("Lucky");
        puppy.run("Lucky");

        System.out.println(puppy);
        System.out.println(dog);




    }

}
