package distributedComputer;

import java.io.Serializable;
import java.util.concurrent.CompletableFuture;

// Task to perform computation
class ComputationTask implements Runnable, Serializable {
    private final int start;
    private final int end;
    private final int[] data;
    private final CompletableFuture<Void> completion;

    public ComputationTask(int start, int end, int[] data) {
        this.start = start;
        this.end = end;
        this.data = data;
        this.completion = new CompletableFuture<>();
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            // Perform computation on data[i]
            data[i] = data[i] * 2;
        }
        completion.complete(null); // Mark the task as completed
    }

    // Check if the task is done
    public boolean isDone() {
        return completion.isDone();
    }
}
