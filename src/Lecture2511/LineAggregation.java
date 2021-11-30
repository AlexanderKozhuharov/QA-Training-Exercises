package Lecture2511;

public class LineAggregation {
    private Point start;
    private Point end;

    public LineAggregation(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public LineAggregation(int beginX, int beginY, int endX, int endY) {
        start = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setBeginX(int beginX) {
        start.setX(beginX);
    }
    public void setBeginY(int beginY) {
        start.setX(beginY);
    }

    public void setEndX(int setEndX) {
        start.setX(setEndX);
    }
    public void setEndY(int setEndY) {
        start.setX(setEndY);
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public double getLength() {
        return Math.sqrt(start.getX() * start.getX() + start.getY() * start.getY());
    }
}
