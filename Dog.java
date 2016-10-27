package Pets;

/**
 * Created by ZHARKOOE on 13.10.2016.
 */
    class Dog extends Animal {
    private String gender;
    private String name;


    public Dog(String breed , String gender , String name) {
        super(breed);
        this.gender = gender;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }

    public void bark (String name){
        System.out.println(name + " : Woof - Woof");
    }

    public  void run (String name){
        System.out.println(name + " is running away from you");
    }

    public void jump (String name){
        System.out.println(name + " is jumping like crazy");
    }

    public void bite (String name){
        System.out.println(name + " is chewing your boot");
    }

    @Override
    public String toString() {
        return super.toString() + "Dog" +
                " name  - " + name + ". " +
                "Gender - " + gender  ;
    }
}

