package Homework0211;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {23, 45, 65, 345, 22, 35, 87, 347};
        int tempNumber;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tempNumber = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempNumber;
                }
            }
        }
        System.out.println("The largest number is: " + arr[arr.length - 1]);
    }
}
