package app.function;

import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfSegmentException;
import org.junit.Assert;
import org.junit.Test;

import static app.constants.Constants.EPS;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by 1 on 23.04.2017.
 */
public class TestExponentFunction {
    @Test
    public void testCompute() throws OutOfSegmentException, IncorrectDomainException {
        ExponentFunction function =
                new ExponentFunction(-1, 23, 1.0, 1.2);
        double x = 0.0;
        double expected = 2.2,
                actual = function.compute(x);
        assertEquals(expected, actual, EPS);
    }
}
