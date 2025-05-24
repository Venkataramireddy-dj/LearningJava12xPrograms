package Ternary_Operator;

import com.sun.tools.javac.Main;

public class Max_Of_Three {
    public static void main(String[] args) {
        int n1=28;
        int n2=67;
        int n3=99;
        String result = (n1>n2)?(n1>n3)?"n1 is graeter":"n3 is greater":((n2>n3)?"n2 is greater":"n3 is greater");
        System.out.println(result);
    }
}
