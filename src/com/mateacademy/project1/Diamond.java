package com.mateacademy.project1;

public class Diamond {

    public void drawingDiamond(int maxLineNumber) {

        if (maxLineNumber == 0) {
            System.out.println("There is no diamond with line length 0 :)");
        }

        int starsNumber = maxLineNumber;

        for (int i = 1; i < maxLineNumber + maxLineNumber;i++) {
            if (i <= maxLineNumber) {
                drawSymbol(starsNumber + 1 - i, " ");
                drawSymbol(i, "* ");
            }
            else {
                starsNumber--;
                drawSymbol(maxLineNumber - starsNumber + 1, " ");
                drawSymbol(starsNumber, "* ");
            }
            System.out.println("");
        }

    }

    private void drawSymbol(int number, String symbol) {
        for (int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
    }
}