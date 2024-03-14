package lo_networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientDemo {

    public static void main(String[] args) {

        try {
//            Socket connectionToServer = new Socket("www.someserver.com", 9000);
//            Socket connectionToServer = new Socket("127.0.0.1", 9000);
            Socket connectionToServer = new Socket("localhost", Integer.parseInt(args[0]));
            System.out.println("Connected to server");

            // send a "HELLO" to the server
            DataOutputStream outputStreamToServer = new DataOutputStream(connectionToServer.getOutputStream());
            outputStreamToServer.writeUTF("HELLO");

            // receive the current timestamp of the server
            DataInputStream inputStreamFromServer = new DataInputStream(connectionToServer.getInputStream());
            System.out.println("Server says: " + inputStreamFromServer.readUTF());

            connectionToServer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
