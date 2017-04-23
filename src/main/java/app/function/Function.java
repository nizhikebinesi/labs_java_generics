package app.function;

import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;

/**
 * Created by 1 on 23.04.2017.
 */
public class Function implements IFunction {
    private double left, right;

    public Function(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void setLeft(double left) {
        this.left = left;
    }

    @Override
    public void setRight(double right) {
        this.right = right;
    }

    @Override
    public double getLeft() {
        return left;
    }

    @Override
    public double getRight() {
        return right;
    }

    @Override
    public double compute(double x) throws OutOfSegmentException, IncorrectDomainException, ArithmeticException, OutOfDomainException {
        return 0;
    }

    @Override
    public boolean isInSegment(double x) {
        return (left <= x) && (x <= right);
    }

    @Override
    public boolean isCorrectSegment() {
        return left <= right;
    }
}
