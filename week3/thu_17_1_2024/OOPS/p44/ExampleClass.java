package p44;

// Implement a class that satisfies the constraints
class ExampleClass implements Printable, Comparable<ExampleClass> {
    private String value;

    public ExampleClass(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("Printing: " + value);
    }

    @Override
    public int compareTo(ExampleClass other) {
        return this.value.compareTo(other.value);
    }
}
