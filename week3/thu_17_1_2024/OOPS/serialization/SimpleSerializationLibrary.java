package serialization;

import java.io.*;

public class SimpleSerializationLibrary {

    public static byte[] serialize(Object object) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {

            objectOutputStream.writeObject(object);
            return byteArrayOutputStream.toByteArray();
        }
    }

    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
             ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {

            return objectInputStream.readObject();
        }
    }

    public static void main(String[] args) {
        try {
            // Example: Serializing and deserializing an object
            MyObject originalObject = new MyObject("John Doe", 25);
            byte[] serializedData = serialize(originalObject);

            MyObject deserializedObject = (MyObject) deserialize(serializedData);

            // Verify deserialized object
            System.out.println("Deserialized Object: " + deserializedObject);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

