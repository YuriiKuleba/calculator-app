package com.yk.springboot.calculator_app;

import com.yk.springboot.calculator_app.service.CalculatorService;

//@SpringBootApplication
public class CalculatorAppApplication {

    public static void main(String[] args) {
//        SpringApplication.run(CalculatorAppApplication.class, args);

        CalculatorService config = new CalculatorService();
        config.calculateNumbers();
    }

}
