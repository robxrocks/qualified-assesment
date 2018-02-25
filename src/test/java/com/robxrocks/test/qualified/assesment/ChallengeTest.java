package com.robxrocks.test.qualified.assesment;

import com.robxrocks.test.qualified.asesment.Challenge;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTest {

    @Test
    public void shouldHandleSingleDigits() {
        assertEquals("1st", Challenge.numberToOrdinal(1));
        assertEquals("2nd", Challenge.numberToOrdinal(2));
        assertEquals("3rd", Challenge.numberToOrdinal(3));
        assertEquals("4th", Challenge.numberToOrdinal(4));

        assertEquals("33rd", Challenge.numberToOrdinal(33));
        assertEquals("92nd", Challenge.numberToOrdinal(92));
    }

    @Test
    public void shouldHandleTenToThirteen() {
        assertEquals("10th", Challenge.numberToOrdinal(10));
        assertEquals("11th", Challenge.numberToOrdinal(11));
        assertEquals("12th", Challenge.numberToOrdinal(12));
        assertEquals("13th", Challenge.numberToOrdinal(13));
    }

    @Test
    public void shouldHandleOverTwenty() {
        assertEquals("33rd", Challenge.numberToOrdinal(33));
        assertEquals("92nd", Challenge.numberToOrdinal(92));
    }

    @Test
    public void shouldHandleOverHundred() {
        assertEquals("111th", Challenge.numberToOrdinal(111));
        assertEquals("112th", Challenge.numberToOrdinal(112));
        assertEquals("113th", Challenge.numberToOrdinal(113));
    }

}