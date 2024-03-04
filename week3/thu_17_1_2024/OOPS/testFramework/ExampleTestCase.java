package testFramework;

// Example of a concrete test case
class ExampleTestCase extends TestCase {
    public ExampleTestCase(String name) {
        super(name);
    }

    @Override
    void runTest() {
        // Example test logic
        int result = add(2, 3);
        assert result == 5 : "Expected result to be 5, but got " + result;
    }

    private int add(int a, int b) {
        return a + b;
    }
}
