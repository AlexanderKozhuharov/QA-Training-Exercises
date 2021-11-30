package Lecture2511;

abstract public class Shape {
    private String color;

    abstract double area();

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String toString();

}
