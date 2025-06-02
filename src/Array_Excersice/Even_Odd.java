package Array_Excersice;

public class Even_Odd {
    public static void main(String[] args) {
        int[] arr = {1,2,12,34,48,69,72,86,98};
        int even;
        int odd;
        System.out.print("Even numbers are : ");
        for(int i : arr){
            if(i%2==0){
                System.out.print(i + " ");

            }
        }
        System.out.println();
        System.out.print("Odd numbers are : ");
        for(int j : arr){
            if(j%2!=0){
                System.out.print(j + " ");

            }
        }

        // System.out.println(even);
        // System.out.println(odd);
    }
}
