package socialMediaNetwork;

import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private List<User> friends;
    private List<Post> posts;

    public User(String username) {
        this.username = username;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addFriend(User friend) {
        if (!friends.contains(friend) && !this.equals(friend)) {
            friends.add(friend);
            friend.friends.add(this);
            System.out.println(username + " and " + friend.getUsername() + " are now friends.");
        } else {
            System.out.println("Unable to add friend.");
        }
    }

    public void postMessage(String message) {
        Post post = new Post(this, message);
        posts.add(post);
        System.out.println(username + " posted: " + message);
    }

    public List<Post> getTimeline() {
        List<Post> timeline = new ArrayList<>(posts);
        for (User friend : friends) {
            timeline.addAll(friend.getPosts());
        }
        timeline.sort((p1, p2) -> p2.compareTo(p1));
        return timeline;
    }
}
