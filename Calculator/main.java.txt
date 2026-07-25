/*
 * File: Main.java
 * Purpose: Demonstrates each Calculator operation with a normal and an edge case.
 */

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));            
        System.out.println(calc.subtract(10, 4));      
        System.out.println(calc.multiply(6, 7));      
        System.out.println(calc.power(2, 5));          
        System.out.println(calc.divide(10, 2));    
        System.out.println(calc.divide(10, 0));         
        System.out.println(calc.modulus(10, 3));      
        System.out.println(calc.modulus(10, 0));  // edge case: modulus by zero    
        System.out.println(calc.power(9, 0.5));  // edge case: fractional exponent       
        System.out.println(calc.add(1, 2, 3, 4));       
    }
}