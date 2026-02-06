Project Name: CoreMathLibrary
Classes and Responsibilities

MathOperation – Base class for arithmetic. Stores numbers privately. Provides getters/setters.

ArithmeticOperations – Inherits MathOperation. Performs add, subtract, multiply, divide.

Circle – Stores radius. Calculates area and circumference.

Rectangle – Stores length and width. Calculates area and perimeter.

NumberAnalysis – Stores a number. Checks prime, factorial, even/odd.

Main – Runs the program, asks for input using Scanner, tests all classes.

Inheritance Structure
MathOperation
    |
ArithmeticOperations


Only arithmetic uses inheritance. Geometry and number analysis are separate.

Encapsulation

All important variables are private.

Access and updates are through getters and setters only.

Prevents wrong values (like negative radius or division by zero).

Sample Output
=== Arithmetic Operations ===
Addition: 25.0
Subtraction: 5.0
Multiplication: 150.0
Division: 1.5

Circle area: 78.54
Circle circumference: 31.42

Rectangle area: 28.0
Rectangle perimeter: 22.0

Is prime? true
Factorial: 5040
Is even? false


