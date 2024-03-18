package lo_networking;

import java.io.*;
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
            System.out.println("Server started. Providing service at " + Integer.parseInt(args[0]));

            while (true) {
                // wait for a client to connect
                Socket connectedClient = serverSocket.accept();
                System.out.println("Client connected: "
                        + connectedClient.getInetAddress()
                        + "/"
                        + connectedClient.getPort());

                // fetch the data [using object]
                ObjectInputStream inputStreamFromClient =
                        new ObjectInputStream(connectedClient.getInputStream());
                Student receivedStudent = (Student) inputStreamFromClient.readObject();
                System.out.println("Student received: " + receivedStudent);

                // work with the data
                // System.out.println(receivedStudent);
                // store the student object to a file
                System.out.println("Attempt to save to file: Started");
                saveToFile(receivedStudent);
                System.out.println("Attempt to save to file: Completed [Success]");

            }


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void saveToFile(Student studentToSave) throws IOException {
        ObjectOutputStream outputStream =
                new ObjectOutputStream(
                        new FileOutputStream("data_files/student.txt", true));

        outputStream.writeObject(studentToSave);
        outputStream.close();
    }

}
