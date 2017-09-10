package forms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

public class Connect {
    Connection connSQLite=null;
    public static Connection ConnectDB(){
        try{ 
            //For MySQL database
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/stmems","root","");
            
            //For SQLite database
            Class.forName("org.sqlite.JDBC");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver") ;3
            
            //Database path for linux
            Connection conn = DriverManager.getConnection("jdbc:sqlite:hmdb_local.sqlite");
            
            /*Database path for Windows
            Connection conn = DriverManager.getConnection("jdbc:odbc:stmems");
            JOptionPane.showMessageDialog(null, "Connection Established");*/
            return conn;
        
        }catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
