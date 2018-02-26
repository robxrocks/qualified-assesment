package com.robxrocks.test.qualified.assesment;

public class CreditCard {

    public static String maskify(String creditCardNumber) {
        final int MIN_NUMBER_OF_CHARACTERS_TO_NOT_MASK = 5;
        final int LAST_CHAR_FROM_END_TO_HASH = 4;
        final String HASH_CHAR = "#";
        String regex = "[0-9]";

        String hashedPassword;
        if (creditCardNumber.length() > MIN_NUMBER_OF_CHARACTERS_TO_NOT_MASK) {
            String substringToHash = creditCardNumber.substring(1, creditCardNumber.length() - LAST_CHAR_FROM_END_TO_HASH);
            String hashedSubstring = substringToHash.replaceAll(regex, HASH_CHAR);

            hashedPassword = creditCardNumber.substring(0,1)
                    + hashedSubstring
                    + creditCardNumber.substring(creditCardNumber.length() - LAST_CHAR_FROM_END_TO_HASH, creditCardNumber.length());
        } else {
            hashedPassword = creditCardNumber;
        }

        return hashedPassword;
    }

}
