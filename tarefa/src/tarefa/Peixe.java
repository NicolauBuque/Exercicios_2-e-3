/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefa;

/**
 *
 * @author Administrator
 */
public class Peixe extends Animal {
    private String caract;

    public Peixe(String caract, String nome, String ambiente, int patas, String cor) {
        super(nome, ambiente, patas, cor);
        this.caract = caract;
    }
     public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("patas: " + patas);
        System.out.println("cor: " + cor);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Peixe{" + "caract=" + caract + '}';
    }
    
}
