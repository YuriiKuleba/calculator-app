package com.yk.springboot.calculator_app.operations;

public class Multiply implements Operation{

    @Override
    public int operation(int a, int b) {
        return a / b;
    }
}
