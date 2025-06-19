package Inheritance;

public class Grandparent {
    public void home(){
        System.out.println("I have build a 1BHK house and i own it.");
    }
}
class Parent extends Grandparent{
    public void parent(){
        System.out.println("I have build a 2BHK house and i own it. Now i have 1,2 BHK houses");
    }
}
class Child extends Parent{
    public void childmethod(){
        System.out.println("I have build a 2BHK house and i own it. Now i have 1,2 BHK houses and apart from these which i inherit i build 3 bhk house");
    }

}
