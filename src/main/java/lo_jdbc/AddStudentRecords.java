package lo_jdbc;

import java.sql.*;

public class AddStudentRecords {

    public static void main(String... args) {

        try {
            // connect to database
            Connection connection = connect();

            String sqlQuery =
                    "INSERT INTO " +
                            "Students " +
                            "(" +
                                "LastName, " +
                                "FirstName, " +
                                "Level" +
                            ") " +
                            "VALUES " +
                            "(" +
                                "?, " +
                                "?, " +
                                "?" +
                            ")";

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
                System.out.println(insertStatus + ": records added");
            } else {
                System.out.println("Record insert failed");
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
