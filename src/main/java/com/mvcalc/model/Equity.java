package com.mvcalc.model;

import java.math.BigDecimal;

/**
 * Represents an equity instrument like stocks or shares.
 */
public class Equity extends FinancialInstrument {
    private final BigDecimal price;
    private final int quantity;
    
    /**
     * Constructs an equity instrument.
     * 
     * @param instrumentId the unique identifier
     * @param price the current market price
     * @param quantity the number of shares
     */
    public Equity(String instrumentId, BigDecimal price, int quantity) {
        super(instrumentId);
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public BigDecimal getPrice() {
        return price;
    }
    
    /**
     * Gets the quantity of shares.
     * 
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }
}
