package Lecture2511;

public class ShapeTest {

    static void printIt(Shape s){
        System.out.println(s.toString());
    }
    public static void main(String[] args) {
        Shape s1 = new Rectangle("Red", 10, 20);
        Shape s2 = new Triangle("Blue", 30,23);
        printIt(s1);
        printIt(s2);
    }
}
