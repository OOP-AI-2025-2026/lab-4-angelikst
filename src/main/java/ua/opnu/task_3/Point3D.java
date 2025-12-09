package ua.opnu.task_3;

public class Point3D extends Point {

    private int z;
    public Point3D() {
        super();
        this.z = 0;
    }
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(Point3D other) {
        super(other.getX(), other.getY());
        this.z = other.z;
    }
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;
    }
    public double distance(Point3D p) {
        int dx = getX() - p.getX();
        int dy = getY() - p.getY();
        int dz = this.z - p.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    @Override
    public double distanceFromOrigin() {
        return distance(new Point3D(0, 0, 0));
    }
    public int getZ() {
        return this.z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
