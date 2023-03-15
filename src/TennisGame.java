public class TennisGame {
    public static String getScore(int player1Score, int player2Score) {

        String score = null;
        boolean isEquael = player1Score==player2Score;
        boolean isPlayer1ScoreAbove4 = player1Score >=4;
        boolean isPlayer2ScoreAbove4 = player2Score >=4;
        if (isEquael)
        {
            score = getScore(player1Score);
        }
        else 
            if (isPlayer1ScoreAbove4 || isPlayer2ScoreAbove4)
        {
            score = getwinerPlayer(player1Score, player2Score);
        }
        else
        {
            score = getScore(player1Score, player2Score, score);
        }
        return score;
    }

    private static String getScore(int player1Score, int player2Score, String score) {
        int tempScore;
        StringBuilder scoreBuilder = new StringBuilder(score);
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = player1Score;
            else { scoreBuilder.append("-"); tempScore = player2Score;}
            switch(tempScore)
            {
                case 0:
                    scoreBuilder.append("Love");
                    break;
                case 1:
                    scoreBuilder.append("Fifteen");
                    break;
                case 2:
                    scoreBuilder.append("Thirty");
                    break;
                case 3:
                    scoreBuilder.append("Forty");
                    break;
            }
        }
        score = scoreBuilder.toString();
        return score;
    }

    private static String getwinerPlayer(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String getScore(int player1Score) {
        String score;
        switch (player1Score)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
}
