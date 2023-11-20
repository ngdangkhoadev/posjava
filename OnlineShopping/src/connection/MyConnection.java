/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author THANH..NGAN
 */
public class MyConnection {
    public static final String username = "railway";
    public static final String password = "oatmH*sWjWzIrVRCLcDSvvco5zGvt5a6";
    public static final String url = "jdbc:mysql://railway:oatmH*sWjWzIrVRCLcDSvvco5zGvt5a6@viaduct.proxy.rlwy.net:35668/railway";
    public static Connection con = null;
    
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ""+ex, "", JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }
}
    