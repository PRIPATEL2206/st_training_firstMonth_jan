package fitnessApp;

// Activity class to represent a fitness activity
class Activity {
    private FitnessActivity activityType;
    private double distance; // in kilometers
    private int duration;    // in minutes

    public Activity(FitnessActivity activityType, double distance, int duration) {
        this.activityType = activityType;
        this.distance = distance;
        this.duration = duration;
    }

    public FitnessActivity getActivityType() {
        return activityType;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }
}
