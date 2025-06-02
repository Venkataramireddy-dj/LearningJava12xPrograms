package Array_Excersice;

public class Sum_Of_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,12,34,48,69,72,86,98,-22};
        int sum =0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }
}
