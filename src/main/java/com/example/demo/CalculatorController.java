package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final ServiceCalculator service;

    public CalculatorController(ServiceCalculator service) {
        this.service = service;
    }

    @GetMapping
    public String welcome() {
        return service.welcome("Добро пожаловать в калькулятор.");
    }

    @GetMapping(path = "/plus")
    public String plusValue(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " + " + num2 + " = " + service.plusValue(num1, num2);


    }

    @GetMapping(path = "/minus")
    public String minusValue(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + service.minusValue(num1, num2);

    }

    @GetMapping(path = "/multiply")
    public String multyplyValue(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + service.multyplyValue(num1, num2);

    }

    @GetMapping(path = "/divide")
    public String divideValue(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " / " + num2 + " = " + service.divideValue(num1, num2);
    }
}

