package com.yk.springboot.calculator.service;

import com.yk.springboot.calculator.mgr.OperationManager;
import com.yk.springboot.calculator.operations.Operation;

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
        System.out.println("+ : Addition");
        System.out.println("- : Subtraction");
        System.out.println("* : Multiplication");
        System.out.println("/ : Division");
    }

    private int processInput(String input,  int a, int b) {
        Operation operation = OperationManager.getInstance().retrieveOperation(input);

        return operation.operation(a, b);
    }
}

