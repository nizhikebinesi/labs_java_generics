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
public class TestSinFunction {
    @Test
    public void testCompute() throws OutOfSegmentException, IncorrectDomainException {
        SinFunction function =
                new SinFunction(-100, 100, 23, 1);
        double x = Math.PI / 2;
        double expected = 23.0,
                actual = function.compute(x);
        assertEquals(expected, actual, EPS);
    }
}
