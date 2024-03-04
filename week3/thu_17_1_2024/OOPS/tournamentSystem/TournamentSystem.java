package tournamentSystem;

import java.util.ArrayList;
import java.util.List;

public class TournamentSystem {
    public static void main(String[] args) {
        Tournament footballTournament = new Tournament("Football Championship");

        Team team1 = new Team("Team A");
        Team team2 = new Team("Team B");
        Team team3 = new Team("Team C");
        Team team4 = new Team("Team D");

        footballTournament.addTeam(team1);
        footballTournament.addTeam(team2);
        footballTournament.addTeam(team3);
        footballTournament.addTeam(team4);

        footballTournament.conductMatches();

        footballTournament.updateMatchResult(0, 2, 1);
        footballTournament.updateMatchResult(1, 3, 3);
        footballTournament.updateMatchResult(2, 1, 0);
        footballTournament.updateMatchResult(3, 2, 2);
        footballTournament.updateMatchResult(4, 1, 4);
        footballTournament.updateMatchResult(5, 2, 2);

        footballTournament.determineWinners();
    }
}

