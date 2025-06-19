package Hierarchical;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.ride();
        Car c = new Car();
        c.start();
        c.drive();
    }

}
