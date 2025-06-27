package Core_Java_If_Else_Part_3;

import java.util.Scanner;

public class Website_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter website URL: ");
        String url = scanner.nextLine();
        String lower = url.toLowerCase();
        if(lower.endsWith(".com/")){
            System.out.println("The website type is: Commercial website");
        }else if(lower.endsWith(".org/")){
            System.out.println("The website type is: Non-profit organization");
        }else if(lower.endsWith(".edu/")){
            System.out.println("The website type is: Educational institution");
        }else if (url.endsWith(".gov/")) {
            System.out.println("The website type is: Government website");
        } else if (url.endsWith(".net/")) {
            System.out.println("The website type is: Network-related website");
        } else if (url.endsWith(".info/")) {
            System.out.println("The website type is: Informational website");
        }else {
            System.out.println("The website type is: Unknown or other types of websites");
        }
        scanner.close();

    }
}
