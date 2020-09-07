package ObjectOriented.ExceptionDemo;

public class RegisterException extends Exception{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
