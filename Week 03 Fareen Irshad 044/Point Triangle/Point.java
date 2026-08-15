
public class Point {

    // Private attributes for encapsulation
    private double x;
    private double y;

    // Default constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Setter for x
    public void setX(double x) {
        this.x = x;
    }

    // Setter for y
    public void setY(double y) {
        this.y = y;
    }

    // Adds two points and returns a NEW Point
    public Point add(Point other) {
        return new Point(
                this.x + other.x,
                this.y + other.y
        );
    }

    // Subtracts two points and returns a NEW Point
    public Point subtract(Point other) {
        return new Point(
                this.x - other.x,
                this.y - other.y
        );
    }

    // Calculates distance between two points
    public double distanceFrom(Point other) {

        double dx = this.x - other.x;
        double dy = this.y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Converts Point into String
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
