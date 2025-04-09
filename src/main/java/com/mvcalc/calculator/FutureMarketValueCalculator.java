package com.mvcalc.calculator;

import com.mvcalc.model.Future;
import java.math.BigDecimal;

/**
 * Calculator for futures market values.
 * Market value for future = price * contract_size
 */
public class FutureMarketValueCalculator implements MarketValueCalculator<Future> {

    @Override
    public BigDecimal calculateMarketValue(Future future) {
        return future.getPrice().multiply(future.getContractSize());
    }
}
