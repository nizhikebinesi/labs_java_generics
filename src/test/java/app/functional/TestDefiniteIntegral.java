package app.functional;

import app.function.BinomialFunction;
import app.function.FractionFunction;
import app.function.Function;
import app.function.SinFunction;
import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;
import app.functional.exceptions.SegmentOfIntegralOutOfFunctionSegment;
import org.junit.Assert;
import org.junit.Test;

import static app.constants.Constants.EPS;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by 1 on 23.04.2017.
 */
public class TestDefiniteIntegral {
    @Test
    public void testComputeSin() throws SegmentOfIntegralOutOfFunctionSegment, OutOfSegmentException, OutOfDomainException, IncorrectDomainException {
        SinFunction sin = new SinFunction(-100, 100, 1,1);
        DefiniteIntegral<Function> integral = new DefiniteIntegral<>(sin, 0, 2*Math.PI, 10000);
        Assert.assertEquals(0, integral.compute(), EPS);
    }

    @Test(expected = OutOfDomainException.class)
    public void testComputeFractionRight()throws SegmentOfIntegralOutOfFunctionSegment, OutOfSegmentException, OutOfDomainException, IncorrectDomainException  {
        FractionFunction fractionFunction = new FractionFunction(-100, 100, 0, 1,1, 0);
        DefiniteIntegral<FractionFunction> integral = new DefiniteIntegral<FractionFunction>(fractionFunction, -1, 0, 1000);
        integral.compute();
        //Assert.assertEquals(integral.compute(), 158, EPS);
        fail();
    }

    @Test(expected = OutOfDomainException.class)
    public void testComputeFractionLeft() throws SegmentOfIntegralOutOfFunctionSegment, OutOfSegmentException, OutOfDomainException, IncorrectDomainException {
        FractionFunction fractionFunction = new FractionFunction(-100, 100, 0, 1,1, 0);
        DefiniteIntegral<FractionFunction> integral = new DefiniteIntegral<FractionFunction>(fractionFunction, 0, 1, 1000);
        integral.compute();
        //Assert.assertEquals(integral.compute(), 158, EPS);
        fail();
    }

    @Test
    public void testCompute() throws OutOfSegmentException, IncorrectDomainException, OutOfDomainException, SegmentOfIntegralOutOfFunctionSegment {
        DefiniteIntegral<BinomialFunction> integral =
                new DefiniteIntegral(
                        new BinomialFunction(-100, 100, 1, 0),
                        0,
                        1);
        double expected = 0.5,
                actual = integral.compute();
        assertEquals(expected, actual, EPS);
    }
}
