package Core_Java_If_Else_Part_2;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary : ");
        double salary = scanner.nextDouble();
        System.out.print("Enter how many years of experience you have : ");
        double year = scanner.nextDouble();
        if(year<1){
            System.out.println("There is no bonus for you , because you have less than one year experience");
        }else if(year>=1 && year<=3){
            salary += salary*5/100;
            System.out.println("Your salary is : " + salary);
        }else if(year>=4 && year<=6){
            salary += salary*10/100;
            System.out.println("Your salary is : " + salary);
        }else{
            salary += salary*15/100;
            System.out.println("Your salary is : " + salary);
        }
    }
}
