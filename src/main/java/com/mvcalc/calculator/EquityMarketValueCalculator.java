package com.mvcalc.calculator;

import com.mvcalc.model.Equity;
import java.math.BigDecimal;

/**
 * Calculator for equity market values.
 * Market value for equity = price * quantity
 */
public class EquityMarketValueCalculator implements MarketValueCalculator<Equity> {

    @Override
    public BigDecimal calculateMarketValue(Equity equity) {
        return equity.getPrice().multiply(BigDecimal.valueOf(equity.getQuantity()));
    }
}
