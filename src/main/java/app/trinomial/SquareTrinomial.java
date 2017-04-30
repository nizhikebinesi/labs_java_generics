package app.trinomial;

import app.trinomial.exceptions.InfinityCountOfSolutionsException;
import app.trinomial.exceptions.IsNotEquationException;
import app.trinomial.exceptions.NegativeDiscriminantException;

import java.util.ArrayList;

import static app.constants.Constants.EPS;


public class SquareTrinomial {
    private double a, b, c;
    private final double ZERO = 0.0;

    public SquareTrinomial() {

    }

    public SquareTrinomial(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public /*ArrayList<Double>*/double[] solve() throws NegativeDiscriminantException, IsNotEquationException, InfinityCountOfSolutionsException {
        if (Math.abs(a - ZERO) < EPS && Math.abs(b - ZERO) < EPS)  {
            // c = 0
            if (Math.abs(c - ZERO) >= EPS) {
                throw new IsNotEquationException();
            }
            // 0 = 0
            throw new InfinityCountOfSolutionsException();
        }

        ArrayList<Double> result = new ArrayList<Double>();

        if (Math.abs(a - ZERO) < EPS) {
            // b * x + c = 0
            if (Math.abs(b - ZERO) >= EPS) {
            result.add(- b / c);
            }
            // b * x = 0
            else {
                result.add(ZERO);
            }
        } else {
            // a * x ^ 2 + b * x + c = 0
            double discriminant = b * b - 4 * a * c;
            if (discriminant < ZERO) {
                throw new NegativeDiscriminantException();
            } else
            if (Math.abs(discriminant - ZERO) < EPS) {
                double x = - b / (2 * a);
                result.add(x);
            } else {
                double x1, x2;
                x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
                result.add(x1);
                result.add(x2);
            }
        }

        int id = 0;
        double[] res = new double[result.size()];
        for (Double element : result) {
            res[id++] = element;
        }
        return res;
        //return (Double[]) result.toArray();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        String s = a + " * x^2 + " + b + " * x + " + c;
        return s;
    }
}
