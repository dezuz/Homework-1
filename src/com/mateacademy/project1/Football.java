package com.mateacademy.project1;

public class Football {

    private int usersMatchResult;


    public int footballMatchResult(int firstTeamScore, int secondTeamScore, int userFirstScore, int userSecondScore) {

        usersMatchResult = (firstTeamScore == userFirstScore && secondTeamScore == userSecondScore)
                ? 2 : footballMatchWinner(firstTeamScore ,secondTeamScore ,userFirstScore ,userSecondScore);

        return usersMatchResult;
    }

    private int footballMatchWinner(int firstTeamScore, int secondTeamScore, int userFirstScore, int userSecondScore) {
        usersMatchResult = (firstTeamScore > secondTeamScore && userFirstScore > firstTeamScore
                || firstTeamScore < secondTeamScore && userSecondScore > secondTeamScore) ? 1: 0;

        return usersMatchResult;
    }


}
