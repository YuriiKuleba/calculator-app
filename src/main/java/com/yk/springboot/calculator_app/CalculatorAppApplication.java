package com.yk.springboot.calculator_app;

import com.yk.springboot.calculator_app.service.CalculatorConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorAppApplication.class, args);

        CalculatorConfig config = new CalculatorConfig();
        config.calculateNumbers();
    }

}
