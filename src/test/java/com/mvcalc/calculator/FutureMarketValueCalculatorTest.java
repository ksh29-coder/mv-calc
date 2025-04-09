package com.mvcalc.calculator;

import com.mvcalc.model.Future;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FutureMarketValueCalculatorTest {

    @Test
    public void testCalculateMarketValue() {
        // Given
        Future future = new Future("ES-FUTURE", new BigDecimal("4200.50"), new BigDecimal("50"));
        FutureMarketValueCalculator calculator = new FutureMarketValueCalculator();
        
        // When
        BigDecimal marketValue = calculator.calculateMarketValue(future);
        
        // Then
        assertEquals(new BigDecimal("210025.00"), marketValue);
    }
}
