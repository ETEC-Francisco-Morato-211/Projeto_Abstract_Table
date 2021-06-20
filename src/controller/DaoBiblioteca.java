/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.design.Biblioteca;

/**
 *
 * @author User
 */
public class DaoBiblioteca {
    //Atributos
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    //métodos
    public void create (Biblioteca b){
        
        try{
        //Estabelecer conexao
        con = Conexao.getConnection();
            
       //codigo SQL
       stmt = con.prepareStatement("INSERT INTO Biblioteca(nome, codigo) VALUES(?,?)"); 
       
       //atribuição de valores
       
       stmt.setString(1, b.getNome());
       stmt.setInt(2, b.getCodigo());
       
       //execução
       stmt.executeUpdate();
       
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro no create " + e.getMessage());
        }finally{
            Conexao.closeConnection(con, stmt);
        }
            
        
    }
    
    public List<Biblioteca> read(){
        
        List<Biblioteca> biblioteca = new ArrayList<>();
        
        try{
            con = Conexao.getConnection();
            stmt = con.prepareStatement("SELECT nome, codigo " + "FROM Biblioteca");
            
            rs = stmt.executeQuery();
            while(rs.next()){
                 biblioteca.add(new Biblioteca(rs.getString("nome"), rs.getInt("codigo")));
            }
            
            return biblioteca;
        
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de read.. "+ e.getMessage());
        } finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return null;
        
        }
     public void update (Biblioteca b){
            try{
                con = Conexao.getConnection();
                
                stmt = con.prepareStatement("UPDATE Biblioteca" + "SET nome = ?," + "SET codigo = ?");
                
                stmt.setString(1, b.getNome());
                stmt.setInt(2, b.getCodigo());
                
            }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro no update" +e.getMessage());
            }finally{
                Conexao.closeConnection(con, stmt);
            }
    }
         public void delete (Biblioteca b){
             
      try{
          con = Conexao.getConnection();
          stmt = con.prepareStatement("DELETE FROM biblioteca WHERE nome = ?");
          
          stmt.setString(1, b.getNome());
          
          stmt.execute();
          
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Erro no delete!" + e.getMessage());
      }finally{
          Conexao.closeConnection(con, stmt);
      }
  }

    
    
    }
    


