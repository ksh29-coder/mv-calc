package com.mvcalc.model;

import java.math.BigDecimal;

/**
 * Represents a futures contract.
 */
public class Future extends FinancialInstrument {
    private final BigDecimal price;
    private final BigDecimal contractSize;
    
    /**
     * Constructs a futures contract.
     * 
     * @param instrumentId the unique identifier
     * @param price the current market price
     * @param contractSize the size of each contract
     */
    public Future(String instrumentId, BigDecimal price, BigDecimal contractSize) {
        super(instrumentId);
        this.price = price;
        this.contractSize = contractSize;
    }
    
    @Override
    public BigDecimal getPrice() {
        return price;
    }
    
    /**
     * Gets the contract size of the future.
     * 
     * @return the contract size
     */
    public BigDecimal getContractSize() {
        return contractSize;
    }
}
