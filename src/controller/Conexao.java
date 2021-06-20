/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Conexao {
    //Atributos 
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/livro";
    private static final String USR = "root";
    private static final String PWD = "adm1234";
    
    //Metodos
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USR, PWD);
            
        }catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro 1 de conexão" + e.getMessage());
            return null;
            
        }
    }
    public static void closeConnection(Connection con){
        try{
            if(con != null){
                con.close();
            } 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de fecha 1." + e.getMessage());
        }
    }
 
    public static void closeConnection(Connection con, PreparedStatement stmt){
        //Chamada do método anterior
        closeConnection(con);
        
        try{
            if(stmt != null) {
                stmt.close();
                        
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de fecha 2." + e.getMessage());
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        //Chamada do metodo anterior
        closeConnection(con, stmt);
        
        try{
            if(rs != null){
                rs.close();
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de fecha 3." +e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
}

