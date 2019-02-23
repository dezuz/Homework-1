package com.mateacademy.project1;

public class Mathematics {

    public int powTwo(int number) {
        return number * number;
    }

    public int powThree(int number) {
        return number * number * number;
    }

    //return type is double because 5^(-2) != int, for example
    public double pow(int number, int power) {
        double result = 1;

        if (power >= 0) {
            result = countingPow(number, power);
        }
        else {
            power = Math.abs(power);
            result = (double)1 / countingPow(number, power);
        }

        return result;
    }

    private double countingPow(int number, int power) {
        double result = 1;

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
            return 1;
        }
        else {
            if (number == 1)
                return 1;
        }

        return number * (numberToFactorial(number - 1));
    }
}