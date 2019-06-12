package com.kodillaxxx.com.kodillaXXX.exception;

public class FirstCheallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstCheallenge firstChallenge = new FirstCheallenge();


        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException dividedBy0) {
            System.out.println("Unfortunately, it is impossilble to process this. Error: " + dividedBy0);
        } finally {
            System.out.println("You tried to divide" );
        }

    }
}
