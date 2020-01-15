package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator skaiciuotuvas = new Calculator();

        int num1 = 0;
        int num2 = 0;
        char operator;

        int result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        try {
            num1 = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ivestas ne skaicius");
        }

        System.out.println("Please enter second number:");
        num2 = sc.nextInt();

        System.out.println("Please enter an operation you would like to perform:");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                result = skaiciuotuvas.add_numbers(num1, num2);
                break;
            case '-':
                result = skaiciuotuvas.subtract_numbers(num1, num2);
                break;
            case '*':
                result = skaiciuotuvas.multiply_numbers(num1, num2);
                break;
            case '/':
                result = skaiciuotuvas.divide_numbers(num1, num2);
                break;
        }

//        int addition_result = skaiciuotuvas.add_numbers(num1, num2);
//        int subtraction_result = skaiciuotuvas.subtract_numbers(num1, num2);
//        int multiplication_result = skaiciuotuvas.multiply_numbers(num1, num2);
//        int division_result = skaiciuotuvas.divide_numbers(num1, num2);

        System.out.println("Operation result: " + result);

        sc.close();

    }
}
