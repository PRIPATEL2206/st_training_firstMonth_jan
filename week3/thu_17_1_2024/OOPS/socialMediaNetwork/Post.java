package socialMediaNetwork;

class Post implements Comparable<Post> {
    private User author;
    private String message;
    private Long timestamp;

    public Post(User author, String message) {
        this.author = author;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public User getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public int compareTo(Post o) {
        return (int) (this.timestamp - o.timestamp);
    }
}
