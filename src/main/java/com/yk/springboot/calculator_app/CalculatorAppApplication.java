package com.yk.springboot.calculator_app;

import com.yk.springboot.calculator_app.config.CalculatorConfig;

//@SpringBootApplication
public class CalculatorAppApplication {

    public static void main(String[] args) {
//        SpringApplication.run(CalculatorAppApplication.class, args);

        CalculatorConfig config = new CalculatorConfig();
        config.calculateNumbers();
    }

}
