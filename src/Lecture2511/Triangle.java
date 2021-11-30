package Lecture2511;

public class Triangle extends Shape{
    private double a;
    private double b;

    public Triangle (String color, double a, double b){
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    double area() {
        return a*b/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
