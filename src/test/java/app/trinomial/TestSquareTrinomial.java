package app.trinomial;

import app.constants.Constants;
import app.trinomial.SquareTrinomial;
import app.trinomial.exceptions.InfinityCountOfSolutionsException;
import app.trinomial.exceptions.IsNotEquationException;
import app.trinomial.exceptions.NegativeDiscriminantException;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;

/**
 * Created by 1 on 23.04.2017.
 */
public class TestSquareTrinomial {

    @Test
    public void testSolvingSquareEquation1() throws IsNotEquationException, InfinityCountOfSolutionsException, NegativeDiscriminantException {
        SquareTrinomial squareTrinomial = new SquareTrinomial(1, 2, 1);
        double[] solution = squareTrinomial.solve();
        double[] expected = {-1.0};
        Assert.assertArrayEquals(solution, expected, Constants.EPS);
    }

    @Test
    public void testSolvingSquareEquation2() throws IsNotEquationException, InfinityCountOfSolutionsException, NegativeDiscriminantException {
        SquareTrinomial squareTrinomial = new SquareTrinomial(1, 2*Math.sqrt(2), 2);
        double[] solution = squareTrinomial.solve();
        double[] expected = {-Math.sqrt(2)};
        Assert.assertArrayEquals(solution, expected, Constants.EPS);
    }

    @Test
    public void testSolvingSquareEquation3() throws IsNotEquationException, InfinityCountOfSolutionsException, NegativeDiscriminantException {
        SquareTrinomial squareTrinomial = new SquareTrinomial(1, -2, -3);
        double[] solution = squareTrinomial.solve();
        double[] expected = {-1, 3};
        Assert.assertArrayEquals(solution, expected, Constants.EPS);
    }

    @Test(expected = NegativeDiscriminantException.class)
    public void testSolvingEquationNegativeDiscriminant() throws IsNotEquationException, InfinityCountOfSolutionsException, NegativeDiscriminantException {
        SquareTrinomial squareTrinomial = new SquareTrinomial(1, 0, 1);
        double[] solution = squareTrinomial.solve();
        fail();
    }

    @Test(expected = IsNotEquationException.class)
    public void testSolvingEquationIsNotEquation() throws IsNotEquationException, InfinityCountOfSolutionsException, NegativeDiscriminantException {
        SquareTrinomial squareTrinomial = new SquareTrinomial(0, 0, 1);
        double[] solution = squareTrinomial.solve();
        fail();
    }

    @Test(expected = InfinityCountOfSolutionsException.class)
    public void testSolvingEquationInfinityCountOfSolutions() throws IsNotEquationException, InfinityCountOfSolutionsException, NegativeDiscriminantException {
        SquareTrinomial squareTrinomial = new SquareTrinomial(0, 0, 0);
        double[] solution = squareTrinomial.solve();
        fail();
    }
}
