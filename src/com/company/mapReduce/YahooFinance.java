package com.company.mapReduce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Jaedoo Lee
 */
public class YahooFinance {
    public static BigDecimal getPrice(final String ticker) {
        try {
            final URL url =
                new URL("http://ichart.finance.yahoo.com/table.csv?s=" + ticker);

            final BufferedReader reader =
                new BufferedReader(new InputStreamReader(url.openStream()));
            final String data = reader.lines().skip(1).findFirst().get();
            final String[] dataImages = data.split(",");
            return new BigDecimal(dataImages[dataImages.length - 1]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
