package com.robxrocks.test.qualified.asesment;

import java.util.regex.Pattern;

public class CreditCard {

    public static String maskify(String creditCardNumber) {
        final int MIN_NUMBER_OF_CHARACTERS_TO_NOT_MASK = 5;
        final int LAST_CHAR_FROM_END_TO_HASH = 4;
        final String HASH_CHAR = "#";
        String regex = "[0-9]";
        char[] creditCardNumberArray = creditCardNumber.toCharArray();

        if (creditCardNumber.length() > MIN_NUMBER_OF_CHARACTERS_TO_NOT_MASK) {
            for(int i = 1; i < creditCardNumber.length() - LAST_CHAR_FROM_END_TO_HASH; i++) {
                char charToHash = creditCardNumberArray[i];
                if (Pattern.matches(regex, String.valueOf(charToHash))) {
                    creditCardNumberArray[i] = HASH_CHAR.charAt(0);
                }
            }
        }

        return String.valueOf(creditCardNumberArray);
    }

}
