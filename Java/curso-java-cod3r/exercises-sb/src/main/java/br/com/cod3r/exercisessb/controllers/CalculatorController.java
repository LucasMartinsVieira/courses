package br.com.cod3r.exercisessb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("calculator")
public class CalculatorController {

    @GetMapping("/sum/{x}/{y}")
    public int sum(@PathVariable int x, @PathVariable int y) {
        return x + y;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        return a - b;
    }
}
