/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto;

/**
 *
 * @author Administrator
 */
public class Mamifero extends Animal {

    String tipoPelagem;

    public Mamifero(String nome, int idade, String tipoPelagem) {
        super(nome, idade);
        this.tipoPelagem = tipoPelagem;
    }
    @Override
    public void emitirSom(){
        System.out.println("O mamifero emite som: ");
    }

}
