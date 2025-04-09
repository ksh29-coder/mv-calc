package com.mvcalc.calculator;

import com.mvcalc.model.Bond;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BondMarketValueCalculatorTest {

    @Test
    public void testCalculateMarketValue() {
        // Given
        // Price is 98.5% of par value, par value is 1000, accrued interest is 25
        Bond bond = new Bond("US-TREASURY-10Y", new BigDecimal("0.985"), new BigDecimal("1000"), new BigDecimal("25"));
        BondMarketValueCalculator calculator = new BondMarketValueCalculator();
        
        // When
        BigDecimal marketValue = calculator.calculateMarketValue(bond);
        
        // Then
        // 0.985 * 1000 + 25 = 985 + 25 = 1010
        // Using compareTo instead of assertEquals to ignore scale differences
        assertEquals(0, new BigDecimal("1010").compareTo(marketValue));
    }
}
