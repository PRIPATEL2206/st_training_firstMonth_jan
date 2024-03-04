package networkLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Server class
class Server {
    private ServerSocket serverSocket;
    private ExecutorService executorService;
    private MessageHandler messageHandler;

    public Server(int port, MessageHandler messageHandler) {
        try {
            this.serverSocket = new ServerSocket(port);
            this.executorService = Executors.newFixedThreadPool(10);
            this.messageHandler = messageHandler;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("Server is listening on port " + serverSocket.getLocalPort());
        try {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                executorService.submit(() -> handleClient(clientSocket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleClient(Socket clientSocket) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String message = reader.readLine();
            messageHandler.handleMessage(message);

            // Example response
            writer.println("Server received: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        try {
            serverSocket.close();
            executorService.shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
