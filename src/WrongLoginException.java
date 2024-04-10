import java.lang.invoke.WrongMethodTypeException;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }
}
