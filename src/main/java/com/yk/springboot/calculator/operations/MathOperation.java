package com.yk.springboot.calculator.operations;

public enum MathOperation {

    ADD("ADD", "+"),
    SUBTRACT("SUBTRACT", "-"),
    MULTIPLY("MULTIPLY", "*"),
    DIVIDE("DIVIDE", "/");

    private String operation;
    private String mathSymbol;

    MathOperation(String operation, String mathSymbol) {
        this.operation = operation;
        this.mathSymbol = mathSymbol;
    }

    public String getOperation() {
        return operation;
    }

    public String getMathSymbol() {
        return mathSymbol;
    }
}
