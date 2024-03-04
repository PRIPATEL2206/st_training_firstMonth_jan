package typeEraseContainer;

public class TypeErasedContainer {

    private Object data;

    public void store(Object value) {
        this.data = value;
    }

    public Object retrieve() {
        return data;
    }

    public static void main(String[] args) {
        TypeErasedContainer container = new TypeErasedContainer();

        // Store different types of objects
        container.store("Hello, World!");
        container.store(42);
        container.store(true);

        // Retrieve and print objects
        Object stringValue = container.retrieve();
        System.out.println("String Value: " + stringValue);

        Object intValue = container.retrieve();
        System.out.println("Integer Value: " + intValue);

        Object boolValue = container.retrieve();
        System.out.println("Boolean Value: " + boolValue);
    }
}
