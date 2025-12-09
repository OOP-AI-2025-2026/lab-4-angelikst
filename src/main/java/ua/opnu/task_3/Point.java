package ua.opnu.task_3;

public class Point {

    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distanceFromOrigin() {
        return distance(new Point(0, 0));
    }

    public double distance(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public final int getX() {
        return this.x;
    }
    public final int getY() {
        return this.y;
    }
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}

