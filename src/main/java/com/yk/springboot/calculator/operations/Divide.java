package com.yk.springboot.calculator.operations;

public class Divide implements Operation{

    @Override
    public int operation(int a, int b) {
        return a / b;
    }
}
