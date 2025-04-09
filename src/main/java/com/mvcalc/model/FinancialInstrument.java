package com.mvcalc.model;

import java.math.BigDecimal;

/**
 * Abstract base class for all financial instruments.
 */
public abstract class FinancialInstrument {
    private final String instrumentId;

    /**
     * Constructs a financial instrument with the specified ID.
     * 
     * @param instrumentId the unique identifier for this instrument
     */
    protected FinancialInstrument(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    /**
     * Gets the instrument ID.
     * 
     * @return the instrument ID
     */
    public String getInstrumentId() {
        return instrumentId;
    }

    /**
     * Gets the market price of this instrument.
     * 
     * @return the market price
     */
    public abstract BigDecimal getPrice();
}
