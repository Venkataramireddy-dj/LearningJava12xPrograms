package Strings_Excersice;

import java.util.Scanner;

public class First_Letter_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter The string");
        String words = scanner.nextLine();
        String lot = words.trim().replaceAll("\\s+", " ");
        String[] real = lot.split(" ");
       // System.out.println(real);
        for(String name : real){
            if(!name.isEmpty()){
                System.out.print(name.charAt(0));
            }
        }

    }
}
