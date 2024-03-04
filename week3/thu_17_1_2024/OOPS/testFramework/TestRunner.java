package testFramework;

// Runs the test cases in a test suite and reports the results
class TestRunner {
    public static void run(TestSuite testSuite) {
        int totalTests = 0;
        int passedTests = 0;
        int failedTests = 0;

        for (TestCase testCase : testSuite.getTestCases()) {
            totalTests++;

            try {
                testCase.runTest();
                System.out.println("Test Case '" + testCase.getName() + "' PASSED");
                passedTests++;
            } catch (AssertionError e) {
                System.err.println("Test Case '" + testCase.getName() + "' FAILED: " + e.getMessage());
                failedTests++;
            } catch (Exception e) {
                System.err.println("Test Case '" + testCase.getName() + "' ERRORED: " + e.getMessage());
                failedTests++;
            }
        }

        System.out.println("\nTest Summary:");
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed Tests: " + passedTests);
        System.out.println("Failed Tests: " + failedTests);
    }
}
