package distributedComputer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Server to handle incoming connections and distribute tasks
class DistributedServer {
    private final int port;
    private final ExecutorService executorService;

    public DistributedServer(int port, int numThreads) {
        this.port = port;
        this.executorService = Executors.newFixedThreadPool(numThreads);
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleClient(Socket clientSocket) {
        executorService.execute(() -> {
            try (ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream());
                 ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream())) {

                // Receive computation task from client
                ComputationTask computationTask = (ComputationTask) inputStream.readObject();

                // Perform computation locally
                computationTask.run();

                // Send back the result
                outputStream.writeObject(computationTask);

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        });
    }
}
