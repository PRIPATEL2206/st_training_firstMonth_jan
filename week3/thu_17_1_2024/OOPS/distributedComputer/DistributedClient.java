package distributedComputer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

// Client to connect to the server and send/receive tasks
class DistributedClient {
    private final String serverAddress;
    private final int serverPort;

    public DistributedClient(String serverAddress, int serverPort) {
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
    }

    public void performComputation(ComputationTask computationTask) {
        try (Socket socket = new Socket(serverAddress, serverPort);
             ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream())) {

            // Send computation task to the server
            outputStream.writeObject(computationTask);

            // Receive the result from the server
            ComputationTask resultTask = (ComputationTask) inputStream.readObject();

            // Further processing with the result if needed
            // ...

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
