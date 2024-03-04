package testFramework;

import java.util.ArrayList;
import java.util.List;

// Represents a collection of test cases
class TestSuite {
    private List<TestCase> testCases = new ArrayList<>();

    public void addTestCase(TestCase testCase) {
        testCases.add(testCase);
    }

    public List<TestCase> getTestCases() {
        return testCases;
    }
}
