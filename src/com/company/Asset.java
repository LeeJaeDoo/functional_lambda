package com.company;

/**
 * @author Jaedoo Lee
 */
public class Asset {
    public enum AssertType {BOND, STOCK};
    private final AssertType type;
    private final int value;

    public Asset(AssertType type, int value) {
        this.type = type;
        this.value = value;
    }

    public AssertType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
