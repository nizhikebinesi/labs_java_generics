package app.functional;

import app.function.IFunction;
import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;
import app.functional.exceptions.SegmentOfIntegralOutOfFunctionSegment;

/**
 * Created by 1 on 23.04.2017.
 */
public abstract class Functional<SomeFunction extends IFunction> implements IFunctional {
    private IFunction function;

    public Functional(IFunction function) {
        this.function = function;
    }

    protected double computeValueOfFunction(double x) throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException {
        return function.compute(x);
    }

    protected double getLeftEndOfFunctionSegment() throws OutOfSegmentException, IncorrectDomainException {
        return function.getLeft();


    }

    protected double getRightEndOfFunctionSegment() throws OutOfSegmentException, IncorrectDomainException {
        return function.getRight();
    }

    public double compute() throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException, SegmentOfIntegralOutOfFunctionSegment {
        return 0;
    }
}
