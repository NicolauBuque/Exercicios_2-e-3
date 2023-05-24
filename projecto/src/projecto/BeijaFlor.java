/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto;

/**
 *
 * @author Administrator
 */
public class BeijaFlor extends Ave {
    private String corPenas;
    
    public BeijaFlor(String nome, int idade, String AbreAsas, String corPenas){
        super(nome, idade, AbreAsas);
        this.corPenas = corPenas;
    
    }

    
    @Override
    public void emitirSom(){
        System.out.println("O beija-flor emite som");
    }
    
}
