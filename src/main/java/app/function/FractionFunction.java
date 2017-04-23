package app.function;

import app.constants.Constants;
import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;

/**
 * Created by 1 on 23.04.2017.
 */
public class FractionFunction extends Function implements IFunction {
    private double A, B, C, D;

    public FractionFunction(double left, double right, double a, double b, double c, double d) {
        super(left, right);
        A = a;
        B = b;
        C = c;
        D = d;
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

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    public double getD() {
        return D;
    }

    public void setD(double d) {
        D = d;
    }

    @Override
    public double compute(double x) throws OutOfSegmentException, IncorrectDomainException, ArithmeticException, OutOfDomainException {
        if (!isInSegment(x)) {
            throw new OutOfSegmentException("x = " + x
                    + " is out of segment: [a; b] = " + "[" + super.getLeft()
                    + "; " + super.getRight() + "]");
        } else if (!isCorrectSegment()) {
            throw new IncorrectDomainException("Incorrect domain: [a; b] = "
                    + "[" + super.getLeft() + "; " + super.getRight() + "]");
        } else {
            if (Math.abs(C * x + D) < Constants.EPS) {
                throw new OutOfDomainException("x = " + x
                        + " is out of domain: [a; b] = " + "[" + super.getLeft()
                        + "; " + super.getRight() + "]");
            }
            return (A * x + B) / (C * x + D);
        }
    }
}
