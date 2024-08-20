package com.yk.springboot.calculator_app.operations;

public class Subtract implements Operation {

    @Override
    public int operation(int a, int b) {
        return a - b;
    }
}
