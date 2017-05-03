package app.function;

import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;
import org.junit.Assert;
import org.junit.Test;

import static app.constants.Constants.EPS;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by 1 on 23.04.2017.
 */
public class TestFractionFunction {
    @Test(expected = IncorrectDomainException.class)
    public void testComputeIncorrect() throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException {
        FractionFunction function = new FractionFunction(1, -1, 0, 1, 1, 0);
        function.compute(0);
    }

    @Test(expected = OutOfDomainException.class)
    public void testComputeOutOfDomain() throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException {
        FractionFunction function = new FractionFunction(0, 1, 0, 1, 1, 0);
        function.compute(0);
    }

    @Test(expected = OutOfSegmentException.class)
    public void testComputeOutOfSegment() throws IncorrectDomainException, OutOfSegmentException, OutOfDomainException {
        FractionFunction function = new FractionFunction(0, 0, 2, 3, 4, 5);
        function.compute(-1);
    }

    @Test
    public void testCompute() throws OutOfSegmentException, IncorrectDomainException, OutOfDomainException {
        FractionFunction function =
                new FractionFunction(-100, 100, 1, 0, 2, 0);
        double x = 1.0;
        double expected = 0.5,
                actual = function.compute(x);
        assertEquals(expected, actual, EPS);
    }
}
