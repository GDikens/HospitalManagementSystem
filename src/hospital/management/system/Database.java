/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;
import java.sql.*;

/**
 *
 * @author Dineth Kariyawasam
 */
public class Database {
    public static Statement getStatement(){
        // Create a connection to the database
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagementsystem","root" , "");
            Statement stat=con.createStatement();
            return stat;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
