package eventManagement;

class Organizer {
    private String name;
    private String email;

    public Organizer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
