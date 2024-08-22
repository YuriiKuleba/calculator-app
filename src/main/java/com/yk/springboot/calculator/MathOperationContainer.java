package com.yk.springboot.calculator;

import com.yk.springboot.calculator.operations.*;

import java.util.*;

public class MathOperationContainer {
    private final Map<String, Operation> operations = new HashMap<>();

    public MathOperationContainer() {
        operations.put(MathOperation.ADD.getMathSymbol(), new Addition());
        operations.put(MathOperation.SUBTRACT.getMathSymbol(), new Subtract());
        operations.put(MathOperation.MULTIPLY.getMathSymbol(), new Multiply());
        operations.put(MathOperation.DIVIDE.getMathSymbol(), new Divide());
    }

    public Operation getOperation(String operation) {
        return operations.get(operation);
    }
}
