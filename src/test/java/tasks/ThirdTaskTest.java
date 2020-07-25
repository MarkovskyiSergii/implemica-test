package tasks;

import org.junit.jupiter.api.Test;
import service.FactorialService;

import static org.junit.jupiter.api.Assertions.*;

class ThirdTaskTest {

    @Test
    void sumOfFactorialDigits() {
        ThirdTask taskThree = new ThirdTask();
        FactorialService factorialService = new FactorialService();
        assertEquals(0, taskThree.sumOfFactorialDigits(-1, factorialService));
        assertEquals(0, taskThree.sumOfFactorialDigits(0, factorialService));
        assertEquals(1, taskThree.sumOfFactorialDigits(1, factorialService));
        assertEquals(27, taskThree.sumOfFactorialDigits(10, factorialService));
        assertEquals(648, taskThree.sumOfFactorialDigits(100, factorialService));
        assertEquals(10539, taskThree.sumOfFactorialDigits(1000, factorialService));
        assertEquals(149346, taskThree.sumOfFactorialDigits(10000, factorialService));
    }
}