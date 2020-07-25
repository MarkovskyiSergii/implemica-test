package tasks;

import org.junit.jupiter.api.Test;
import service.FactorialService;

import static java.math.BigInteger.*;
import static java.math.BigInteger.valueOf;
import static org.junit.jupiter.api.Assertions.*;

class FirstTaskTest {

    @Test
    void quantityOfCorrectParenthesisExpressions() {
        FirstTask taskOne = new FirstTask();
        FactorialService factorial = new FactorialService();
        assertEquals(ZERO, taskOne.quantityOfCorrectParenthesisExpressions(-1, factorial));
        assertEquals(ONE, taskOne.quantityOfCorrectParenthesisExpressions(0, factorial));
        assertEquals(ONE, taskOne.quantityOfCorrectParenthesisExpressions(1, factorial));
        assertEquals(TWO, taskOne.quantityOfCorrectParenthesisExpressions(2, factorial));
        assertEquals(valueOf(429), taskOne.quantityOfCorrectParenthesisExpressions(7, factorial));
        assertEquals(valueOf(208012), taskOne.quantityOfCorrectParenthesisExpressions(12, factorial));
        assertEquals(valueOf(6564120420L), taskOne.quantityOfCorrectParenthesisExpressions(20, factorial));
    }
}