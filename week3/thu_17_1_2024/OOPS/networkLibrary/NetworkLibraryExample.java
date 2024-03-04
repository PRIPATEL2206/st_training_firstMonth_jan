package networkLibrary;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NetworkLibraryExample {
    public static void main(String[] args) {
        // Start the server
        Server server = new Server(8080, message -> System.out.println("Server received: " + message));
        new Thread(server::start).start();

        Client client = new Client("localhost", 8080);

        client.sendMessage("Hello, Server!");
        System.out.println("Client received: " + client.receiveMessage());
        server.stop();
        client.close();
    }
}

