package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task-" + i);
            executorService.submit(task);
        }
        executorService.shutdown();
    }
}

