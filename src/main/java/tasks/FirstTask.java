package tasks;
import service.FactorialService;

import java.math.BigInteger;

/**
 * Case of First task are basis on Catalan number.
 * That mean C(n) = (2n)!/n!(n+1)!
 * where "n" is a quantity of pair correct parenthesis
 */
public class FirstTask implements TasksStartable {

       public BigInteger quantityOfCorrectParenthesisExpressions(int quantityParenthesis, FactorialService factorial) {
        if(quantityParenthesis<0 || quantityParenthesis > 10000)
            return BigInteger.ZERO;
        if(quantityParenthesis==0)
            return BigInteger.ONE;
//       First part - (2n)!
        BigInteger numeratorAction = factorial.calculateFactorial(2 * quantityParenthesis);
//       Second part - n!(n+1)!
        BigInteger  denominatorAction= factorial.calculateFactorial(quantityParenthesis).multiply(factorial.calculateFactorial(quantityParenthesis+1));
//       return the divide numerator/denominator
        return numeratorAction.divide(denominatorAction);
    }

    @Override
    public void startTest(int quantityParenthesis,int secondTestInput,int thirdTestInput) {
        System.out.println(quantityOfCorrectParenthesisExpressions(quantityParenthesis, new FactorialService()));
    }
}
