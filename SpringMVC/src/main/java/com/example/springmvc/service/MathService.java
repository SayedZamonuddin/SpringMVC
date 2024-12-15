package com.example.springmvc.service;

import com.example.springmvc.exception.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new DivideByZeroException("Cannot divide by zero.");
        }
        return a / b;
    }
}

