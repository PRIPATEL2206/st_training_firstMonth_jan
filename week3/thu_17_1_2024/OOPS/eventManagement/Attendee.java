package eventManagement;

class Attendee {
    private String name;
    private String email;

    public Attendee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void receiveNotification(String eventName, String message) {
        System.out.println("Notification received by " + name + " for event '" + eventName + "': " + message);
    }
}
