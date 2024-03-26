package lo_jdbc;

/*
*
* Display the attendance data of a student
* The details must have the student name (first+last), ID, date, status of attendance.
*
* If the student has never attended any session, display an appropriate message
* */

import java.sql.*;

public class StudentAttendance {

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

    public static void main(String []args) {

        try {
            // connect to database
            Connection connection = connect();

            String sqlQuery =
                    "SELECT " +
                            "Student, " +
                            "LastName, " +
                            "FirstName, " +
                            "Status, " +
                            "AttendanceDate " +
                        "FROM " +
                            "Students, " +
                            "StudentAttendance " +
                        " WHERE " +
                            "Students.ID = StudentAttendance.Student" +
                            "";

            // create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            // set the dynamic values to prepare the query
//            preparedStatement.setString(1, args[0]);
//            preparedStatement.setString(2, args[1]);

            // fetch the results
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            while (resultSet.next()) {
                System.out.printf("%-3s ", resultSet.getString(1));
                System.out.printf("%-30s ", resultSet.getString(2));
                System.out.printf("%-30s ", resultSet.getString(3));
                System.out.printf("%-30s ", resultSet.getString(4));
                System.out.printf("%-30s ", resultSet.getString(5));

                System.out.println();
            }

            // close the connection
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
