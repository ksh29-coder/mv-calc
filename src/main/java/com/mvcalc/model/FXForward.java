package com.mvcalc.model;

import java.math.BigDecimal;

/**
 * Represents an FX Forward contract.
 */
public class FXForward extends FinancialInstrument {
    private final BigDecimal forwardRate;
    private final BigDecimal quantity;
    
    /**
     * Constructs an FX Forward contract.
     * 
     * @param instrumentId the unique identifier
     * @param forwardRate the interpolated FX forward rate
     * @param quantity the quantity of the base currency
     */
    public FXForward(String instrumentId, BigDecimal forwardRate, BigDecimal quantity) {
        super(instrumentId);
        this.forwardRate = forwardRate;
        this.quantity = quantity;
    }
    
    @Override
    public BigDecimal getPrice() {
        return forwardRate;
    }
    
    /**
     * Gets the interpolated FX forward rate.
     * 
     * @return the forward rate
     */
    public BigDecimal getForwardRate() {
        return forwardRate;
    }
    
    /**
     * Gets the quantity of the base currency.
     * 
     * @return the quantity
     */
    public BigDecimal getQuantity() {
        return quantity;
    }
}
