package Bank.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Con {
        Connection connection;
        Statement statement;
    public Con()  {
        try{
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_System", "root", "munnaaziz");
            statement  = connection.createStatement();
        }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}

