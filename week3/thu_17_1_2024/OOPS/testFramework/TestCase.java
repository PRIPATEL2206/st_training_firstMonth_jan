package testFramework;

// Base class for test cases
abstract class TestCase {
    private String name;

    public TestCase(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by concrete test cases
    abstract void runTest();

    public String getName() {
        return name;
    }
}
