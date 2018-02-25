package com.robxrocks.test.qualified.assesment;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    @Test
    public void shouldMaskDigitsForBasicCreditCards() {
        assertEquals("5###########0694", CreditCard.maskify("5512103073210694"));
    }

    @Test
    public void shouldNotMaskDigitsForShortCreditCards() {
        assertEquals("54321", CreditCard.maskify("54321"));
    }

    @Test
    public void shouldNotMaskHyphens() {
        assertEquals("4###-####-####-5616", CreditCard.maskify("4556-3646-0793-5616"));
    }

    @Test
    public void shouldHandleEmptyStrings() {
        assertEquals("", CreditCard.maskify(""));
    }

    @Test
    public void shouldNotMaskNonEmptyStrings() {
        assertEquals("Skippy", CreditCard.maskify("Skippy"));
    }

    @Test
    public void shouldMaskOnlySecondDigit() {
        assertEquals("1#3456", CreditCard.maskify("123456"));
    }

}