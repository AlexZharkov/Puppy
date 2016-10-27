package Pets;

/**
 * Created by ZHARKOOE on 13.10.2016.
 */
public class Animal {
    private String breed;

    public Animal (String breed) {
        this.breed = breed;
    }

        public String getBreed ( ){
            return  breed;
        }

        @Override
    public String toString(){
            return "Animal " +
                    "breed - " + breed + ". " ;

        }

    }
