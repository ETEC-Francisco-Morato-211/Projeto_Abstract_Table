/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author User
 */
public class Biblioteca {
    //Atributos
    private String nome;
    private int codigo;
    
    //Métodos 
    public void imprimirBiblioteca(){
        System.out.println("Nome:" + getNome());
        System.out.println("Código da bliblioteca: " + getCodigo());
        
    }
    
    //Método construtor completo

    public Biblioteca(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
    //Construdor vazio

    public Biblioteca() {
    this.setNome("Biblioteca não existente");
    }
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
