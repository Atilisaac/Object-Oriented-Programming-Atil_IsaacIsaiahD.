/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // ===== ARITHMETIC OPERATIONS =====
        System.out.println("=== Arithmetic Operations ===");

        // Ask user for input numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble(); // Read first number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble(); // Read second number

        // Create an ArithmeticOperations object
        // Calls the constructor of ArithmeticOperations which uses super() to set numbers in MathOperation
        ArithmeticOperations op = new ArithmeticOperations(num1, num2);

        // Call methods of ArithmeticOperations
        System.out.println("Addition: " + op.add());         // Calls add() method
        System.out.println("Subtraction: " + op.subtract()); // Calls subtract() method
        System.out.println("Multiplication: " + op.multiply()); // Calls multiply() method
        System.out.println("Division: " + op.divide());     // Calls divide() method (checks for zero)

        // ===== GEOMETRY =====
        System.out.println("\n=== Geometry: Circle ===");

        // Ask user for radius
        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble(); // Read radius

        // Create Circle object
        // Calls Circle constructor which validates radius
        Circle c = new Circle(radius);

        // Call methods of Circle
        System.out.println("Circle area: " + c.area());           // Calls area() method
        System.out.println("Circle circumference: " + c.circumference()); // Calls circumference() method

        System.out.println("\n=== Geometry: Rectangle ===");

        // Ask user for rectangle dimensions
        System.out.print("Enter rectangle length: ");
        double length = scanner.nextDouble(); // Read length
        System.out.print("Enter rectangle width: ");
        double width = scanner.nextDouble();   // Read width

        // Create Rectangle object
        Rectangle r = new Rectangle(length, width);

        // Call methods of Rectangle
        System.out.println("Rectangle area: " + r.area());         // Calls area() method
        System.out.println("Rectangle perimeter: " + r.perimeter()); // Calls perimeter() method

        // ===== NUMBER ANALYSIS =====
        System.out.println("\n=== Number Analysis ===");

        // Ask user for a number to analyze
        System.out.print("Enter a number for analysis: ");
        int n = scanner.nextInt(); // Read integer

        // Create NumberAnalysis object
        NumberAnalysis na = new NumberAnalysis(n);

        // Call methods of NumberAnalysis
        System.out.println("Is prime? " + na.isPrime()); // Calls isPrime() method
        System.out.println("Factorial: " + na.factorial()); // Calls factorial() method
        System.out.println("Is even? " + na.isEven());   // Calls isEven() method

        // Close the scanner
        scanner.close(); // Always close Scanner to avoid resource leak
    }
}