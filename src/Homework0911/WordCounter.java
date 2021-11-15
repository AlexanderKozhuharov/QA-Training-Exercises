package Homework0911;

public class WordCounter {
    public static void main(String[] args) {
        System.out.println(counter(" This is a test string "));
    }

    public static int counter(String input) {
        String[] arr = input.trim().split("\\s+");
        return arr.length;
    }
}
