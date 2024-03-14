package lo_networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerDemo {

    public static void main(String []args) {

        try {
            // the port number is where the server provides a service
            ServerSocket serverSocket = new ServerSocket(9000);
            System.out.println("Server started. Serving at port 9000");

            System.out.println("Waiting for client to connect");

            // wait for a client co connect
            Socket connectedClient = serverSocket.accept();
            System.out.println("Client connected");

            // fetch/read the message from the client
            DataInputStream inputStreamFromClient = new DataInputStream(connectedClient.getInputStream());
            String messageFromClient = inputStreamFromClient.readUTF();
            System.out.println("Client says: " + messageFromClient);

            // send the current timestamp to the connected client
            String timeStamp = new Date().toString();
            DataOutputStream outputStreamToClient = new DataOutputStream(connectedClient.getOutputStream());
            outputStreamToClient.writeUTF(timeStamp);

            // terminating the connection with the client
            connectedClient.close();

            // shutdown the server/service
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
