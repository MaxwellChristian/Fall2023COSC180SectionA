package lo_networking;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class StudentClient {

    public static void main(String []args) {

        try {
            // collect the data for the student [using an object]
            Student s1 = new Student();
            s1.setFirstName("Maxwell");
            s1.setLastName("Christian");
            s1.setCity("Regina");
            s1.setProvince("SK");
            s1.setPostalCode("XDX XDX");

            // connect to the server
            Socket connectedServer = new Socket(args[0], Integer.parseInt(args[1]));

            // send the data [student object] to the server
            ObjectOutputStream outputStreamToServer =
                    new ObjectOutputStream(connectedServer.getOutputStream());
            outputStreamToServer.writeObject(s1);

            // wait for the response from the server and then
            // code to show the alert dialog

            // close the connection
            connectedServer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

}
