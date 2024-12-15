package com.example.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public int countVowels(String input) {
        return (int) input.toLowerCase()
                .chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
    }

    public String toUpperCase(String input) {
        return input.toUpperCase();
    }
}

