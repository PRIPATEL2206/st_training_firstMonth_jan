package socialNetworkAnalytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Network {
    private List<User> users;

    public Network() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User " + user.getUsername() + " has joined the network.");
    }

    public List<User> getUsers() {
        return users;
    }

    public void analyzeInfluentialUsers() {
        System.out.println("\nInfluential Users:");
        for (User user : users) {
            int friendCount = user.getFriends().size();
            int postCount = user.getPosts().size();
            if (friendCount >= 2 || postCount >= 3) {
                System.out.println("- " + user.getUsername() + " (Friends: " + friendCount + ", Posts: " + postCount + ")");
            }
        }
    }

    public void analyzePopularPosts() {
        System.out.println("\nPopular Posts:");
        Map<User, Integer> postCounts = new HashMap<>();

        for (User user : users) {
            for (Post post : user.getPosts()) {
                postCounts.put(user, postCounts.getOrDefault(user, 0) + 1);
            }
        }

        postCounts.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(3) // Display top 3 popular posts
                .forEach(entry -> {
                    User user = entry.getKey();
                    int postCount = entry.getValue();
                    System.out.println("- " + user.getUsername() + ": " + postCount + " posts");
                });
    }

    public void analyzeConnectionPatterns() {
        System.out.println("\nConnection Patterns:");
        for (User user : users) {
            System.out.println(user.getUsername() + " is friends with:");
            for (User friend : user.getFriends()) {
                System.out.println("- " + friend.getUsername());
            }
            System.out.println();
        }
    }
}
