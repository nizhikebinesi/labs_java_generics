package app;

import app.function.SinFunction;
import app.functional.DefiniteIntegral;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by 1 on 14.04.2017.
 */
public class Main {

    public static void main(String[] args) {
        try {
            SinFunction sin = new SinFunction(0, Math.PI, 1, 0);
            DefiniteIntegral<SinFunction> integral =
                    new DefiniteIntegral<SinFunction>(sin, 0, Math.PI, 50);
            System.out.println("result = " + integral.compute());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}