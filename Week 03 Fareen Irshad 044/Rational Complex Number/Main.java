
public class MainDemo {

    public static void main(String[] args) {

        // =========================================
        // COMPLEX NUMBER
        // =========================================
        System.out.println("===== COMPLEX NUMBER DEMO =====");

        // Object creation
        ComplexNumber c1
                = new ComplexNumber(7, 3);

        ComplexNumber c2
                = new ComplexNumber(2, -5);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        // Addition
        System.out.println(
                "Addition = " + c1.add(c2)
        );

        // Subtraction
        System.out.println(
                "Subtraction = " + c1.subtract(c2)
        );

        // Multiplication
        System.out.println(
                "Multiplication = " + c1.multiply(c2)
        );

        // Copy constructor
        ComplexNumber copy
                = new ComplexNumber(c1);

        // Setters
        copy.setReal(10);
        copy.setImaginary(8);

        System.out.println(
                "Copy after setters = " + copy
        );

        // Original is unchanged
        System.out.println(
                "Original c1 = " + c1
        );

        // =========================================
        // RATIONAL NUMBER
        // =========================================
        System.out.println();
        System.out.println("===== RATIONAL NUMBER DEMO =====");

        // Creating rational numbers
        RationalNumber r1
                = new RationalNumber(14, 21);

        RationalNumber r2
                = new RationalNumber(-5, 12);

        System.out.println(
                "r1 (simplified) = " + r1
        );

        System.out.println(
                "r2 = " + r2
        );

        // Addition
        System.out.println(
                "Addition = " + r1.add(r2)
        );

        // Subtraction
        System.out.println(
                "Subtraction = " + r1.subtract(r2)
        );

        // Copy constructor
        RationalNumber rCopy
                = new RationalNumber(r1);

        System.out.println(
                "Copied rational = " + rCopy
        );

        // Setters
        rCopy.setNumerator(10);
        rCopy.setDenominator(15);

        System.out.println(
                "Copy after setters = " + rCopy
        );

        // Original remains unchanged
        System.out.println(
                "Original r1 = " + r1
        );

        // Zero numerator case
        RationalNumber zero
                = new RationalNumber(0, -9);

        System.out.println(
                "Zero numerator case = " + zero
        );

        // Zero denominator validation
        try {

            RationalNumber invalid
                    = new RationalNumber(3, 0);

            System.out.println(invalid);

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "Zero denominator validation: "
                    + e.getMessage()
            );
        }
    }
}
