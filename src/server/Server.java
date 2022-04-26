package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket server;
    private Socket client;
    private DataInputStream in;
    private DataOutputStream out;
    private final int PORT = 6969;

    public Server() {

        try {
            server = new ServerSocket(PORT);
            System.out.println("-----------   S E R V E R    S T A R T E D   -----------");

        } catch (IOException e) {
            System.out.println("Error starting the server, please try again");
        }
    }

    public void startServer() throws IOException {

        while (true) {

            System.out.println("Waiting for a new client connection.....");

            // Awaiting the client connection
            client = server.accept();
            System.out.println("CLIENT CONNECTED...");

            out = new DataOutputStream(client.getOutputStream());
            in = new DataInputStream(client.getInputStream());

            out.writeUTF("Connected to server at PORT [" + PORT+"]");
            out.writeUTF("Enter your name: ");
        }

    }


}
