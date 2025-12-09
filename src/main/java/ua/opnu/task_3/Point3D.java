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
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;
    }
    public int getZ() {
        return this.z;
    }
    public double distance(Point3D other) {
        int dx = this.getX() - other.getX();
        int dy = this.getY() - other.getY();
        int dz = this.z - other.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    @Override
    public double distanceFromOrigin() {
        return distance(new Point3D(0, 0, 0));
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
