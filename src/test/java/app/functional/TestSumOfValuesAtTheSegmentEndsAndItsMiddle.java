package app.functional;

import app.function.BinomialFunction;
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
public class TestSumOfValuesAtTheSegmentEndsAndItsMiddle {
    @Test
    public void testCompute() throws OutOfSegmentException, IncorrectDomainException, OutOfDomainException, SegmentOfIntegralOutOfFunctionSegment {
        SumOfValuesAtTheSegmentEndsAndItsMiddle<BinomialFunction> sum =
                new SumOfValuesAtTheSegmentEndsAndItsMiddle(new BinomialFunction(0, 2, 1, 0));
        double expected = 3.0,
                actual = sum.compute();
        assertEquals(expected, actual, EPS);
    }
}
