package concurrency;

// Task class to represent the work to be done by the threads
class Task implements Runnable {
    private String taskName;
    public Task(String taskName) {
        this.taskName = taskName;
    }
    @Override
    public void run() {
        System.out.println("Task " + taskName + " is being executed by thread " + Thread.currentThread().getName());
    }
}
