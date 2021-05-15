/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Livro;

/**
 * Autor: Caroline Fernandes Aguiar Simião 
 * 
 */
public class TesteLivro {
    public static void main(String[] args) {
        
        //Criação e instância da classe Livro
        Livro livro = new Livro();
        
        //Construção do objeto
       livro.setTitulo(" O último olimpiano");
       livro.setCategoria("Fantasia");
       livro.setAutor("Rick Riordan");
       livro.setAno(2009); 
       
       //Imprimir o livro
        System.out.println("\n\t\t\t °°° Livro 1 °°° \n ");
        livro.imprimirLivro();
        
        //Construtor
        Livro livroDois = new Livro("A última festa", "Thriller", "Lucy Foley", 2018);
        
        //Imprimindo LivroDois
        System.out.println("\n\t\t\t °°° Livro 2 °°° \n ");
        livroDois.imprimirLivro();
        
        
    }
    
}