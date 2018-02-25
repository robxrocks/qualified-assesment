package com.robxrocks.test.qualified.assesment;

public class Challenge {

    public static String numberToOrdinal( Integer number ) {
        final String ST = "st";
        final String ND = "nd";
        final String RD = "rd";
        final String TH = "th";
        final int TWO_DIGITS = 2;
        String ordinal;

        char[] convertedNumber = String.valueOf(number).toCharArray();
        char lastDigit = convertedNumber[convertedNumber.length - 1];

        if (number == 0) {
            ordinal = "";
        } else if (convertedNumber.length >= TWO_DIGITS && convertedNumber[convertedNumber.length - TWO_DIGITS] == '1') {
            ordinal = TH;
        } else {
            switch (lastDigit) {
                case '1': ordinal = ST;
                    break;
                case '2': ordinal = ND;
                    break;
                case '3': ordinal = RD;
                    break;
                default: ordinal = TH;
                    break;
            }
        }

        return String.valueOf(convertedNumber) + ordinal;
    }
}
