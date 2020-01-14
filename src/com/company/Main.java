package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1, num2, sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        num1 = sc.nextInt();

        System.out.println("Please enter second number:");
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println(sum);
        
        sc.close();

    }
}
