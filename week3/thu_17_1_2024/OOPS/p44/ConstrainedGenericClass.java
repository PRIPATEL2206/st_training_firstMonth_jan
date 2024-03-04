package p44;

// Define a generic class with constraints using the concept-like interfaces
class ConstrainedGenericClass<T extends Printable & Comparable<T>> {
    private T data;

    public ConstrainedGenericClass(T data) {
        this.data = data;
    }

    public void processData() {
        data.print();
        System.out.println("Comparison result: " + data.compareTo(data));
    }
}
