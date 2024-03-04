package tournamentSystem;

class Match {
    private Team teamA;
    private Team teamB;
    private int teamAScore;
    private int teamBScore;

    public Match(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public void playMatch() {
        // Simplified logic: Randomly generate scores for the match
        teamAScore = (int) (Math.random() * 6); // Random score between 0 and 5
        teamBScore = (int) (Math.random() * 6);

        // Update team points based on the match result
        if (teamAScore > teamBScore) {
            teamA.updatePoints(3); // Team A wins
        } else if (teamAScore < teamBScore) {
            teamB.updatePoints(3); // Team B wins
        } else {
            teamA.updatePoints(1); // It's a draw, both teams get 1 point
            teamB.updatePoints(1);
        }

        System.out.println("Match Result: " + teamA.getName() + " " + teamAScore + " - " + teamB.getName() + " " + teamBScore);
    }

    public void setResult(int teamAScore, int teamBScore) {
        this.teamAScore = teamAScore;
        this.teamBScore = teamBScore;
    }
}
