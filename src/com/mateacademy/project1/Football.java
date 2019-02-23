package com.mateacademy.project1;

public class Football {


    public int footballMatchResult(int firstTeamScore, int secondTeamScore, int userFirstScore, int userSecondScore) {
        return (firstTeamScore == userFirstScore && secondTeamScore == userSecondScore)
                ? 2 : footballMatchWinner(firstTeamScore ,secondTeamScore ,userFirstScore ,userSecondScore);
    }

    private int footballMatchWinner(int firstTeamScore, int secondTeamScore, int userFirstScore, int userSecondScore) {
        return (firstTeamScore > secondTeamScore && userFirstScore > firstTeamScore
                || firstTeamScore < secondTeamScore && userSecondScore > secondTeamScore) ? 1: 0;
    }


}