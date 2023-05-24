/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto;


public class Animal {
    String nome;
    int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade=idade;
    }
    public void emitirSom(){
        System.out.println("O animal emite um som ");
    }
}
