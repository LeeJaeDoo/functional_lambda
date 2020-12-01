package com.company;

/**
 * @author Jaedoo Lee
 */

@FunctionalInterface
public interface UseInstance<T, X extends Throwable> {
    void accept(T instance) throws X;
}
