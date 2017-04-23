package app.functional.exceptions;

/**
 * Created by 1 on 23.04.2017.
 */
public class SegmentOfIntegralOutOfFunctionSegment extends Exception {
    public SegmentOfIntegralOutOfFunctionSegment() {
    }

    public SegmentOfIntegralOutOfFunctionSegment(String message) {
        super(message);
    }

    public SegmentOfIntegralOutOfFunctionSegment(String message, Throwable cause) {
        super(message, cause);
    }

    public SegmentOfIntegralOutOfFunctionSegment(Throwable cause) {
        super(cause);
    }

    public SegmentOfIntegralOutOfFunctionSegment(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
