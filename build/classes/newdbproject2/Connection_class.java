/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newdbproject2;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class Connection_class {
    public static Connection getconnection(){
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/osa","root","");
            
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"An error: "+e.getMessage());
        }
        return null;
    }
    public static void main(String[] args) {
        getconnection();
    }
}
