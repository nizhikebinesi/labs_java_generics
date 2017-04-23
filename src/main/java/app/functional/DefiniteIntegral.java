package app.functional;

import app.function.IFunction;
import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;

/**
 * Created by 1 on 23.04.2017.
 */
public class DefiniteIntegral<SomeFunction extends IFunction> extends Functional {
    private double leftEnd, rightEnd;

    public DefiniteIntegral(IFunction function, double leftEnd, double rightEnd) {
        super(function);
        this.leftEnd = leftEnd;
        this.rightEnd = rightEnd;
    }

    public double getLeftEnd() {
        return leftEnd;
    }

    public void setLeftEnd(double leftEnd) {
        this.leftEnd = leftEnd;
    }

    public double getRightEnd() {
        return rightEnd;
    }

    public void setRightEnd(double rightEnd) {
        this.rightEnd = rightEnd;
    }

    public boolean isEndCorrect() {
        return  leftEnd <= rightEnd;
    }

    /*
    if (leftEnd <= left) && (right <= rightEnd) -> 0
    if (leftEnd <= left) && (right > rightEnd) -> 1
    if (leftEnd > left) && (right <= rightEnd) -> 2
    if (leftEnd > left) && (right > rightEnd) -> 3
    */
    private int isDomainInEnds() {
        int result = 3;
        double left = getLeftEndOfFunctionSegment(), right = getRightEndOfFunctionSegment();
        if (leftEnd <= left & right <= rightEnd) {
            result = 0;
        } else if (leftEnd <= left && right > rightEnd) {
            result = 1;
        } else if (leftEnd > left && right <= rightEnd) {
            result = 2;
        }
        return result;
    }

    @Override
    public double compute() throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException, ArithmeticException {
        return 0;
    }
}
