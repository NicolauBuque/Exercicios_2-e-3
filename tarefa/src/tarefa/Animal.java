/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefa;

/**
 *
 * @author Administrator
 */
public class Animal {
    protected String nome;
    protected String ambiente;
    protected int patas;
    protected String cor;

    public Animal(String nome, String ambiente, int patas, String cor) {
        this.nome = nome;
        this.ambiente = ambiente;
        this.patas = patas;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", ambiente=" + ambiente + ", patas=" + patas + ", cor=" + cor + '}';
    }
    
   
}
