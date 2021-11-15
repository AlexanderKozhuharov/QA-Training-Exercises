package Homework0911;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(151));
    }

    static boolean isPalindrome(int number) {
        String original = Integer.toString(number);
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        return original.equals(reversed);
    }
}
