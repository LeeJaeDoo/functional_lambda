package com.company.mapReduce;

import java.math.BigDecimal;

/**
 * @author Jaedoo Lee
 */
public class StockInfo {
    public final String ticker;
    public final BigDecimal price;

    public StockInfo(final String ticker, final BigDecimal price) {
        this.ticker = ticker;
        this.price = price;
    }

    public String toString() {
        return String.format("ticker: %s price: $g", ticker, price);
    }
}
