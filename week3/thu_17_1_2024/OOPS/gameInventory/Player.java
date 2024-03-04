package gameInventory;

import java.util.HashMap;
import java.util.Map;

class Player {
    private String playerName;
    private int totalPlaytimeHours;
    private Map<Game, Integer> playerProgress;

    public Player(String playerName) {
        this.playerName = playerName;
        this.totalPlaytimeHours = 0;
        this.playerProgress = new HashMap<>();
    }

    public void playGame(Game game, int playtimeHours) {
        totalPlaytimeHours += playtimeHours;
        playerProgress.put(game, playerProgress.getOrDefault(game, 0) + playtimeHours);
        System.out.println(playerName + " played " + game.getTitle() +
                " for " + playtimeHours + " hours. Total playtime: " + totalPlaytimeHours + " hours.");
    }

    public void viewPlayerProgress() {
        System.out.println("\n" + playerName + "'s Game Progress:");
        for (Map.Entry<Game, Integer> entry : playerProgress.entrySet()) {
            System.out.println("- " + entry.getKey().getTitle() +
                    ": " + entry.getValue() + " hours played");
        }
    }
}
