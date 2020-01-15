package com.company;

public class Calculator {

    // constructor for Calculator
    public Calculator() {
    }

    //Method for adding two numbers is created below:
    public int add_numbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // Method for subtraction is created below:
    public int subtract_numbers(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }

    public int multiply_numbers(int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }

    public int divide_numbers(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        int div = num1 / num2;
        return div;


    }

}
