package Lecture2511;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println("Cylinder: "
                + "radius = " + cylinder.getRadius()
                + "height = " + cylinder.getHeight()
                + "area = " + cylinder.getArea()
                + "volume = " + cylinder.getVolume()
        );
        Circle circle = new Circle();
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Cylinder area: " + cylinder.getArea());
    }
}
