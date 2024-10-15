package itm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator tests for OSS class")
public class CalculatorTests {

    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("Test for add fuction.")
    void add(){
        assertEquals(10, calc.Add(5, 5), "Expected value is 10 in Add fuction.");
    }

    @Test
    @DisplayName("Test for isFivePrime function.")
    void isFivePrime(){
        assertTrue(calc.isPrime(5),"5 is Prime.");
    }

    @Test
    @DisplayName("Test for isFourPrime function.")
    void isFourPrime(){
        assertFalse(calc.isPrime(4),"4 is not Prime.");
    }

    @Test
    @DisplayName("Test for isNegativeNumPrime function.")
    void isNegativeNumPrime(){
        assertFalse(calc.isPrime(-10),"Negative number is not Prime.");
    } 

        
}
