package eventManagement;

import java.util.ArrayList;
import java.util.List;

class Event {
    private String eventName;
    private String eventDate;
    private Organizer organizer;
    private List<Attendee> attendees;

    public Event(String eventName, String eventDate, Organizer organizer) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.organizer = organizer;
        this.attendees = new ArrayList<>();
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void registerAttendee(Attendee attendee) {
        attendees.add(attendee);
        System.out.println(attendee.getName() + " registered for the event: " + eventName);
    }

    public void sendNotification(String message) {
        System.out.println("Notification sent for event '" + eventName + "': " + message);
        for (Attendee attendee : attendees) {
            attendee.receiveNotification(eventName, message);
        }
    }
}
