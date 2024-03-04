package gameInventory;

import java.util.HashMap;
import java.util.Map;

public class GameInventorySystem {
    public static void main(String[] args) {
        // Create games
        Game minecraft = new Game("Minecraft", 50, 3);
        Game witcher = new Game("The Witcher 3", 100, 5);
        Game portal = new Game("Portal", 10, 2);

        // Create inventory
        Inventory inventory = new Inventory();

        // Add games to the inventory
        inventory.addGame(minecraft, 5);
        inventory.addGame(witcher, 3);
        inventory.addGame(portal, 10);

        // Display current inventory
        inventory.displayInventory();

        // Create a player
        Player player = new Player("Alice");

        // Player plays games
        player.playGame(minecraft, 20);
        player.playGame(witcher, 50);
        player.playGame(portal, 5);

        // View player progress
        player.viewPlayerProgress();
    }
}

