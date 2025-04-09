package com.mvcalc.model;

import java.math.BigDecimal;

/**
 * Represents a bond instrument.
 */
public class Bond extends FinancialInstrument {
    private final BigDecimal price;
    private final BigDecimal parValue;
    private final BigDecimal accruedInterest;
    
    /**
     * Constructs a bond instrument.
     * 
     * @param instrumentId the unique identifier
     * @param price the current market price as a percentage of par
     * @param parValue the par/face value of the bond
     * @param accruedInterest the accrued interest since last coupon payment
     */
    public Bond(String instrumentId, BigDecimal price, BigDecimal parValue, BigDecimal accruedInterest) {
        super(instrumentId);
        this.price = price;
        this.parValue = parValue;
        this.accruedInterest = accruedInterest;
    }
    
    @Override
    public BigDecimal getPrice() {
        return price;
    }
    
    /**
     * Gets the par/face value of the bond.
     * 
     * @return the par value
     */
    public BigDecimal getParValue() {
        return parValue;
    }
    
    /**
     * Gets the accrued interest of the bond.
     * 
     * @return the accrued interest
     */
    public BigDecimal getAccruedInterest() {
        return accruedInterest;
    }
}
