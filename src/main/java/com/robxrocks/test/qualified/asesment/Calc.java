package com.robxrocks.test.qualified.asesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Calc {

    public double evaluate(String expr) {
        String regexForValues = "[0-9.]+";
        String regexForOperators = "[+-/*/]+";
        double result = 0;

        List<String> expressionList = Arrays.asList(expr.split(" "));
        List<Double> valuesList = new ArrayList<>();
        expressionList.forEach(value -> {
            if(Pattern.matches(regexForValues, value)) {
                valuesList.add(Double.valueOf(value));
            }
        });
        Collections.reverse(valuesList);

        List<String> operatorsList = new ArrayList<>();
        expressionList.forEach(value -> {
            if(Pattern.matches(regexForOperators, value)) {
                operatorsList.add(value);
            }
        });
        Collections.reverse(operatorsList);

        if (expr.isEmpty()) {
            return result;
        }
        if (operatorsList.isEmpty()) {
            return Double.valueOf(expressionList.get(expressionList.size() -1));
        } else {
            result = valuesList.get(0);
            for (int i = 1; i < valuesList.size(); i++) {
                for (int j = 0; j < operatorsList.size(); j++) {
                    String operator = operatorsList.get(j);
                    if (operator.equals("+")) {
                        result = valuesList.get(i) + result;
                    }
                    if (operator.equals("-")) {
                        result = valuesList.get(i) - result;
                    }
                    if (operator.equals("*")) {
                        result = valuesList.get(i) * result;
                    }
                    if (operator.equals("/")) {
                        result = valuesList.get(i) / result;
                    }
                }
            }
        }

        return result;
    }

}
