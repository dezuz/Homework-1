package com.mateacademy.project1;

public class TestClass {

    public static void main(String[] args) {
        int result;
        double powTwo;
        double powThree;
        double pow;
        int fibonacci;
        int factorial;

        Football firstUser = new Football();
        Diamond diamond = new Diamond();
        Mathematics math = new Mathematics();

        result = firstUser.footballMatchResult(3, 2, 0, 2);

        System.out.println("\nTask 1.1 answer is: " + result);

        System.out.println("\nTask 1.2: ");
        diamond.drawingDiamond(10);

        System.out.println("\nTask 1.3: ");
        powTwo = math.powTwo(4);
        powThree = math.powThree(4);
        pow = math.pow(5, -2);

        System.out.println("x to the power of two = " + powTwo + "\nx to the power of three = " + powThree + "\nx to the pow of y = " + pow);

        System.out.println("\nTask 1.4: ");
        fibonacci = math.fibonacciNumbers(7);
        factorial = math.numberToFactorial(0);

        System.out.println("Factorial is: " + factorial);
        System.out.println("Fibonacci number: " + fibonacci);
    }
}