package tasks;

import service.FactorialService;

public class ThirdTask implements TasksStartable {


    public int sumOfFactorialDigits(int number, FactorialService factorial) {
        if(number<1)
            return 0;
        if(number == 1)
            return 1;
        int sumOfDigits = 0;
        String fact = factorial.calculateFactorial(number).toString();
//        Split factorial at digits and sum they
        for (String digit : fact.split("") ) {
            sumOfDigits += Integer.parseInt(digit);
        }
        return sumOfDigits;
    }

    @Override
    public void startTest(int numberFactorial,int secondTestInput,int thirdTestInput) {
        System.out.println("Third task"  + sumOfFactorialDigits(numberFactorial, new FactorialService()));
    }
}
