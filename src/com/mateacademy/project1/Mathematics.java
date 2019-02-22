package com.mateacademy.project1;

public class Mathematics {

    public double result = 1;

    public double powTwo(int number) {
        return number * number;
    }

    public double powThree(int number) {
        return number * number * number;
    }

    public double pow(int number, int power) {
        if (power >= 0) {
            result = countingPow(number, power);
        }
        else {
            power = Math.abs(power);
            countingPow(number, power);
            result = 1 / result;
        }

        return result;
    }

    private double countingPow(int number, int power) {
        for (int i = 0; i < power; i++) {
            result *= number;
        }

        return result;
    }

    public int fibonacciNumbers(int number) {
        if (number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        else{
            return fibonacciNumbers(number - 1) + fibonacciNumbers(number - 2);
        }
    }

    public int numberToFactorial(int number) {
        if (number <= 0) {
           return 0;
        }
        else {
            if (number == 1)
               return 1;
        }

        return number * (numberToFactorial(number - 1));
    }
}
