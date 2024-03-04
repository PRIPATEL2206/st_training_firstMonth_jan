package chatSystem;


public class ChatSystemExample {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        ChatRoom chatRoom = new ChatRoom("General Chat");

        chatRoom.join(user1);
        chatRoom.join(user2);
        chatRoom.join(user3);

        user1.sendMessage(chatRoom, "Hello, everyone!");
        user2.sendMessage(chatRoom, "Hi, Alice!");
        user3.sendMessage(chatRoom, "Hey there!");

        user1.viewMessageHistory(chatRoom);
        user2.viewMessageHistory(chatRoom);
        user3.viewMessageHistory(chatRoom);
    }
}

