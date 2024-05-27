package br.com.cod3r.app.calculator.internal;

import java.util.Arrays;

public class ArithmeticOperations {
    public double soma(double... nums) {
        return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
    }
}
