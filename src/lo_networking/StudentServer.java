package lo_networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
* A server which serves multiple clients [one at a time].
* Receives a student object from the client and saves it to a file.
* Have display of appropriate messages where ever applicable
* */

public class StudentServer {

    public static void main(String []args) {

        try {
            // start the service
            ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0]));

            // wait for a client to connect
            Socket connectedClient = serverSocket.accept();

            // fetch the data [using object]
            ObjectInputStream inputStreamFromClient =
                    new ObjectInputStream(connectedClient.getInputStream());
            Student receivedStudent = (Student) inputStreamFromClient.readObject();

            // work with the data
            System.out.println(receivedStudent);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
