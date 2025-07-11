package Assignments;

public class Inheritance_Jul_9 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
        cat.makeSound();

    }

}
class Animal{
    void makeSound(){
        System.out.println("This is make sound of any animal");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("meow meow...");
    }

}

