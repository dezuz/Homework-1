package com.mateacademy.project1;

public class Footbal {

    private int usersMatchResult;

    public int footbalMatchResult(int firstTeamScore, int secondTeamScore, int userFirstScore, int userSecondScore) {

        usersMatchResult = (firstTeamScore == userFirstScore && secondTeamScore == userSecondScore)
                ? 2 : (firstTeamScore > secondTeamScore && userFirstScore > firstTeamScore
                || firstTeamScore < secondTeamScore && userSecondScore > secondTeamScore) ? 1 : 0;

        return usersMatchResult;
    }


}
