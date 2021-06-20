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
import model.design.Livro;

/**
 *
 * @author User
 */
public class DaoLivro {
    //Atributos
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    //Metodos
    public void create(Livro l){
        
        try{
            //Estabelecer conexao
            con = Conexao.getConnection();
            
            //codigo SQL
            stmt = con.prepareStatement("INSERT INTO Livro(titulo, categoria, autor, ano) VALUES(?, ?, ?, ?)");
            
            //Atribuição de valores
            stmt.setString(1, l.getTitulo());
            stmt.setString(2, l.getCategoria());
            stmt.setString(3, l.getAutor());
            stmt.setInt(4, l.getAno());
            
            //Execução
            stmt.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro no create" + e.getMessage());
        } finally{
            Conexao.closeConnection(con, stmt);
        }
            
            
    }
    
    public List<Livro> read(){
        //Lista de livros
        List<Livro> livros = new ArrayList<>();
        
        try{ 
            con = Conexao.getConnection();
            stmt = con.prepareStatement("SELECT titulo, categoria, autor, ano " + "FROM Livro");
            
            rs = stmt.executeQuery();
            while(rs.next()){
                livros.add(new Livro(rs.getString("titulo"), rs.getString("categoria"), rs.getString("autor"), rs.getInt("ano")));
                
            }
            
            return livros;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de read.."+ e.getMessage());
        } finally{
            Conexao.closeConnection(con, stmt, rs);
        }
        
        return null;
        
    }
        public void update (Livro l){
            try{
                con = Conexao.getConnection();
                
                stmt = con.prepareStatement("UPDATE livro" + "SET titulo = ?," + "SET categoria = ?," + "SET autor = ?," + "SET ano = ?");
                
                stmt.setString(1, l.getTitulo());
                stmt.setString(2, l.getCategoria());
                stmt.setString(3, l.getAutor());
                stmt.setInt(4, l.getAno());
                
            }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro no update" +e.getMessage());
            }finally{
                Conexao.closeConnection(con, stmt);
            }
    }
        
  public void delete (Livro l){
      try{
          con = Conexao.getConnection();
          stmt = con.prepareStatement("DELETE FROM livro WHERE titulo = ?");
          
          stmt.setString(1, l.getTitulo());
          
          stmt.execute();
          
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Erro no delete!" + e.getMessage());
      }finally{
          Conexao.closeConnection(con, stmt);
      }
  }
    
}
