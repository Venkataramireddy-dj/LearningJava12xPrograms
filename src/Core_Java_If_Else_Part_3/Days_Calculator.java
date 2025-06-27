package Core_Java_If_Else_Part_3;

import java.util.Scanner;

public class Days_Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of days");
        int totaldays=scanner.nextInt();
        int years=0,months=0,days=0;
        if(totaldays>=365){
            years=totaldays/365;
            totaldays=totaldays%365;
        }else{
            years=0;
        }
        if(totaldays>=30){
            months=totaldays/30;
            totaldays=totaldays%30;

        }else{
            months=0;

        }
        if (totaldays>0){
            days=totaldays;
        }else{
            days=0;
        }
        System.out.println("Converted: " + years + " years, " + months + " months, and " + days + " days.");

    }
}
