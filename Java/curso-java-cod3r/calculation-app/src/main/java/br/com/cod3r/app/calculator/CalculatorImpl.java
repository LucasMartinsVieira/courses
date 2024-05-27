package br.com.cod3r.app.calculator;

import br.com.cod3r.app.Calculator;
import br.com.cod3r.app.calculator.internal.ArithmeticOperations;
import br.com.cod3r.app.logging.Logger;

public class CalculatorImpl implements Calculator {

    private String id = "abc";

    private ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    @Override
    public double sum(double... nums) {
        Logger.info("Somando...");
        return arithmeticOperations.soma(nums);
    }

    public String getId() {
        return id;
    }
}