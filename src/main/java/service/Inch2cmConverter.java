package service;

public class Inch2cmConverter {
    public static String convertINCH (String input) {
        Double inch = Double.valueOf(input);
        Double cm = inch * 2.54;
        return cm.toString();
    }
}