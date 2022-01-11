package exception;

public class InputValidatorException extends Exception {

    public InputValidatorException(String message) {
        super(message);
    }

    public InputValidatorException() {
        super();
    }
}