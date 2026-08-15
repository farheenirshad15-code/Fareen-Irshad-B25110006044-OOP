
public class ComplexNumber {

    // Private attributes
    private double real;
    private double imaginary;

    // Default constructor
    public ComplexNumber() {
        real = 0;
        imaginary = 0;
    }

    // Parameterized constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy constructor
    public ComplexNumber(ComplexNumber other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    // Getter for real
    public double getReal() {
        return real;
    }

    // Getter for imaginary
    public double getImaginary() {
        return imaginary;
    }

    // Setter for real
    public void setReal(double real) {
        this.real = real;
    }

    // Setter for imaginary
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Addition
    public ComplexNumber add(ComplexNumber other) {

        return new ComplexNumber(
                real + other.real,
                imaginary + other.imaginary
        );
    }

    // Subtraction
    public ComplexNumber subtract(ComplexNumber other) {

        return new ComplexNumber(
                real - other.real,
                imaginary - other.imaginary
        );
    }

    // Multiplication
    public ComplexNumber multiply(ComplexNumber other) {

        double newReal
                = real * other.real
                - imaginary * other.imaginary;

        double newImaginary
                = real * other.imaginary
                + imaginary * other.real;

        return new ComplexNumber(
                newReal,
                newImaginary
        );
    }

    // toString
    @Override
    public String toString() {

        if (imaginary == 0) {
            return String.valueOf(real);
        }

        if (real == 0) {
            return imaginary + "i";
        }

        if (imaginary < 0) {
            return real + " - "
                    + Math.abs(imaginary) + "i";
        }

        return real + " + "
                + imaginary + "i";
    }
}
