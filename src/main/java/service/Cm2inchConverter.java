package service;

public class Cm2inchConverter {
    public static String convertCM (String input) {
        Double cm = Double.valueOf(input);
        Double inch = cm / 2.54;
        return inch.toString();
    }
}