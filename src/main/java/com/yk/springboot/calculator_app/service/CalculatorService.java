package com.yk.springboot.calculator_app.service;

import com.yk.springboot.calculator_app.operations.Operations;

import java.util.Scanner;

public class CalculatorService {
    public void calculateNumbers() {

        greeting();

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

    private void greeting() {
        System.out.println("Welcome to Java Calculator Application");

        System.out.println("Choose which operation you want to perform");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }

    private int processInput(String input, int a, int b) {
        MathOperation operation = new MathOperation(a,b);

        return switch (input) {
            case "1" -> (int) operation.getOperations().get(Operations.ADD);
            case "2" -> (int) operation.getOperations().get(Operations.SUBTRACT);
            case "3" -> (int) operation.getOperations().get(Operations.MULTIPLY);
            case "4" -> (int) operation.getOperations().get(Operations.DIVIDE);
            default -> 0;
        };
    }
}

