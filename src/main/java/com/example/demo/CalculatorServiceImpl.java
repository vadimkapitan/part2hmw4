package com.example.demo;


@org.springframework.stereotype.Service
public class CalculatorServiceImpl implements ServiceCalculator {
    public String welcome(String welcome) {
        return "Добро пожаловать в калькулятор.";
    }

    public int plusValue(int num1, int num2) {
        return num1 + num2;

    }

    public int minusValue(int num1, int num2) {
        return num1 - num2;

    }

    public int multyplyValue(int num1, int num2) {
        return num1 * num2;

    }

    public int divideValue(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return num1 / num2;
    }
}
