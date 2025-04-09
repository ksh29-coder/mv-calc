package com.mvcalc.calculator;

import com.mvcalc.model.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MarketValueCalculatorFactoryTest {

    private final MarketValueCalculatorFactory factory = new MarketValueCalculatorFactory();

    @Test
    public void testCalculateMarketValueForEquity() {
        // Given
        Equity equity = new Equity("AMZN", new BigDecimal("3500.25"), 10);
        
        // When
        BigDecimal marketValue = factory.calculateMarketValue(equity);
        
        // Then
        assertEquals(0, new BigDecimal("35002.50").compareTo(marketValue));
    }

    @Test
    public void testCalculateMarketValueForBond() {
        // Given
        Bond bond = new Bond("CORP-BOND", new BigDecimal("0.975"), new BigDecimal("2000"), new BigDecimal("45"));
        
        // When
        BigDecimal marketValue = factory.calculateMarketValue(bond);
        
        // Then
        assertEquals(0, new BigDecimal("1995").compareTo(marketValue));
    }

    @Test
    public void testCalculateMarketValueForFuture() {
        // Given
        Future future = new Future("OIL-FUTURE", new BigDecimal("75.80"), new BigDecimal("1000"));
        
        // When
        BigDecimal marketValue = factory.calculateMarketValue(future);
        
        // Then
        assertEquals(0, new BigDecimal("75800.00").compareTo(marketValue));
    }

    @Test
    public void testCalculateMarketValueForFXForward() {
        // Given
        FXForward fxForward = new FXForward("GBP/USD-6M", new BigDecimal("1.35"), new BigDecimal("500000"));
        
        // When
        BigDecimal marketValue = factory.calculateMarketValue(fxForward);
        
        // Then
        assertEquals(0, new BigDecimal("675000.00").compareTo(marketValue));
    }

    @Test
    public void testUnsupportedInstrumentType() {
        // Given
        // Custom instrument that extends FinancialInstrument but is not supported by the factory
        FinancialInstrument customInstrument = new FinancialInstrument("CUSTOM") {
            @Override
            public BigDecimal getPrice() {
                return BigDecimal.ONE;
            }
        };
        
        // When/Then
        assertThrows(IllegalArgumentException.class, () -> factory.calculateMarketValue(customInstrument));
    }
}
