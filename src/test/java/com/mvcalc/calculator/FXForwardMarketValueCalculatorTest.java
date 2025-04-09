package com.mvcalc.calculator;

import com.mvcalc.model.FXForward;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FXForwardMarketValueCalculatorTest {

    @Test
    public void testCalculateMarketValue() {
        // Given
        FXForward fxForward = new FXForward("EUR/USD-3M", new BigDecimal("1.125"), new BigDecimal("1000000"));
        FXForwardMarketValueCalculator calculator = new FXForwardMarketValueCalculator();
        
        // When
        BigDecimal marketValue = calculator.calculateMarketValue(fxForward);
        
        // Then
        assertEquals(new BigDecimal("1125000.000"), marketValue);
    }
}
