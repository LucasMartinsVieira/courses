package br.com.cod3r.app.financial;
import br.com.cod3r.app.Calculator;

import java.util.ServiceLoader;

public class Test {
    public static void main(String[] args) {

        Calculator calc = ServiceLoader
                .load(Calculator.class)
                .findFirst()
                .get();
        System.out.println(calc.sum(2, 3, 4));
//
//        try {
//            Field fieldId = calc.getClass().getDeclaredFields()[0];
//            fieldId.setAccessible(true);
//            fieldId.set(calc, "def");
//            fieldId.setAccessible(false);
//
//            System.out.println(calc.getId());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
