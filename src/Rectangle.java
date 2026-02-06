/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Rectangle {
     private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        if(length < 0 || width < 0) {
            System.out.println("Error: Length and width must be positive!");
            this.length = this.width = 0;
        } else {
            this.length = length;
            this.width = width;
        }
    }

    // Getters and Setters
    public double getLength() { return length; }
    public void setLength(double length) {
        if(length < 0) System.out.println("Error: Length must be positive!");
        else this.length = length;
    }

    public double getWidth() { return width; }
    public void setWidth(double width) {
        if(width < 0) System.out.println("Error: Width must be positive!");
        else this.width = width;
    }

    // Calculate area
    public double area() { return length * width; }

    // Calculate perimeter
    public double perimeter() { return 2 * (length + width); }
}

