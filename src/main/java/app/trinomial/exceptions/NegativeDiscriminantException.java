package app.trinomial.exceptions;

/**
 * Created by 1 on 11.04.2017.
 */
public class NegativeDiscriminantException extends Exception {
    public NegativeDiscriminantException() {
    }

    public NegativeDiscriminantException(String message) {
        super(message);
    }

    public NegativeDiscriminantException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeDiscriminantException(Throwable cause) {
        super(cause);
    }

    public NegativeDiscriminantException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
