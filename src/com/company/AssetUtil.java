package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Jaedoo Lee
 */
public class AssetUtil {

    final static List<Asset> assets = Arrays.asList(
        new Asset(Asset.AssertType.BOND, 1000),
        new Asset(Asset.AssertType.BOND, 2000),
        new Asset(Asset.AssertType.STOCK, 3000),
        new Asset(Asset.AssertType.STOCK, 4000)
    );

    public static int totalAssetValues(final List<Asset> assets) {
        return assets.stream()
                     .mapToInt(Asset::getValue)
                     .sum();
    }

    public static int totalBondValues(final List<Asset> assets) {
        return assets.stream()
                     .mapToInt(asset -> asset.getType() == Asset.AssertType.BOND ? asset.getValue() : 0)
                     .sum();
    }

    public static int totalAssetValues(final List<Asset> assets, final Predicate<Asset> assetSelector) {
        return assets.stream()
                     .filter(assetSelector)
                     .mapToInt(Asset::getValue)
                     .sum();
    }

    public static void print() {
        System.out.println(totalAssetValues(assets, asset -> true));
        System.out.println(totalAssetValues(assets, asset -> asset.getType() == Asset.AssertType.BOND));
        System.out.println(totalAssetValues(assets, asset -> asset.getType() == Asset.AssertType.STOCK));
    }
}
