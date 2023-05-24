/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto;

/**
 *
 * @author Administrator
 */
public class Ave extends Animal{
    private String AbreAsas;
    
    public Ave(String nome, int idade, String AbreAsas){
    super(nome, idade);
    this.AbreAsas = AbreAsas;
    
    }
    @Override
    public void emitirSom(){
        System.out.println("A ave emite um som");
    }
}
