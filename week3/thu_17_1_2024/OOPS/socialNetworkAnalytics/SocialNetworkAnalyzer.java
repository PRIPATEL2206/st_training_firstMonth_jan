package socialNetworkAnalytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialNetworkAnalyzer {
    public static void main(String[] args) {
        Network socialNetwork = new Network();

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");
        User user4 = new User("David");

        socialNetwork.addUser(user1);
        socialNetwork.addUser(user2);
        socialNetwork.addUser(user3);
        socialNetwork.addUser(user4);

        user1.addFriend(user2);
        user1.addFriend(user3);
        user2.addFriend(user4);

        user1.createPost("Hello, world!");
        user2.createPost("Having a great day!");
        user3.createPost("Excited for the weekend!");
        user4.createPost("New project in the works.");

        socialNetwork.analyzeInfluentialUsers();

        socialNetwork.analyzePopularPosts();

        socialNetwork.analyzeConnectionPatterns();
    }
}

