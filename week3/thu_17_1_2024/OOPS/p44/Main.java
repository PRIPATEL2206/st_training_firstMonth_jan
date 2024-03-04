package p44;


public class Main {
    public static void main(String[] args) {
        // Create an instance of ConstrainedGenericClass with ExampleClass
        ExampleClass example = new ExampleClass("Hello, Generics!");
        ConstrainedGenericClass<ExampleClass> genericObject = new ConstrainedGenericClass<>(example);

        // Process data using the generic object
        genericObject.processData();
    }
}
