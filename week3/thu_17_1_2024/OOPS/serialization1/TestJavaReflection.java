package serialization1;

import java.lang.reflect.Field;

public class TestJavaReflection {
    public static void main(String[] args) {
        ExampleObject exampleObj = new ExampleObject(42, "Hello", 3.14);

        // Serialize the object using reflection
        String serializedData = Serializer.serialize(exampleObj);

        // Display the serialized data
        System.out.println("Serialized Data: " + serializedData);
    }
}
