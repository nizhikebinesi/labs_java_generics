package app.functional;

import app.function.Function;
import app.function.IFunction;
import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;

/**
 * Created by 1 on 23.04.2017.
 */
public class Functional<SomeFunction extends IFunction> implements IFunctional {
    private IFunction function;

    public Functional(IFunction function) {
        this.function = function;
    }

    protected double computeValueOfFunction(double x) throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException {
        return function.compute(x);
    }

    protected double getLeftEndOfFunctionSegment() {
        return function.getLeft();
    }

    protected double getRightEndOfFunctionSegment() {
        return function.getRight();
    }

    @Override
    public double compute() throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException {
        return 0;
    }
}
