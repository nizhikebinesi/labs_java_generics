package app.function;

import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfSegmentException;

/**
 * Created by 1 on 23.04.2017.
 */
public class BinomialFunction extends Function implements IFunction {
    private double A, B;

    public BinomialFunction(double left, double right, double a, double b) {
        super(left, right);
        A = a;
        B = b;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    @Override
    public double compute(double x) throws OutOfSegmentException, IncorrectDomainException, ArithmeticException {
        if (!isInSegment(x)) {
            throw new OutOfSegmentException("x = " + x
                    + " is out of domain: [a; b] = " + "[" + super.getLeft()
                    + "; " + super.getRight() + "]");
        } else if (!isCorrectSegment()) {
            throw new IncorrectDomainException("Incorrect domain: [a; b] = "
                    + "[" + super.getLeft() + "; " + super.getRight() + "]");
        } else {
            return A * x + B;
        }
    }
}
