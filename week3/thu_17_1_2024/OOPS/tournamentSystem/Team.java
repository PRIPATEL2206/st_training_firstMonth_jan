package tournamentSystem;

class Team {
    private String name;
    private int totalPoints;

    public Team(String name) {
        this.name = name;
        this.totalPoints = 0;
    }

    public String getName() {
        return name;
    }

    public int calculateTotalPoints() {
        return totalPoints;
    }

    public void updatePoints(int points) {
        totalPoints += points;
    }
}
