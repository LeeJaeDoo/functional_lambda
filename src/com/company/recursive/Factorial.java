package com.company.recursive;

import java.math.BigInteger;

import static com.company.recursive.TailCalls.call;
import static com.company.recursive.TailCalls.done;

/**
 * @author Jaedoo Lee
 */
public class Factorial {
    public static TailCall<Integer> factorialTailRec(final int factorial, final int number) {
        if (number == 1)
            return done(factorial);
        else
            return call(() -> factorialTailRec(factorial * number, number - 1));
    }
}
