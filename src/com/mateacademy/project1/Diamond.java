package com.mateacademy.project1;

public class Diamond {

    public void drawindDiamond(int maxLineNumber) {

        if (maxLineNumber == 0) {
            System.out.println("There is no diamond with line length 0 :)");
        }

        int starsNumber = maxLineNumber;

        for (int i = 1; i < maxLineNumber + maxLineNumber;i++) {
            if (i <= maxLineNumber) {
                drawSpaces(starsNumber + 1 - i);
                drawStars(i);
                System.out.println("");
            }
            else {
                starsNumber--;
                drawSpaces(maxLineNumber - starsNumber + 1);
                drawStars(starsNumber);
                System.out.println("");
            }
        }

    }

    private void drawStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }
    }

    private void drawSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
}
