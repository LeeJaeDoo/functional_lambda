package com.company.recursive;

import java.math.BigInteger;

import static com.company.recursive.TailCalls.*;

/**
 * @author Jaedoo Lee
 */
public class BigFactorial {
    private static TailCall<BigInteger> factorialTailRec(final BigInteger factorial, final BigInteger number) {
        if (number.equals(BigInteger.ONE)) {
            return done(factorial);
        } else {
            return call(() -> factorialTailRec(multiply(factorial, number), decrement(number)));
        }
    }

    public static BigInteger factorial(final BigInteger number) {
        return factorialTailRec(BigInteger.ONE, number).invoke();
    }

    public static BigInteger decrement(final BigInteger number) {
        return number.subtract(BigInteger.ONE);
    }

    public static BigInteger multiply(final BigInteger first, final BigInteger second) {
        return first.multiply(second);
    }

    public final static BigInteger ONE = BigInteger.ONE;
    public final static BigInteger FIVE = new BigInteger("5");
    public final static BigInteger TWENTYK = new BigInteger("20000");

    //...
}
