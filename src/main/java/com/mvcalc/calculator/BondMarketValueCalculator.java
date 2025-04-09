package com.mvcalc.calculator;

import com.mvcalc.model.Bond;
import java.math.BigDecimal;

/**
 * Calculator for bond market values.
 * Market value for bond = price * par_value + accrued interest
 */
public class BondMarketValueCalculator implements MarketValueCalculator<Bond> {

    @Override
    public BigDecimal calculateMarketValue(Bond bond) {
        // Price is typically quoted as a percentage of par value
        BigDecimal cleanPrice = bond.getPrice().multiply(bond.getParValue());
        return cleanPrice.add(bond.getAccruedInterest());
    }
}
