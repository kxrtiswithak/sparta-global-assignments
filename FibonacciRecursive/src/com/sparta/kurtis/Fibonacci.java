package com.sparta.kurtis;

public class Fibonacci {

    public static int[] getFibonacciArray(int numberOfTerms) {
        if (numberOfTerms < 0) {
            Printer.printErrorMessage("stop it, you know the rules, don't play with me");
            return null;
        } else if (numberOfTerms <= 1) {
            return new int[]{numberOfTerms};
        }

        int[] numberArray = new int[numberOfTerms];

        for (int i = 0; i < numberOfTerms; i++) {
            numberArray[i] = getFibonacciNumber(i);
        }
        return numberArray;
    }

    private static int getFibonacciNumber(int number) {
        return getFibonacciNumber(number - 1) + getFibonacciNumber(number - 2);
    }
}

