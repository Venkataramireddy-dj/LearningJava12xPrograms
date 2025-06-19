package Constructors;

public class Smartphone {
    void displayFeatures(){
        System.out.println("Smartphone features: Touchscreen, Camera ,Apps");
    }
}

//child class
class AndroidPhone extends Smartphone{
    @Override
    void displayFeatures(){
        //call parent class method using super
        super.displayFeatures();

        //Android-specific feature
        System.out.println("Android features : Google play store, customization");
    }

    void showAllFeatures(){
        System.out.println("Displaying all features:");
        super.displayFeatures(); //explicitly calling parent method
        this.displayFeatures(); //calling current class method
    }
}

