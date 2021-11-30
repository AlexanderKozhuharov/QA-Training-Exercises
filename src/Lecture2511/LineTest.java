package Lecture2511;

public class LineTest {

    public static void main(String[] args) {
//        LineAggregation l = new LineAggregation(10, 20, 30, 40);
//        System.out.println(l);
//        Point p1 = new Point(45, 67);
//        Point p2 = new Point(56, 73);
//        LineAggregation l1 = new LineAggregation(p1, p2);
//        System.out.println(l1);

        LineInheritance l = new LineInheritance(10, 20, 30, 40);
        System.out.println(l);
        Point p1 = new Point(45, 67);
        Point p2 = new Point(56, 73);
        LineInheritance l1 = new LineInheritance(p1, p2);
        System.out.println(l1);
    }
}
