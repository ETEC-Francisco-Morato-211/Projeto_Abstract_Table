/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.design.Livro;

/**
 *
 * @author Caroline Fernandes Aguiar Simião 
 */
public class TabelaLivro extends AbstractTableModel {
    //Lista de Livros
    private List<Livro> livro = new ArrayList<>();
    
    //Vetor 
    private String[] colunas = {"Título", "Categoria", "Autor", "Ano"};
    
    
    public void limparTabela(){
        livro.clear();
    }

    
    
    @Override
    public int getRowCount() {
        return livro.size();
   
    }

    @Override
    public int getColumnCount() {
      return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return livro.get(rowIndex).getTitulo();
            case 1:
                return livro.get(rowIndex).getCategoria();
            case 2: 
                return livro.get(rowIndex).getAutor();
            case 3: 
                return livro.get(rowIndex).getAno();
                
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0: 
                livro.get(rowIndex).setAutor((String)o);
                break;
            case 1: 
                livro.get(rowIndex).setCategoria((String)o);
                break;
            case 2:
                livro.get(rowIndex).setAutor((String)o);
            break;
            case 3:
                livro.get(rowIndex).setAno(Integer.parseInt((String)o));
                break;
            
            
        }
        //Atualizar Tabela
        this.fireTableCellUpdated(rowIndex, rowIndex);
        
        
        
    }
    
    public void addRow (Livro l) {
        this.livro.add(l);
        this.fireTableDataChanged();
    }

     public void removeRow (int rowIndex){
         this.livro.remove(rowIndex);
         this.fireTableRowsDeleted(rowIndex, rowIndex);
     }
}
