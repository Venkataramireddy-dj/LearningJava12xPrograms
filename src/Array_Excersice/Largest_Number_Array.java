package Array_Excersice;

public class Largest_Number_Array {
    public static void main(String[] args) {
        int[] arr = {12,34,48,69,72,86,98};
        int largest =0;
        for (int j : arr) {
            if (j > largest) {
                largest = j;

            }
        }
        System.out.println(largest);
    }
}
