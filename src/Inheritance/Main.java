package Inheritance;

public class Main {
    public static void main(String[] args) {
        Child myChild = new Child();
        myChild.childmethod();
        myChild.home();
        myChild.parent();
        Dog pet = new Dog();
        pet.makeSound();
    }
}
