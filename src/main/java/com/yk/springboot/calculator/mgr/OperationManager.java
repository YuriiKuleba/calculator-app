package com.yk.springboot.calculator.mgr;

import com.yk.springboot.calculator.MathOperationContainer;
import com.yk.springboot.calculator.operations.Operation;

public class OperationManager {

    private static OperationManager instance;

    private final MathOperationContainer operationContainer;

    private OperationManager() {
        operationContainer = new MathOperationContainer();
    }

    public static OperationManager getInstance() {
        if (instance == null) {
            instance = new OperationManager();
        }
        return instance;
    }

    public Operation retrieveOperation(String mathOperation) {
        return operationContainer.getOperation(mathOperation);
    }

}
