/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto;

/**
 *
 * @author Administrator
 */
public class Homem extends Mamifero{
    
    private String profissao;
    
    public Homem(String nome, int idade,String tipoPelagem, String profissao){
    super(nome, idade, tipoPelagem);
    this.profissao =profissao;
    }
    @Override
    public void emitirSom(){
        System.out.println("O Homem Fala."); 
    }
}
