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
public class Patient {
    
    public void setPatientDetails(String PatientName,String DOB,String Address,String NIC,String Gender,String GuardianName,String GuardianNIC,String GuardianTeleNo,String AdmittedWard,String AdmittedDate,String AdmittedTime,String AssignedDoctorID){
        try {
            Statement s=Database.getStatement();
            s.executeUpdate("INSERT INTO patientdetails(PatientName,DOB,Address,NIC,Gender,GuardianName,GuardianNIC,GuardianTeleNo,AdmittedWard,AdmittedDate,AdmittedTime,AssignedDoctorID) VALUES('"+PatientName+"','"+DOB+"','"+Address+"','"+NIC+"','"+Gender+"','"+GuardianName+"','"+GuardianNIC+"','"+GuardianTeleNo+"','"+AdmittedWard+"','"+AdmittedDate+"','"+AdmittedTime+"','"+AssignedDoctorID+"')");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error! "+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
