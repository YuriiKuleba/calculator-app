package com.yk.springboot.calculator_app.service;

public class OperationImpl implements Operation {
    @Override
    public int addNumbers(int a, int b) {
        return a + b;
    }

    @Override
    public int subtractNumbers(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

    @Override
    public int divideNumbers(int a, int b) {
        return a / b;
    }
}
