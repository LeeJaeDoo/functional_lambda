package com.company;

/**
 * @author Jaedoo Lee
 */
public interface FastFly extends Fly {
    default void takeOff() {System.out.println("FastFly::takeOff");}
}
