package socialNetworkAnalytics;

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

    public void addFriend(User friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            friend.friends.add(this); // Automatically add reciprocal friendship
            System.out.println(username + " is now friends with " + friend.getUsername());
        }
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void createPost(String content) {
        Post post = new Post(this, content);
        posts.add(post);
        System.out.println(username + " created a new post:\n" + content);
    }
}
