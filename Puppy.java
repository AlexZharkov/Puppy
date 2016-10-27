package Pets;


import com.sun.org.apache.xpath.internal.SourceTree;

class Puppy extends  Dog {

    @Override
    public void bark(String name) {
        super.bark(name);
    }

    @Override
    public void run(String name) {
        System.out.println(name + " ignores you and continues to chew your boot");;
    }

    @Override
    public void jump(String name) {
        System.out.println(name + " tried to jump but just fell to the ground!");
    }

    @Override
    public void bite(String name) {
        super.bite(name);
    }

    public Puppy(String breed, String gender, String name) {
        super(breed, gender, name);

    }


}
