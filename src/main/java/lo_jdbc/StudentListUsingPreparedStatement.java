package lo_jdbc;

import java.sql.*;

public class StudentListUsingPreparedStatement {

    public static void main(String []args) {

        try {
            // connect to database
            Connection connection = connect();

            // execute and fetch the results
//            String sqlQuery =
//                    "SELECT " +
//                            "LastName, FirstName AS FN, StudentID, Level " +
//                        "FROM " +
//                            "Students " +
//                        "WHERE " +
//                            "Level = '" + args[0] + "' " +
//                        "AND " +
//                            "LastName = '" + args[1] + "'" +
//                            "";

            String sqlQuery =
                    "SELECT " +
                            "LastName, FirstName AS FN, StudentID, Level " +
                        "FROM " +
                            "Students " +
                        "WHERE " +
                            "Level = ? " +
                        "AND " +
                            "LastName = ? " +
                            "";

            // create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            // set the dynamic values to prepare the query
            preparedStatement.setString(1, args[0]);
            preparedStatement.setString(2, args[1]);

            // fetch the results
            ResultSet resultSet = preparedStatement.executeQuery();

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

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
