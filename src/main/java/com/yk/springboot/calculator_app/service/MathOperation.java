package com.yk.springboot.calculator_app.service;

import com.yk.springboot.calculator_app.model.Addition;
import com.yk.springboot.calculator_app.model.Divide;
import com.yk.springboot.calculator_app.model.Multiply;
import com.yk.springboot.calculator_app.model.Subtract;

import java.util.*;

public class MathOperation {
    private Map<Integer, Object> operations;

    public MathOperation(int a, int b) {
        this.operations = new TreeMap<>();
        operations.put(1, new Addition().addNumbers(a, b));
        operations.put(2, new Subtract().subtractNumbers(a, b));
        operations.put(3, new Multiply().multiplyNumbers(a, b));
        operations.put(4, new Divide().divideNumbers(a, b));
    }

    public Map<Integer, Object> getOperations() {
        return operations;
    }
}
