package rtti;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Create an instance of MyClass
        MyClass myObject = new MyClass("Initial value");

        // Get the class object
        Class<?> myClass = MyClass.class;

        // Access fields using reflection
        Field privateField = myClass.getDeclaredField("privateField");
        privateField.setAccessible(true); // Make private field accessible
        System.out.println("Private field value: " + privateField.get(myObject));

        // Modify private field using reflection
        privateField.set(myObject, "New value");
        System.out.println("Modified private field value: " + privateField.get(myObject));

        // Access methods using reflection
        Method publicMethod = myClass.getMethod("publicMethod");
        publicMethod.invoke(myObject);

        Method privateMethod = myClass.getDeclaredMethod("privateMethod", String.class);
        privateMethod.setAccessible(true); // Make private method accessible
        privateMethod.invoke(myObject, "Hello, Reflection!");

        // Access getters and setters using reflection
        Method getPrivateFieldMethod = myClass.getMethod("getPrivateField");
        System.out.println("Using getter: " + getPrivateFieldMethod.invoke(myObject));

        Method setPrivateFieldMethod = myClass.getMethod("setPrivateField", String.class);
        setPrivateFieldMethod.invoke(myObject, "Updated value");
        System.out.println("Using setter: " + getPrivateFieldMethod.invoke(myObject));
    }
}
