package fitnessApp;


public class FitnessApp {
    public static void main(String[] args) {
        User user = new User("John", 30, 75.0);

        Tracker tracker = new Tracker(user, 150);

        tracker.trackActivity(new Activity(FitnessActivity.RUNNING, 5.0, 30));
        tracker.trackActivity(new Activity(FitnessActivity.CYCLING, 10.0, 45));
        tracker.trackActivity(new Activity(FitnessActivity.SWIMMING, 1.5, 20));

        tracker.generateActivityReport();
    }
}

