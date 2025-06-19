package Constructors;

public class Parent {
    Parent(String message){
        System.out.println("Parent message" + message);
    }
}
class Child extends Parent{
    Child(String message){
        super("Message for Parent");
        System.out.println("Child message" + message);
    }
}
