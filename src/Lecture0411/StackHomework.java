package Lecture0411;

import java.util.ArrayList;
import java.util.Scanner;


public class StackHomework {
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your desired initial stack size: ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Please fill the stack: ");
            stack.add(input.nextInt());
        }
        StackHomework.push(stack, 100);
        StackHomework.push(stack, 101);
        System.out.println(stack);
        StackHomework.pop(stack);
        System.out.println(stack);
        StackHomework.top(stack);
    }

    static void push(ArrayList<Integer> arr, int nextNumber) {

        arr.add(arr.size(), nextNumber);
    }

    static void pop(ArrayList<Integer> arr) {
        arr.remove(arr.size() - 1);
    }

    static void top(ArrayList<Integer> arr) {
        System.out.println("The top element is: " + arr.get(arr.size() - 1));
    }
}
