package app.function;

import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;

/**
 * Created by 1 on 23.04.2017.
 */
public interface IFunction {
    void setLeft(double left);
    void setRight(double right);
    //void setX(double x);
    double getLeft();
    double getRight();
    //double getX();
    double compute(double x) throws OutOfSegmentException, IncorrectDomainException, ArithmeticException, OutOfDomainException;
    boolean isInSegment(double x);
    boolean isCorrectDomain();
}
