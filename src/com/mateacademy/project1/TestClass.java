package com.mateacademy.project1;

public class TestClass {

    public static void main(String[] args) {
        int result;
        double powTwo;
        double powThree;
        double pow;
        int factorial;

        Footbal firstUser = new Footbal();
        Diamond diamond = new Diamond();
        Mathematic math = new Mathematic();

        result = firstUser.footbalMatchResult(2, 1, 3, 2);

        System.out.println("\nTask 1.1 answer is: " + result);

        System.out.println("\nTask 1.2: ");
        diamond.drawindDiamond(5);

        System.out.println("\nTask 1.3: ");
        powTwo = math.powTwo(4);
        powThree = math.powThree(4);
        pow = math.pow(4, 6);

        System.out.println("x to the power of two = " + powTwo + "\nx to the power of three = " + powThree + "\nx to the pow of y = " + pow);

        System.out.println("\nTask 1.4: ");
        math.fibonacciNumbers(55);
        factorial = math.numberToFactorial(6);
        math.factorialToNumber(24);

        System.out.println("Факторіал дорівнює: " + factorial);
    }
}
