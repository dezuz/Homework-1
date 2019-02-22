package com.mateacademy.project1;

public class Mathematic {

    private double result = 1;

    public double powTwo(double number) {
        return number * number;
    }

    public double powThree(double number) {
        return number * number * number;
    }

    public double pow(double number, double power) {
        for (int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }

    public void fibonacciNumbers(int number) {
        int previousFibonacciNumber = 1;
        int fibonacciNumber = 1;
        int i = 0;
        int support;

        if (number == 1) {
            System.out.println("\nЧисло " + number + " являється першим/другим числом Фібоначі.");
        } else {

            do {
                support = fibonacciNumber; //1 2 3 5
                fibonacciNumber += previousFibonacciNumber; //2 3 5 8
                previousFibonacciNumber = support; //1 2 3 5
                i++;
            } while (fibonacciNumber != number);

            System.out.println("Число " + number + " являється " + (i + 2) + "-м числом Фібоначі");
        }
    }

    public int numberToFactorial(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public void factorialToNumber(int number) {
        int factorialNumber = 1;
        int i = 1;

        if (number == 0) {
            System.out.println("Число " + number + " не має факторіала.");
        } else {

            do {
                factorialNumber *= i;
                i++;
            } while (factorialNumber != number);

            System.out.println("Число " + number + " є факторіалом числа " + (i - 1) + ".");
        }
    }
}
