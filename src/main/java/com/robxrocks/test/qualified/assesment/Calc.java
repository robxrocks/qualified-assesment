package com.robxrocks.test.qualified.assesment;

import java.util.*;
import java.util.regex.Pattern;

public class Calc {

    public double evaluate(String expr) {
        String regexForValues = "[0-9.]+";
        String regexForOperators = "[+-/*/]+";

        if (expr.isEmpty()) {
            return 0;
        }

        List<String> expressionList = Arrays.asList(expr.split(" "));
        Stack valuesStack = new Stack();
        for (int i = 0; i < expressionList.size(); i++) {
            String expressionListItem = expressionList.get(i);
            if(Pattern.matches(regexForValues, expressionListItem)) {
                valuesStack.push(Double.valueOf(expressionListItem));
            } else if(Pattern.matches(regexForOperators, expressionListItem)) {
                valuesStack.push(calculate(valuesStack, expressionListItem));
            }
        }

        return (Double) valuesStack.pop();
    }

    private Double calculate(Stack valuesStack, String operator) {
        Double result = (Double) valuesStack.pop();

                if (operator.equals("+")) {
                    result = (Double) valuesStack.pop() + result;
                }
                if (operator.equals("-")) {
                    result = (Double) valuesStack.pop() - result;
                }
                if (operator.equals("*")) {
                    result = (Double) valuesStack.pop() * result;
                }
                if (operator.equals("/")) {
                    result = (Double) valuesStack.pop() / result;
                }

        return result;
    }

}
