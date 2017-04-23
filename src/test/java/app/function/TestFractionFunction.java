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
