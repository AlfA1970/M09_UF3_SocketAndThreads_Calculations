package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    private Socket client;
    private DataInputStream in;
    private DataOutputStream out;

    private final int PORT = 6969;
    private final String HOST = "localhost";


    public Client(){

        try {

            client = new Socket(HOST, PORT);

        }catch (IOException e ){
            System.out.println("Error connecting to the server. Try again...");
        }
    }

    public void startClient() throws IOException{

        String message = "";
        out = new DataOutputStream(client.getOutputStream());
        in = new DataInputStream(client.getInputStream());

        //Receiving check connection from server
        message = in.readUTF();
        System.out.println(message);

        message = in.readUTF();
        System.out.print(message);

    }
}
