package app.function;

import app.constants.Constants;
import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfSegmentException;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static app.constants.Constants.EPS;

/**
 * Created by 1 on 23.04.2017.
 */
public class TestBinomialFunction {
    @Test
    public void testCompute() throws OutOfSegmentException, IncorrectDomainException {
        BinomialFunction function =
                new BinomialFunction(-1, 23, 1.0, 1.0);
        double x = 2.0;
        double expected = 3.0,
                actual = function.compute(x);
        assertEquals(expected, actual, EPS);
    }
}
