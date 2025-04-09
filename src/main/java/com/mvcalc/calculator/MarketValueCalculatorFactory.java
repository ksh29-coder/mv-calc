package com.mvcalc.calculator;

import com.mvcalc.model.*;
import java.math.BigDecimal;

/**
 * Factory class that provides a unified interface for market value calculations
 * for different types of financial instruments.
 */
public class MarketValueCalculatorFactory {
    
    private final EquityMarketValueCalculator equityCalculator;
    private final BondMarketValueCalculator bondCalculator;
    private final FutureMarketValueCalculator futureCalculator;
    private final FXForwardMarketValueCalculator fxForwardCalculator;
    
    /**
     * Constructs a new calculator factory with default calculator implementations.
     */
    public MarketValueCalculatorFactory() {
        this.equityCalculator = new EquityMarketValueCalculator();
        this.bondCalculator = new BondMarketValueCalculator();
        this.futureCalculator = new FutureMarketValueCalculator();
        this.fxForwardCalculator = new FXForwardMarketValueCalculator();
    }
    
    /**
     * Calculates the market value for the given financial instrument.
     * 
     * @param instrument the financial instrument
     * @return the calculated market value
     * @throws IllegalArgumentException if the instrument type is not supported
     */
    public BigDecimal calculateMarketValue(FinancialInstrument instrument) {
        if (instrument instanceof Equity) {
            return equityCalculator.calculateMarketValue((Equity) instrument);
        } else if (instrument instanceof Bond) {
            return bondCalculator.calculateMarketValue((Bond) instrument);
        } else if (instrument instanceof Future) {
            return futureCalculator.calculateMarketValue((Future) instrument);
        } else if (instrument instanceof FXForward) {
            return fxForwardCalculator.calculateMarketValue((FXForward) instrument);
        } else {
            throw new IllegalArgumentException("Unsupported instrument type: " + instrument.getClass().getName());
        }
    }
}
