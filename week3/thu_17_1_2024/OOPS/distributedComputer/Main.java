package distributedComputer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Initialize distributed server
        DistributedServer server = new DistributedServer(9999, 5);
        new Thread(server::start).start();

        // Initialize distributed clients
        DistributedClient client1 = new DistributedClient("localhost", 9999);
        DistributedClient client2 = new DistributedClient("localhost", 9999);

        // Example data for computation
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Divide the computation into tasks
        int dataSize = data.length;
        int partitionSize = dataSize / 2;

        ComputationTask task1 = new ComputationTask(0, partitionSize, data);
        ComputationTask task2 = new ComputationTask(partitionSize, dataSize, data);

        // Perform computation in parallel using distributed clients
        client1.performComputation(task1);
        client2.performComputation(task2);

        // Wait for the tasks to complete
        while (true) {
            if (task1.isDone() && task2.isDone()) {
                break;
            }
        }

        // Print the result
        System.out.println("Result after distributed computation: " + Arrays.toString(data));
    }
}
