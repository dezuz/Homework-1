package com.mateacademy.project1;

public class Diamond {

    public void drawindDiamond(int maxLineNumber) {

        if (maxLineNumber == 0)
            System.out.println("There is no diamond with line length 0 :)");

        int starsNumber = maxLineNumber;
        int numberOfSpaces = maxLineNumber;

        for (int i = 1; i < maxLineNumber + maxLineNumber; i++) {

            for (int k = numberOfSpaces; k > 0; k--) {
                System.out.print(" ");
            }

            for (int j = starsNumber; j <= maxLineNumber; j++) {
                System.out.print("* ");
            }

            starsNumber = numberOfStars(i, maxLineNumber, starsNumber);

            numberOfSpaces = spaceNumbers(i, maxLineNumber, numberOfSpaces);

            System.out.println();
        }
    }

    private int numberOfStars(int cycleDigit, int maxLineNumber, int starsNumber) {
        if (cycleDigit < maxLineNumber)
            starsNumber--;
        else
            starsNumber++;

        return starsNumber;
    }

    private int spaceNumbers(int cycleDigit, int maxLineNumber, int numberOfSpaces) {
        if (cycleDigit < maxLineNumber)
            numberOfSpaces--;
        else
            numberOfSpaces++;

        return numberOfSpaces;
    }
}
