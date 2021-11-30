package Lecture2511;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.setRadius(2.0);
        circle.setColor("Blue");

        System.out.println("The radius of the circle is: " + circle.getRadius());
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The color of the circle is: " + circle.getColor());

        System.out.println(circle.toString());
        System.out.println(circle);
    }
}
