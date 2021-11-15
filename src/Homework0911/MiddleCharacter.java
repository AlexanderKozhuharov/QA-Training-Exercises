package Homework0911;

public class MiddleCharacter {
    public static void main(String[] args) {
        System.out.println("The middle is: " + middleChar("randomstring"));
    }

    public static String middleChar(String input) {
        String middle;
        if (input.length() % 2 == 0) {
            middle = String.valueOf(input.toCharArray()[input.length() / 2 - 1]) + String.valueOf(input.toCharArray()[input.length() / 2]);
        } else {
            middle = String.valueOf(input.toCharArray()[input.length() / 2]);
        }
        return middle;
    }
}
