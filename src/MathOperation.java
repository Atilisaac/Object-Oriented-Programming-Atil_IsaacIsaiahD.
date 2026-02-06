/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class MathOperation {
    // Private attributes (encapsulation)
    private double number1;
    private double number2;

    // Constructor to initialize numbers
    public MathOperation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Getter for number1
    public double getNumber1() {
        return number1;
    }

    // Setter for number1
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    // Getter for number2
    public double getNumber2() {
        return number2;
    }

    // Setter for number2
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    // Placeholder compute method (to be overridden)
    public double compute() {
        return 0; // Base class does not perform calculations
    }
}

