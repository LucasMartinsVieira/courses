package br.com.cod3r.exercisessb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/methods")
public class MethodsHttpController {
    @GetMapping
    public String get() {
        return "Request GET";
    }

    @PostMapping
    public String post() {
        return "Request POST";
    }

    @PutMapping
    public String put() {
        return "Request PUT";
    }

    @PatchMapping
    public String patch() {
        return "Request PATCH";
    }

    @DeleteMapping
    public String delete() {
        return "Request DELETE";
    }
}
