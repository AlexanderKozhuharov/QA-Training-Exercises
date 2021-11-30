package Lecture2511;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
//        radius = 1.0;
//        color = "Red";
    }

    public Circle(double radius) {
        this.radius = radius;
        //this.color = "Red";
    }

    public Circle(String color) {
        //this.radius = 2.0;
        this.color = color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getArea() {
        return Math.PI * radius * radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Circle: radius = " + radius + " color = " + color;
    }
}
