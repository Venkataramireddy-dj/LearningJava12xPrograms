package Array_Excersice;

public class Lowest_Number_Array {
    public static void main(String[] args) {
        int[] arr = {5,8,11,12,34,48,69,72,86,98};
        int lowest =34;
        for (int j : arr) {
            if (j < lowest) {
                lowest = j;

            }
        }
        System.out.println(lowest);
    }
}
