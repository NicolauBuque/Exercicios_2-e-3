/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto;

/**
 *
 * @author Administrator
 */
public class cachorro extends Mamifero {
    
    String raca;
    
    public cachorro(String nome,int idade, String tipoPelagem, String raca){
    super(nome, idade, tipoPelagem);
    this.raca = raca;
    
    }
    @Override
    public void emitirSom(){
        System.out.println("O cachorro late");
    }
}
