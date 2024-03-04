package chatSystem;

import java.util.List;

// Represents a user in the chat system
class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(ChatRoom chatRoom, String messageContent) {
        chatRoom.sendMessage(this, messageContent);
    }
    public void receiveMessage(Message message) {
        System.out.println(username + " received message: " + message.getContent());
    }
    public void viewMessageHistory(ChatRoom chatRoom) {
        List<Message> messageHistory = chatRoom.getMessageHistory();
        System.out.println("Message history in " + chatRoom.getName() + ":");
        for (Message message : messageHistory) {
            System.out.println(message.getSender().getUsername() + ": " + message.getContent());
        }
    }
}
