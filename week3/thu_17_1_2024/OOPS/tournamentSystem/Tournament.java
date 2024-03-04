package tournamentSystem;

import java.util.ArrayList;
import java.util.List;

class Tournament {
    private String name;
    private List<Team> teams;
    private List<Match> matches;

    public Tournament(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void conductMatches() {
        // Simplified logic: All teams play against each other exactly once
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Match match = new Match(teams.get(i), teams.get(j));
                matches.add(match);
                match.playMatch();
            }
        }
    }

    public void updateMatchResult(int matchNumber, int teamAScore, int teamBScore) {
        if (matchNumber >= 0 && matchNumber < matches.size()) {
            matches.get(matchNumber).setResult(teamAScore, teamBScore);
        }
    }

    public void determineWinners() {
        // Simplified logic: Teams with the highest total points are winners
        List<Team> winners = new ArrayList<>();
        int maxPoints = -1;

        for (Team team : teams) {
            int totalPoints = team.calculateTotalPoints();
            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                winners.clear();
                winners.add(team);
            } else if (totalPoints == maxPoints) {
                winners.add(team);
            }
        }

        System.out.println("Tournament Winners:");
        for (Team winner : winners) {
            System.out.println(winner.getName());
        }
    }
}
