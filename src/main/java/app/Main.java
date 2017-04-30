package app;

import app.function.SinFunction;
import app.function.exceptions.IncorrectDomainException;
import app.function.exceptions.OutOfDomainException;
import app.function.exceptions.OutOfSegmentException;
import app.functional.DefiniteIntegral;
import app.functional.exceptions.SegmentOfIntegralOutOfFunctionSegment;
import app.trinomial.SquareTrinomial;
import app.trinomial.exceptions.InfinityCountOfSolutionsException;
import app.trinomial.exceptions.IsNotEquationException;
import app.trinomial.exceptions.NegativeDiscriminantException;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by 1 on 14.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        try {
            SquareTrinomial trinomial = new SquareTrinomial(1, 2, 1);
            double[] roots = trinomial.solve();

            System.out.println("Equation:\n" + trinomial + " = 0");

            System.out.println("Count of roots: " + roots.length);

            System.out.println("Roots:");

            for (int i = 0; i < roots.length; i++) {
                System.out.print("root[" + (i + 1) + "] = " + roots[i] + "\n");
            }
            System.out.println();
        } catch (NegativeDiscriminantException e) {
            e.printStackTrace();
        } catch (IsNotEquationException e) {
            e.printStackTrace();
        } catch (InfinityCountOfSolutionsException e) {
            e.printStackTrace();
        }


        try {
            SinFunction sin = new SinFunction(0, Math.PI, 1, 0);
            DefiniteIntegral<SinFunction> integral =
                    new DefiniteIntegral<SinFunction>(sin, 0, Math.PI, 50);
            System.out.println("DefiniteIntegral of (sin) = " + integral.compute());
        } catch (SegmentOfIntegralOutOfFunctionSegment e) {
            System.err.println(e);
        } catch (OutOfSegmentException e) {
            System.err.println(e);
        } catch (OutOfDomainException e) {
            System.err.println(e);
        } catch (IncorrectDomainException e) {
            System.err.println(e);
        }
    }

}