package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator kalkuliatorius = new Calculator();

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        num1 = sc.nextInt();

        System.out.println("Please enter second number:");
        num2 = sc.nextInt();

        int addition_result = kalkuliatorius.add_numbers(num1, num2);
        int subtraction_result = kalkuliatorius.subtract_numbers(num1, num2);

        System.out.println("Sum: " + addition_result + " Sub: " + subtraction_result);

        sc.close();

    }
}
