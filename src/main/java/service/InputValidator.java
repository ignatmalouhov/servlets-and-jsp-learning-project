package service;

import exception.InputValidatorException;

public class InputValidator {

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void validate(String amount, String unit) throws InputValidatorException {

        if (amount == null ||
                amount == "" ||
                unit == null ||
                !isNumeric(amount)) {
            throw new InputValidatorException();
        }
    }
}