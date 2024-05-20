package br.com.cod3r.calc.model;

import java.util.ArrayList;
import java.util.List;

public class Memory {
    private enum TypeCommand {
        RESET, NUMBER, SIGNAL, DIV, MULT, SUB, SUM, EQUALS, DOT
    }

    private static final Memory instance = new Memory();
    private final List<MemoryObserver> observers = new ArrayList<>();
    private TypeCommand lastOperator = null;
    private boolean substitute = false;
    private String currentText = "";
    private String bufferText = "";

    private Memory() {

    }

    public static Memory getInstance() {
        return instance;
    }

    public void addObserver(MemoryObserver observer) {
        observers.add(observer);
    }

    public String getCurrentText() {
        return currentText.isEmpty() ? "0" : currentText;
    }

    public void processCommand(String text) {

        TypeCommand typeCommand = detectTypeCommand(text);

        if (typeCommand == null) {
            return;
        } else if (typeCommand == TypeCommand.RESET) {
            currentText = "";
            bufferText = "";
            substitute = false;
            lastOperator = null;
        } else if (typeCommand == TypeCommand.SIGNAL && currentText.contains("-")) {
            currentText = "-" + currentText.substring(1);
        } else if (typeCommand == TypeCommand.SIGNAL && !currentText.contains("-")) {
            currentText = "-" + currentText;
        } else if (typeCommand == TypeCommand.NUMBER || typeCommand == TypeCommand.DOT) {
            currentText = substitute ? text : currentText + text;
            substitute = false;
        } else {
            substitute = true;
            currentText = getOperationResult();
            lastOperator = typeCommand;
            bufferText = currentText;
        }

        observers.forEach(o -> o.alteredValue(getCurrentText()));
    }

    private String getOperationResult() {
        if (lastOperator == null || lastOperator == TypeCommand.EQUALS) {
            return currentText;
        }

        double bufferNumber = Double.parseDouble(bufferText.replace(",", "."));
        double currentNumber = Double.parseDouble(currentText.replace(",", "."));

        double result = 0;

        if (lastOperator == TypeCommand.SUM) {
            result = bufferNumber + currentNumber;
        } else if (lastOperator == TypeCommand.SUB) {
            result = bufferNumber - currentNumber;
        } else if (lastOperator == TypeCommand.MULT) {
            result = bufferNumber * currentNumber;
        } else if (lastOperator == TypeCommand.DIV) {
            result = bufferNumber / currentNumber;
        }

        String stringResult = Double.toString(result);
        boolean isInt = stringResult.endsWith(".0");

        return isInt ? stringResult.replace(".0", "") : stringResult;
    }

    private TypeCommand detectTypeCommand(String text) {
        if (currentText.isEmpty() && text == "0") {
            return null;
        }

        try {
            Integer.parseInt(text);
            return TypeCommand.NUMBER;
        } catch (NumberFormatException e) {
            // When is not a number...
            if ("AC".equals(text)) {
                return TypeCommand.RESET;
            } else if ("/".equals(text)) {
                return TypeCommand.DIV;
            } else if ("*".equals(text)) {
                return TypeCommand.MULT;
            } else if ("+".equals(text)) {
                return TypeCommand.SUM;
            } else if ("-".equals(text)) {
                return TypeCommand.SUB;
            } else if ("=".equals(text)) {
                return TypeCommand.EQUALS;
            } else if ("±".equals(text)) {
                return TypeCommand.SIGNAL;
            } else if (".".equals(text) && !currentText.contains(".")) {
                return TypeCommand.DOT;
            }
        }
        return null;
    }
}
