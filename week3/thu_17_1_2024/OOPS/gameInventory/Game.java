package gameInventory;

class Game {
    private String title;
    private int durationHours;
    private int difficultyLevel;

    public Game(String title, int durationHours, int difficultyLevel) {
        this.title = title;
        this.durationHours = durationHours;
        this.difficultyLevel = difficultyLevel;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }
}
