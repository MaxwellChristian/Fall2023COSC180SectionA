package lo_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudentRecord {

    public static void main(String... args) {

        try {
            // connect to database
            Connection connection = connect();

            String sqlQuery =
                    "UPDATE Students SET LastName = ?, FirstName = ? WHERE ID = ?";
//            "UPDATE Students SET LastName = 'LT1', FirstName = 'FT1' WHERE ID = 6";
//            "UPDATE Students SET LastName = 'LT2', FirstName = 'FT2' WHERE LastName = 'LT1' AND FirstName = 'FT1' ";

            // create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            // set the dynamic values to prepare the query

            // last name
            preparedStatement.setString(1, args[0]);
            // first name
            preparedStatement.setString(2, args[1]);
            // level
            preparedStatement.setString(3, args[2]);

            // execute the insert using applicable method
            int insertStatus = preparedStatement.executeUpdate();
            if (insertStatus > 0) {
                System.out.println(insertStatus + ": records updated");
            } else {
                System.out.println("Record update failed");
            }

            // close the connection
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static Connection connect() {

        Connection connection = null;

        try {
            // load the driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

            // connect to required database
            connection = DriverManager.getConnection("jdbc:ucanaccess://Students.accdb", "scott", "tiger");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // return the connection
            return connection;
        }

    }

}
