package chatSystem;

import java.util.ArrayList;
import java.util.List;

// Represents a chat room where users can send messages
class ChatRoom {
    private String name;
    private List<User> participants;
    private List<Message> messageHistory;

    public ChatRoom(String name) {
        this.name = name;
        this.participants = new ArrayList<>();
        this.messageHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public List<Message> getMessageHistory() {
        return messageHistory;
    }

    public void join(User user) {
        participants.add(user);
        System.out.println(user.getUsername() + " joined " + name);
    }

    public void sendMessage(User sender, String messageContent) {
        Message message = new Message(sender, messageContent);
        messageHistory.add(message);

        // Broadcast the message to all participants
        for (User participant : participants) {
            if (!participant.equals(sender)) {
                participant.receiveMessage(message);
            }
        }
    }
}
