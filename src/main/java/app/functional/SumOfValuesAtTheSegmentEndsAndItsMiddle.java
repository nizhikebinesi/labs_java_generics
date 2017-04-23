package app.functional;

import app.function.Function;
import app.function.IFunction;
import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;

/**
 * Created by 1 on 23.04.2017.
 */
public class SumOfValuesAtTheSegmentEndsAndItsMiddle<SomeFunction extends IFunction> extends Functional {
    public SumOfValuesAtTheSegmentEndsAndItsMiddle(IFunction function) {
        super(function);
    }

    @Override
    public double compute() throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException {
        double left = getLeftEndOfFunctionSegment(), right = getRightEndOfFunctionSegment();
        return computeValueOfFunction(left)
                + computeValueOfFunction(right)
                + computeValueOfFunction(left + (right - left) / 2);
    }
}
