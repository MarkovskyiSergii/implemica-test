package service;

import java.math.BigInteger;

/**
 * Service to calculate and return factorial value
 */

public class FactorialService {
    public BigInteger calculateFactorial(int value) {
        if(value<1)
            return BigInteger.ZERO;
        if(value == 1)
            return BigInteger.ONE;
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= value ; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
