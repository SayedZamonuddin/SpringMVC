package com.example.springmvc.controller;

import com.example.springmvc.service.MathService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    private final MathService mathService;
    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/add")
    public ResponseEntity<?> add(@RequestParam double a, @RequestParam double b) {
        return ResponseEntity.ok(mathService.add(a, b));
    }

    @GetMapping("/subtract")
    public ResponseEntity<?> subtract(@RequestParam double a, @RequestParam double b) {
        return ResponseEntity.ok(mathService.subtract(a, b));
    }

    @GetMapping("/multiply")
    public ResponseEntity<?> multiply(@RequestParam double a, @RequestParam double b) {
        return ResponseEntity.ok(mathService.multiply(a, b));
    }

    @GetMapping("/divide")
    public ResponseEntity<?> divide(@RequestParam double a, @RequestParam double b) {
        return ResponseEntity.ok(mathService.divide(a, b));
    }
}
