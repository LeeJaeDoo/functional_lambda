package com.company.dp;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static com.company.dp.Memoizer.callMemoized;

/**
 * @author Jaedoo Lee
 */
public class RodCutterBasic {
    final List<Integer> prices;

    public RodCutterBasic(List<Integer> prices) {
        this.prices = prices;
    }

    public int maxProfit(final int rodLength) {
        BiFunction<Function<Integer, Integer>, Integer, Integer> compute =
            (func, length) -> {
                int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
                for (int i = 1; i < length; i++) {
                    int priceWhenCut = func.apply(i) + func.apply(length - i);
                    if (profit < priceWhenCut) profit = priceWhenCut;
                }
                return profit;
            };
        return callMemoized(compute, rodLength);
    }

    public int maxProfit1(final int length) {
        System.out.println("length : " + length);
        int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
        for (int i = 1; i < length; i++) {
            int priceWhenCut = maxProfit(i) + maxProfit(length - i);
            System.out.println(i + " " + length + " " + i + " " + priceWhenCut);
            if (profit < priceWhenCut) profit = priceWhenCut;
        }

        return profit;
    }
}
