
public class RationalNumber {

    // Private attributes
    private int numerator;
    private int denominator;

    // Default constructor
    public RationalNumber() {
        numerator = 0;
        denominator = 1;
    }

    // Parameterized constructor
    public RationalNumber(int numerator, int denominator) {

        if (denominator == 0) {
            throw new IllegalArgumentException(
                    "Denominator cannot be zero."
            );
        }

        this.numerator = numerator;
        this.denominator = denominator;

        simplify();
    }

    // Copy constructor
    public RationalNumber(RationalNumber other) {

        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    // Getter for numerator
    public int getNumerator() {
        return numerator;
    }

    // Getter for denominator
    public int getDenominator() {
        return denominator;
    }

    // Setter for numerator
    public void setNumerator(int numerator) {

        this.numerator = numerator;
        simplify();
    }

    // Setter for denominator
    public void setDenominator(int denominator) {

        if (denominator == 0) {
            throw new IllegalArgumentException(
                    "Denominator cannot be zero."
            );
        }

        this.denominator = denominator;
        simplify();
    }

    // Private helper method
    private int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {

            int temp = a % b;

            a = b;
            b = temp;
        }

        return a;
    }

    // Simplify fraction
    public void simplify() {

        // Zero numerator always becomes 0/1
        if (numerator == 0) {
            denominator = 1;
            return;
        }

        // Keep negative sign in numerator
        if (denominator < 0) {

            numerator = -numerator;
            denominator = -denominator;
        }

        int divisor = gcd(
                numerator,
                denominator
        );

        numerator = numerator / divisor;
        denominator = denominator / divisor;
    }

    // Addition
    public RationalNumber add(RationalNumber other) {

        int newNumerator
                = numerator * other.denominator
                + other.numerator * denominator;

        int newDenominator
                = denominator * other.denominator;

        return new RationalNumber(
                newNumerator,
                newDenominator
        );
    }

    // Subtraction
    public RationalNumber subtract(RationalNumber other) {

        int newNumerator
                = numerator * other.denominator
                - other.numerator * denominator;

        int newDenominator
                = denominator * other.denominator;

        return new RationalNumber(
                newNumerator,
                newDenominator
        );
    }

    // Convert fraction to String
    @Override
    public String toString() {

        if (denominator == 1) {
            return String.valueOf(numerator);
        }

        return numerator + "/" + denominator;
    }
}
