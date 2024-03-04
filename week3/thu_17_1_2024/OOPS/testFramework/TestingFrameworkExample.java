package testFramework;


public class TestingFrameworkExample {
    public static void main(String[] args) {
        TestSuite testSuite = new TestSuite();
        testSuite.addTestCase(new ExampleTestCase("testAddition"));

        TestRunner.run(testSuite);
    }
}

