package lo_jdbc;

import javax.security.auth.login.AccountLockedException;
import java.sql.*;

public class StudentList {

    public static void main(String []args) {

        try {
            // connect to database
            Connection connection = connect();

            // create a statement
            Statement statement = connection.createStatement();

            // execute and fetch the results
            String sqlQuery =
                    "SELECT " +
                        "LastName, FirstName AS FN, StudentID, Level " +
                    "FROM " +
                        "Students " +
                    "WHERE " +
                        "Level = 'Senior'" +
                    "";

            // fetch the results
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                System.out.print( resultSet.getString(1) );
                System.out.print(", ");

                // System.out.print( resultSet.getString("FirstName") );
                System.out.print( resultSet.getString("FN") );
                System.out.print(", ");

                System.out.print( resultSet.getString("Level") );

                System.out.println();
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
