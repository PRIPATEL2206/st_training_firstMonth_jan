package OopsConcepts.AbstractionT5;

public class P1 {

}

abstract class Animal {
    abstract void eat();

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog is Eating");
    }

    @Override
    void sound() {
        System.out.println("Bhau Bhau...");
    }

}

class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("Cat is Eating");
    }

    @Override
    void sound() {
        System.out.println("Meiyau Meiyau...");
    }

}
