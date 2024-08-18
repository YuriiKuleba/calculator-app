package com.yk.springboot.calculator_app.service;

import java.util.Scanner;

public class CalculatorConfig {
    public void calculateNumbers() {
        System.out.println("Welcome to Java Calculator Application");

        System.out.println("Choose which operation you want to perform");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.println("Enter the operation Number : ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Enter the num1 : ");
        int a = sc.nextInt();

        System.out.println("Enter the num2 : ");
        int b = sc.nextInt();

        int result = processInput(input, a, b);

        System.out.println("The result of the operation is : " + result);

        sc.close();
    }

    private int processInput(String input, int a, int b) {
        Operation operation = new OperationImpl();

        return switch (input) {
            case "1" -> operation.addNumbers(a, b);
            case "2" -> operation.subtractNumbers(a, b);
            case "3" -> operation.multiplyNumbers(a, b);
            case "4" -> operation.divideNumbers(a, b);
            default -> 0;
        };
    }
}

