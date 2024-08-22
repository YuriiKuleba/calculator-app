package com.yk.springboot.calculator;

import com.yk.springboot.calculator.service.CalculatorService;

//@SpringBootApplication
public class CalculatorAppApplication {

    public static void main(String[] args) {
//        SpringApplication.run(CalculatorAppApplication.class, args);

        CalculatorService service = new CalculatorService();
        service.calculateNumbers();
    }

}
