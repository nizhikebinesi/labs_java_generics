package app.functional;

import app.constants.Constants;
import app.function.IFunction;
import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;
import app.functional.exceptions.SegmentOfIntegralOutOfFunctionSegment;
import app.special_functions.Functions;

import static app.special_functions.Functions.*;

/**
 * Created by 1 on 23.04.2017.
 */

public class DefiniteIntegral<SomeFunction extends IFunction> extends Functional {
    private double leftEnd, rightEnd;
    private int countOfSteps = 20;

    public DefiniteIntegral(IFunction function, double leftEnd, double rightEnd) {
        super(function);
        this.leftEnd = leftEnd;
        this.rightEnd = rightEnd;
    }

    public DefiniteIntegral(IFunction function, double leftEnd, double rightEnd, int countOfSteps) {
        super(function);
        this.leftEnd = leftEnd;
        this.rightEnd = rightEnd;
        this.countOfSteps = countOfSteps;
    }

    public int getCountOfSteps() {
        return countOfSteps;
    }

    public void setCountOfSteps(int countOfSteps) {
        if (countOfSteps < 1) {
            throw new IllegalArgumentException();
        }
        this.countOfSteps = countOfSteps;
    }
//
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

    // если отрезок не совпадает с [af; bf] -> exception
    @Override
    public double compute() throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException, ArithmeticException, SegmentOfIntegralOutOfFunctionSegment {
        double left = getLeftEndOfFunctionSegment(),
                right = getRightEndOfFunctionSegment();

        if (!(greaterOrEqual(left, leftEnd) || lessOrEqual(rightEnd, right))) {
            throw new SegmentOfIntegralOutOfFunctionSegment();
        }
        //if (left > rightEnd || right < leftEnd) {
        /*if (greater(left, rightEnd) || less(right, leftEnd)) {
            throw new SegmentOfIntegralOutOfFunctionSegment();
        }*/

        double a = leftEnd,
                b = rightEnd,
                h = (b - a) / countOfSteps,
                result = 0;

        // for 1/x and x = 0
        computeValueOfFunction(a);
        computeValueOfFunction(b);

        for (int i = 0; i < countOfSteps; i++) {
            result += computeValueOfFunction(a + h * (i + 0.5));
        }
        result *= h;

        return result;
    }
}
