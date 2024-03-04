package socialMediaNetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaNetwork {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        // Add friends
        user1.addFriend(user2);
        user1.addFriend(user3);
        user2.addFriend(user3);

        // Post messages
        user1.postMessage("Hello, friends!");
        user2.postMessage("Hi, everyone!");
        user3.postMessage("Greetings from Charlie!");

        // Display timelines
        System.out.println("\nTimelines:");
        displayTimeline(user1);
        displayTimeline(user2);
        displayTimeline(user3);
    }

    private static void displayTimeline(User user) {
        List<Post> timeline = user.getTimeline();
        System.out.println(user.getUsername() + "'s Timeline:");
        for (Post post : timeline) {
            System.out.println(post.getAuthor().getUsername() + ": " + post.getMessage());
        }
        System.out.println();
    }
}

