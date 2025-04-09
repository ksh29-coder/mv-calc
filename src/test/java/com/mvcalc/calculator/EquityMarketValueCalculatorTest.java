package com.mvcalc.calculator;

import com.mvcalc.model.Equity;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquityMarketValueCalculatorTest {

    @Test
    public void testCalculateMarketValue() {
        // Given
        Equity equity = new Equity("AAPL", new BigDecimal("150.25"), 100);
        EquityMarketValueCalculator calculator = new EquityMarketValueCalculator();
        
        // When
        BigDecimal marketValue = calculator.calculateMarketValue(equity);
        
        // Then
        assertEquals(new BigDecimal("15025.00"), marketValue);
    }
}
