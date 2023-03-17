/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Faiq Shahzad
 */
public class DAL {

    String connectionUrl;
    Connection connection;
    Statement statement;

    public DAL() {
        this.connectionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=POS_System;"
                + "user=sa;"
                + "password=1234;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=5;";

        try {
            this.connection = DriverManager.getConnection(connectionUrl);

            this.statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void runQuery(String SQLQuery) {
        try {
            statement.executeUpdate(SQLQuery);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public ResultSet runQueryAndGetTable(String SQLQuery) {
        ResultSet resultSet = null;

        try {
            resultSet = statement.executeQuery(SQLQuery);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return resultSet;
    }

}
