package app.exceptions;

/**
 * Created by 1 on 11.04.2017.
 */
public class InfinityCountOfSolutionsException extends Exception {
    public InfinityCountOfSolutionsException() {
    }

    public InfinityCountOfSolutionsException(String message) {
        super(message);
    }

    public InfinityCountOfSolutionsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InfinityCountOfSolutionsException(Throwable cause) {
        super(cause);
    }

    public InfinityCountOfSolutionsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
