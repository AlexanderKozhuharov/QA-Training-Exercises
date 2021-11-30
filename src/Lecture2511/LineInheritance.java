package Lecture2511;

public class LineInheritance extends Point{
    Point end;

    public LineInheritance(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public LineInheritance(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
}
