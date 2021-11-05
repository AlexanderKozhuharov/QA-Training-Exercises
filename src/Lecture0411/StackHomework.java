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
            if (size - i == 1) {
                System.out.println(String.format("Please fill the stack with %s more number: ", size - i));
                stack.add(input.nextInt());
            } else {
                System.out.println(String.format("Please fill the stack with %s more numbers: ", size - i));
                stack.add(input.nextInt());
            }
        }
        StackHomework.pop(stack);
        StackHomework.push(stack, 100);
        StackHomework.push(stack, 101);
        System.out.println(stack);
        StackHomework.pop(stack);
        System.out.println(stack);
        StackHomework.peak(stack);
    }

    static void push(ArrayList<Integer> arr, int nextNumber) {
        arr.add(nextNumber);
    }

    static void pop(ArrayList<Integer> arr) {
        if (arr.isEmpty()){
            System.out.println("The stack is empty.");
        }
        else{
            arr.remove(arr.size() - 1);
        }
    }

    static void peak(ArrayList<Integer> arr) {
        System.out.println("The top element is: " + arr.get(arr.size() - 1));
    }
}
