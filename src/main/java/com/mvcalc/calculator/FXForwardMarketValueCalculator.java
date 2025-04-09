package com.mvcalc.calculator;

import com.mvcalc.model.FXForward;
import java.math.BigDecimal;

/**
 * Calculator for FX Forward market values.
 * Market value for FX Forward = interpolated FX forward rate * quantity
 */
public class FXForwardMarketValueCalculator implements MarketValueCalculator<FXForward> {

    @Override
    public BigDecimal calculateMarketValue(FXForward fxForward) {
        return fxForward.getForwardRate().multiply(fxForward.getQuantity());
    }
}
