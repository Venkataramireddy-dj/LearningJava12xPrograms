package If_Else_Tasks;

import java.util.Scanner;

public class Vowel_Consonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter a character");
        char c = scanner.next().charAt(0);
        c = Character.toLowerCase(c);
        if(Character.isLetter(c)){
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
                System.out.println(c + " is a vowel.");
            }else{
                System.out.println(c + " is a consonant.");
            }
        }
        else{
            System.out.println(c + " is not a valid letter.");
        }
    }
}
