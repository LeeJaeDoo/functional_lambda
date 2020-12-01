package com.company.mapReduce;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jaedoo Lee
 */
public class PickStockImperative {
    final List<StockInfo> stocks = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(BigDecimal.TEN.compareTo(BigDecimal.ZERO) < 0);
    }

    public static boolean isTenUnit(BigDecimal src) {
        if (src == null) {
            return false;
        }
        return src.remainder(BigDecimal.TEN).equals(BigDecimal.ZERO);
    }
}
