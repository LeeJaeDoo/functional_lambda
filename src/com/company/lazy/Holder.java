package com.company.lazy;

import java.util.function.Supplier;

/**
 * @author Jaedoo Lee
 */
public class Holder {
    private Supplier<Heavy> heavy = this::createAndCacheHeavy;

    private final Integer num;

    private synchronized Heavy createAndCacheHeavy() {
        class HeavyFactory implements Supplier<Heavy> {
            private final Heavy heavyInstance = new Heavy();

            public Heavy get() {return heavyInstance;}
        }

        if(!(heavy instanceof HeavyFactory)) {
            heavy = new HeavyFactory();
        }

        return heavy.get();
    }

    public Holder(Integer num) {
        this.num = num;
        System.out.println("Holder created");
    }

    public Heavy getHeavy() {
        return heavy.get();
    }
}
