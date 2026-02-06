/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Circle {
     private double radius; // Encapsulation

    // Constructor
    public Circle(double radius) {
        if(radius < 0) {
            System.out.println("Error: Radius cannot be negative!");
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        if(radius < 0) {
            System.out.println("Error: Radius cannot be negative!");
        } else {
            this.radius = radius;
        }
    }

    // Calculate area
    public double area() {
        return Math.PI * radius * radius;
    }

    // Calculate circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

