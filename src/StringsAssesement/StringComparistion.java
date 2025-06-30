package StringsAssesement;

public class StringComparistion {
    public static void main(String[] args) {
        String one = "Hello";
        String two =  "hello"; String three =  "Hello";
        System.out.print("equals() : " + one.equals(two) + " , ");
        System.out.print(" equalsIgnoreCase(): " + one.equalsIgnoreCase(two) + " , ");
        System.out.print(" compareTo(): " + one.compareTo(two)  );
        System.out.println();
        System.out.println(one.concat(two));

    }
}
