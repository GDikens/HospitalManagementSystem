/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dineth Kariyawasam
 */
public class Doctor {
    
    public void setDoctorDetails(String DoctorName,String DOB,String Address,String NIC,String Gender,String TeleNo,String UserID){
        try {
            Statement s=Database.getStatement();
            s.executeUpdate("INSERT INTO doctordetails(DoctorName,DOB,Address,NIC,Gender,TeleNo,UserID) values('"+DoctorName+"','"+DOB+"','"+Address+"','"+NIC+"','"+Gender+"','"+TeleNo+"','"+UserID+"')");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
