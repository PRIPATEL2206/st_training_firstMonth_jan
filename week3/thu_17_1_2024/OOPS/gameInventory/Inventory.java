package gameInventory;

import java.util.HashMap;
import java.util.Map;

class Inventory {
    private Map<Game, Integer> games;

    public Inventory() {
        this.games = new HashMap<>();
    }

    public void addGame(Game game, int quantity) {
        games.put(game, games.getOrDefault(game, 0) + quantity);
        System.out.println("Added " + quantity + " copies of " + game.getTitle() + " to the inventory.");
    }

    public void removeGame(Game game, int quantity) {
        if (games.containsKey(game)) {
            int currentQuantity = games.get(game);
            if (currentQuantity >= quantity) {
                games.put(game, currentQuantity - quantity);
                System.out.println("Removed " + quantity + " copies of " + game.getTitle() + " from the inventory.");
            } else {
                System.out.println("Not enough copies of " + game.getTitle() + " in the inventory.");
            }
        } else {
            System.out.println(game.getTitle() + " is not in the inventory.");
        }
    }

    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        for (Map.Entry<Game, Integer> entry : games.entrySet()) {
            System.out.println("- " + entry.getKey().getTitle() + ": " + entry.getValue() + " copies");
        }
    }
}
