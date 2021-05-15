/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Biblioteca;

/**
 *
 * @author User
 */
public class TesteBiblioteca {
    public static void main(String[] args) {
    //Criação e instancia do objeto Biblioteca
        
    Biblioteca biblioteca = new Biblioteca();
    
    //Construção do objeto
    biblioteca.setNome("Biblioteca de Francisco Morato");
    biblioteca.setCodigo(1234);
    
    //Imprimir a biblioteca
        System.out.println("\n\t\t\t °°° Biblioteca 1 °°° \n ");
        biblioteca.imprimirBiblioteca();
        
        //Construção de outra biblioteca 
        Biblioteca bibliotecaDois = new Biblioteca("Biblioteca de Franco Da Rocha", 5678);
        
        //Imprimindo a outra biblioteca
        System.out.println("\n\t\t\t °°° Biblioteca 2 °°° \n ");
        bibliotecaDois.imprimirBiblioteca();
        
        
        
        
    }
}
