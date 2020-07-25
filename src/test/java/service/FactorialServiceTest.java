package service;

import org.junit.jupiter.api.Test;
import static java.math.BigInteger.*;
import static org.junit.jupiter.api.Assertions.*;

class FactorialServiceTest {

    @Test
    void calculateFactorial() {
        FactorialService factorialService = new FactorialService();
        assertEquals(ZERO, factorialService.calculateFactorial(-1));
        assertEquals(ZERO, factorialService.calculateFactorial(0));
        assertEquals(ONE, factorialService.calculateFactorial(1));
        assertEquals(valueOf(3628800), factorialService.calculateFactorial(10));
        assertEquals(valueOf(1307674368000L), factorialService.calculateFactorial(15));
    }
}