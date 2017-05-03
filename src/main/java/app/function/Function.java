package app.function;

import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;

/**
 * Created by 1 on 23.04.2017.
 */
public abstract class Function implements IFunction {
    private double left, right;

    public Function(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public double compute(double x) throws OutOfSegmentException, IncorrectDomainException, ArithmeticException, OutOfDomainException {
        return 0;
    }

    public boolean isInSegment(double x) {
        return (left <= x) && (x <= right);
    }

    public boolean isCorrectSegment() {
        return left <= right;
    }
}
