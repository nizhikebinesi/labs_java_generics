package app.trinomial.exceptions;

/**
 * Created by 1 on 11.04.2017.
 */
public class IsNotEquationException extends Exception {
    public IsNotEquationException() {
    }

    public IsNotEquationException(String message) {
        super(message);
    }

    public IsNotEquationException(String message, Throwable cause) {
        super(message, cause);
    }

    public IsNotEquationException(Throwable cause) {
        super(cause);
    }

    public IsNotEquationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
