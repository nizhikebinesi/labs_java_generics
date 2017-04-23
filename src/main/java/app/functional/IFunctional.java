package app.functional;

import app.function.IFunction;
import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;

/**
 * Created by 1 on 23.04.2017.
 */
public interface IFunctional<SomeFunction extends IFunction> {
    double compute() throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException, ArithmeticException;
}
