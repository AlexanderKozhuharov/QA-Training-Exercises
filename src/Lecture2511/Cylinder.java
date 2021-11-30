package Lecture2511;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * Math.PI * getRadius() * getRadius();
    }

    public double getVolume() {
        return getArea() * height;
    }
}
