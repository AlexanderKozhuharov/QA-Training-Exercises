package Homework0211;

public class DivisibleBy5 {
    public static void main(String[] args) {

        int[] arr = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 150) {
                break;
            } else if (arr[i] % 5 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
