/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class ArithmeticOperations extends MathOperation {
    
    // Constructor – pass numbers to parent class
    public ArithmeticOperations(double number1, double number2) {
        super(number1, number2);
    }

    // Addition
    public double add() {
        return getNumber1() + getNumber2();
    }

    // Subtraction
    public double subtract() {
        return getNumber1() - getNumber2();
    }

    // Multiplication
    public double multiply() {
        return getNumber1() * getNumber2();
    }

    // Division with zero check
    public double divide() {
        if (getNumber2() == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return getNumber1() / getNumber2();
    }
}
