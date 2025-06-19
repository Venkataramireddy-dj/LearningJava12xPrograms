package Constructors;

public class Student {
    private String name;
    private int age;
    Student(String name,int age){
        this.name = name;
        this.age =age;

    }
    void display(){
        System.out.println("name is "+ name);
        System.out.println("age of " + name + " is " + age);

    }

    public static void main(String[] args) {
        Student s1 = new Student("Venkat",21);
        s1.display();



    }
}
