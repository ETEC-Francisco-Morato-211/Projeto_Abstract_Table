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
public class Livro {
    
    //Atributos 
   private String titulo; 
   private String categoria;
   private String autor;
   private int ano;
   
   //Métodos 
   public void imprimirLivro(){
       System.out.println("Título:" + getTitulo());
       System.out.println("Categoria:" + getCategoria());
       System.out.println("Autor:" + getAutor());
       System.out.println("Ano de publicação:" + getAno());
       

   }

    //Método construtor completo
    public Livro(String titulo, String categoria, String autor, int ano) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
        this.ano = ano;
    }

    //Método construtor vazio
    public Livro() {
        this.setTitulo("Livro não existente");
        
    }

    
   
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
