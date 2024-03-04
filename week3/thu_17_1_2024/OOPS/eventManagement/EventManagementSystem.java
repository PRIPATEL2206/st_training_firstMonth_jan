package eventManagement;

import java.util.ArrayList;
import java.util.List;

public class EventManagementSystem {
    public static void main(String[] args) {
        // Create an organizer
        Organizer organizer = new Organizer("John Doe", "john.doe@example.com");

        // Create an event
        Event event = new Event("Tech Conference", "2024-03-15", organizer);

        // Create attendees
        Attendee attendee1 = new Attendee("Alice", "alice@example.com");
        Attendee attendee2 = new Attendee("Bob", "bob@example.com");

        // Register attendees for the event
        event.registerAttendee(attendee1);
        event.registerAttendee(attendee2);

        // Send a notification to attendees
        event.sendNotification("Reminder: Tech Conference is approaching!");

        // Additional functionalities can be added based on specific requirements
    }
}

