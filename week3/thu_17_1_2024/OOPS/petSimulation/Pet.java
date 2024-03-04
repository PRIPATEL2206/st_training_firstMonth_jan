package petSimulation;

public class Pet {
    private String name;
    private int health;
    private int happiness;

    public Pet(String name) {
        this.name = name;
        this.health = 100;  // Initial health
        this.happiness = 100;  // Initial happiness
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public void feed(Food food) {
        int nutrition = food.getNutrition();
        health = Math.min(100, health + nutrition);  // Health cannot exceed 100
    }

    public void play() {
        happiness = Math.min(100, happiness + 10);  // Happiness cannot exceed 100
    }

    public void takeCare() {
        // Perform other care activities as needed
    }

    public void displayStatus() {
        System.out.println("Pet: " + name);
        System.out.println("Health: " + health);
        System.out.println("Happiness: " + happiness);
    }
}
