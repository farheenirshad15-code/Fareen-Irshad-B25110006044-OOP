# Java OOP Week 03 Lab Assignment

## Student Information
- Student Name: Fareen Irshad
- Seat No: 044
- Lab: Java OOP Week 03

## Project Overview

This project practices important Object-Oriented Programming concepts using Java.

### Topics Covered
1. Point class
2. Triangle class using Point objects
3. Point addition and subtraction
4. Copy constructors
5. Getters and setters
6. `toString()`
7. Stack and Heap visualization
8. ComplexNumber class
9. RationalNumber class
10. UML class diagrams

## Folder Structure

```text
week03_Fareen_Irshad_044/
│
├── PointTriangleDemo/
│   ├── Point.java
│   ├── Triangle.java
│   ├── MainDemo.java
│   └── Point_UML.png
│
├── ComplexRationalDemo/
│   ├── ComplexNumber.java
│   ├── RationalNumber.java
│   ├── MainDemo.java
│   ├── ComplexNumber_UML.png
│   ├── RationalNumber_UML.png
│   └── SampleOutput.txt
│
└── StackHeapVisuals/
    └── PointAddition_PythonTutor_screenshot.png
```

## OOP Concepts Practiced

- Classes and objects
- Encapsulation
- Private attributes
- Default constructors
- Parameterized constructors
- Copy constructors
- Getters and setters
- Methods
- `this` keyword
- `toString()`
- Composition / HAS-A relationship
- Returning objects from methods
- Passing objects as parameters
- Basic exception handling
- Private helper methods

## Point and Triangle

The `Point` class stores `x` and `y` coordinates and supports addition, subtraction, distance calculation, copy construction, getters, setters, and `toString()`.

The `Triangle` class contains three `Point` objects and demonstrates a HAS-A relationship. It provides perimeter, area, triangle type, constructors, getters, setters, and `toString()`.

## Stack and Heap Visualization

The visualization demonstrates three Point references:

```text
first  -> Point(3, 4)
second -> Point(5, 2)
sum    -> Point(8, 6)
```

For the Python Tutor visualization, the simple line:

```java
Point sum = new Point(8, 6);
```

may be used to make the Stack/Heap visualization simple and compatible.

The actual `Point.java` still contains the proper `add()` method.

Screenshot filename:

```text
PointAddition_PythonTutor_screenshot.png
```

## ComplexNumber

The `ComplexNumber` class demonstrates real and imaginary parts, constructors, copy constructor, getters, setters, addition, subtraction, multiplication, and `toString()`.

## RationalNumber

The `RationalNumber` class demonstrates numerator and denominator, constructors, copy constructor, getters, setters, simplification, addition, subtraction, negative sign handling, zero numerator handling, zero denominator validation, and a private `gcd()` helper method.

## How to Compile and Run

### Point/Triangle Demo

```bash
cd PointTriangleDemo
javac Point.java Triangle.java MainDemo.java
java MainDemo
```

### Complex/Rational Demo

```bash
cd ComplexRationalDemo
javac ComplexNumber.java RationalNumber.java MainDemo.java
java MainDemo
```

## Expected Learning Outcome

After completing this lab, the student should be able to:

- Create Java classes and objects.
- Apply encapsulation using private attributes.
- Use default, parameterized, and copy constructors.
- Create independent object copies.
- Use getters and setters.
- Pass objects to methods.
- Return objects from methods.
- Understand basic Stack and Heap visualization.
- Build classes that work together.
- Implement simple mathematical classes using OOP.

## Submission Checklist

Make sure all required `.java`, `.png`, and `.txt` files are present in their specified folders before submission.
