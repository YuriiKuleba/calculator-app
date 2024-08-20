package com.yk.springboot.calculator_app.service;

import com.yk.springboot.calculator_app.operations.*;

import java.util.*;

public class MathOperation {
    private final EnumMap<Operations, Object> operations = new EnumMap<>(Operations.class);

    public MathOperation(int a, int b) {
        operations.put(Operations.ADD, new Addition().operation(a, b));
        operations.put(Operations.SUBTRACT, new Subtract().operation(a, b));
        operations.put(Operations.MULTIPLY, new Multiply().operation(a, b));
        operations.put(Operations.DIVIDE, new Divide().operation(a, b));
    }

    public EnumMap<Operations, Object> getOperations() {
        return operations;
    }
}
