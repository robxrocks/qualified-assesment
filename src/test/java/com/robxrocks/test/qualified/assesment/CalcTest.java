package com.robxrocks.test.qualified.assesment;

import com.robxrocks.test.qualified.asesment.Calc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    private Calc calc = new Calc();

    @Test
    public void shouldParseEmptyString() {
        assertEquals(0, calc.evaluate(""), 0);
    }

    @Test
    public void shouldParseNumbers() {
        assertEquals(3, calc.evaluate("3"), 0);
    }

    @Test
    public void shouldParseFloats() {
        assertEquals(3.5, calc.evaluate("3.5"), 0);
    }

    @Test
    public void shouldSupportAddition() {
        assertEquals(4, calc.evaluate("1 3 +"), 0);
    }

    @Test
    public void shouldSupportMultiplication() {
        assertEquals(3, calc.evaluate("1 3 *"), 0);
    }

    @Test
    public void shouldSupportSubtraction() {
        assertEquals(-2, calc.evaluate("1 3 -"), 0);
    }

    @Test
    public void shouldSupportDivision() {
        assertEquals(2, calc.evaluate("4 2 /"), 0);
    }

    @Test
    public void shouldReturnLastValueIfNoOperators() {
        assertEquals(2, calc.evaluate("4 3 2"), 0);
    }

    @Test
    public void shouldReturnFloatIfNoOperators() {
        assertEquals(2.5, calc.evaluate("4 3 2.5"), 0);
    }

    @Test
    public void shouldSupportTwoOperators() {
        assertEquals(3, calc.evaluate("3 2 1 - *"), 0);
    }

    @Test
    public void shouldSupportComplexExpression() {
        assertEquals(6, calc.evaluate("7 4 5 + * 3 - 10 /"), 0);
    }

}