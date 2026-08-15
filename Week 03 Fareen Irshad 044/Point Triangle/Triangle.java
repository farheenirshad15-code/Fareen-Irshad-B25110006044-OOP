
public class Triangle {

    // Triangle HAS-A three Point objects
    private Point p1;
    private Point p2;
    private Point p3;

    // Default constructor
    public Triangle() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(1, 0);
        this.p3 = new Point(0, 1);
    }

    // Parameterized constructor
    public Triangle(Point p1, Point p2, Point p3) {

        // Copy points to keep the Triangle independent
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    // Copy constructor
    public Triangle(Triangle other) {
        this.p1 = new Point(other.p1);
        this.p2 = new Point(other.p2);
        this.p3 = new Point(other.p3);
    }

    // Getters
    public Point getP1() {
        return new Point(p1);
    }

    public Point getP2() {
        return new Point(p2);
    }

    public Point getP3() {
        return new Point(p3);
    }

    // Setters
    public void setP1(Point p1) {
        this.p1 = new Point(p1);
    }

    public void setP2(Point p2) {
        this.p2 = new Point(p2);
    }

    public void setP3(Point p3) {
        this.p3 = new Point(p3);
    }

    // Calculate perimeter
    public double perimeter() {

        double side1 = p1.distanceFrom(p2);
        double side2 = p2.distanceFrom(p3);
        double side3 = p3.distanceFrom(p1);

        return side1 + side2 + side3;
    }

    // Calculate area using coordinate formula
    public double area() {

        double result
                = p1.getX() * (p2.getY() - p3.getY())
                + p2.getX() * (p3.getY() - p1.getY())
                + p3.getX() * (p1.getY() - p2.getY());

        return Math.abs(result) / 2.0;
    }

    // Find triangle type
    public String type() {

        double a = p1.distanceFrom(p2);
        double b = p2.distanceFrom(p3);
        double c = p3.distanceFrom(p1);

        double epsilon = 0.000001;

        // Check if triangle is valid
        if (a + b <= c + epsilon
                || a + c <= b + epsilon
                || b + c <= a + epsilon) {

            return "Not a valid triangle";
        }

        // Equilateral
        if (Math.abs(a - b) < epsilon
                && Math.abs(b - c) < epsilon) {

            return "Equilateral";
        }

        // Isosceles
        if (Math.abs(a - b) < epsilon
                || Math.abs(b - c) < epsilon
                || Math.abs(a - c) < epsilon) {

            return "Isosceles";
        }

        // Otherwise scalene
        return "Scalene";
    }

    // Convert Triangle into String
    @Override
    public String toString() {

        return "Triangle{"
                + "p1=" + p1
                + ", p2=" + p2
                + ", p3=" + p3
                + "}";
    }
}
