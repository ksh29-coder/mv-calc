package com.mvcalc.calculator;

import com.mvcalc.model.FinancialInstrument;
import java.math.BigDecimal;

/**
 * Interface for calculating market values of financial instruments.
 */
public interface MarketValueCalculator<T extends FinancialInstrument> {
    
    /**
     * Calculates the market value of a financial instrument.
     * 
     * @param instrument the financial instrument
     * @return the calculated market value
     */
    BigDecimal calculateMarketValue(T instrument);
}
