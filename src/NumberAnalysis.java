/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class NumberAnalysis {
     private int number; // encapsulated

    // Constructor
    public NumberAnalysis(int number) {
        this.number = number;
    }

    // Getter/Setter
    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    // Check if prime
    public boolean isPrime() {
        if(number < 2) return false;
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    // Factorial
    public long factorial() {
        if(number < 0) return -1; // Error for negative
        long fact = 1;
        for(int i = 1; i <= number; i++) fact *= i;
        return fact;
    }

    // Check even
    public boolean isEven() {
        return number % 2 == 0;
    }
}

