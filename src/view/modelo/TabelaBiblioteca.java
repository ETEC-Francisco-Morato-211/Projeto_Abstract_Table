/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.design.Biblioteca;

/**
 *
 * @author User
 */
public class TabelaBiblioteca extends AbstractTableModel {
    //Lista
    private List<Biblioteca> biblioteca = new ArrayList<>();
    
    //Vetor 
    private String[] colunas = {"Nome", "Código"};
    
    

    @Override
    public int getRowCount() {
        return biblioteca.size();
        
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
        switch(columnIndex){
            case 0: 
                return biblioteca.get(rowIndex).getNome();
            case 1:
                return biblioteca.get(rowIndex).getCodigo();
                
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
              biblioteca.get(rowIndex).setNome((String)o);
            break;
            case 1:
                biblioteca.get(rowIndex).setCodigo(Integer.parseInt((String)o));
                break;
        }
            //Atualizando a tabela
            this.fireTableRowsUpdated(rowIndex, rowIndex);
            
            
    }
     public void addRow(Biblioteca b){
         this.biblioteca.add(b);
         this.fireTableDataChanged();
         
    
    }
    public void removeRow(int rowIndex){
        this.biblioteca.remove(rowIndex);
        
    }
}
