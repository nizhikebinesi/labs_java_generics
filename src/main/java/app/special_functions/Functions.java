package app.special_functions;

import static app.constants.Constants.EPS;

/**
 * Created by 1 on 23.04.2017.
 */
public final class Functions {
    public static boolean equal(double a, double b) {
        return Math.abs(a - b) < EPS;
    }

    public static boolean lessOrEqual(double a, double b) {
        return a < b || equal(a, b);
    }

    public static boolean less(double a, double b) {
        return a < b && !equal(a, b);
    }

    public static boolean greaterOrEqual(double a, double b) {
        return !less(a, b);
    }

    public static boolean greater(double a, double b) {
        return greaterOrEqual(a, b) && !equal(a, b);
    }
}
