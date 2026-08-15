
public class MainDemo {

    public static void main(String[] args) {

        System.out.println("===== POINT DEMO =====");

        // Creating two Point objects
        Point first = new Point(3, 4);
        Point second = new Point(5, 2);

        System.out.println("First Point: " + first);
        System.out.println("Second Point: " + second);

        // Point addition
        Point sum = first.add(second);

        System.out.println("Addition: " + sum);

        // Point subtraction
        Point difference = first.subtract(second);

        System.out.println("Subtraction: " + difference);

        // Copy constructor
        Point copied = new Point(first);

        System.out.println("Copied Point: " + copied);

        // Change copied Point
        copied.setX(100);
        copied.setY(200);

        System.out.println("Changed Copy: " + copied);

        // Original remains unchanged
        System.out.println("Original Point: " + first);

        System.out.println();
        System.out.println("===== TRIANGLE DEMO =====");

        // Creating Triangle using Point objects
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 3);

        Triangle triangle = new Triangle(p1, p2, p3);

        System.out.println("Triangle: " + triangle);

        System.out.printf(
                "Perimeter: %.2f%n",
                triangle.perimeter()
        );

        System.out.printf(
                "Area: %.2f%n",
                triangle.area()
        );

        System.out.println(
                "Type: " + triangle.type()
        );
    }
}
