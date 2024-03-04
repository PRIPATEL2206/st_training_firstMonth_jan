package immutable;

public class Main {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("John", "Doe", 25);

        // Accessing properties
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());

        // Attempting to modify properties (will result in a compilation error)
        // person.setFirstName("Jane");  // Error: cannot assign a value to final variable 'firstName'
    }
}

