package fitnessApp;

import java.util.ArrayList;
import java.util.List;

// Tracker class to manage user activities and goals
class Tracker {
    private User user;
    private List<Activity> activities = new ArrayList<>();
    private int weeklyGoal; // in minutes

    public Tracker(User user, int weeklyGoal) {
        this.user = user;
        this.weeklyGoal = weeklyGoal;
    }

    public void trackActivity(Activity activity) {
        activities.add(activity);
    }

    public void setWeeklyGoal(int weeklyGoal) {
        this.weeklyGoal = weeklyGoal;
    }

    public int getWeeklyGoal() {
        return weeklyGoal;
    }

    public void generateActivityReport() {
        System.out.println("Activity Report for " + user.getName());
        System.out.println("Weekly Goal: " + weeklyGoal + " minutes");

        int totalDuration = activities.stream().mapToInt(Activity::getDuration).sum();
        System.out.println("Total Activity Duration: " + totalDuration + " minutes");

        if (totalDuration >= weeklyGoal) {
            System.out.println("Congratulations! You've achieved your weekly goal.");
        } else {
            System.out.println("Keep going! You're almost there.");
        }
    }
}
