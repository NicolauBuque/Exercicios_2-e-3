/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecto;

import java.io.*;
import java.io.FileReader;

/**
 *
 * @author Administrator
 */
public class Tarefa {

    public static void main(String[] args) throws IOException {
        LerInfoAnimal();

    }

    public static void LerInfoAnimal() throws IOException {
        try ( BufferedReader x = new BufferedReader(new FileReader("E:\\FENG-UEM\\2 ANO\\1-SEMESTRE\\POO1"))) {
            String linha;
            while ((linha = x.readLine()) != null) {
                String[] dados = linha.split(";");
                String[] tipoAnimal = dados;
                String nome = dados[1];
                int idade = Integer.parseInt(dados[2]);

                if (tipoAnimal.equals("Cachorro")) {
                    String tipoPelagem = dados[3];
                    String raca = dados[4];
                    cachorro cachorro = new cachorro(nome, idade, tipoPelagem, raca);
                    cachorro.emitirSom();

                } else if (tipoAnimal.equals("Homem")) {
                    String tipoPelagem = dados[3];
                    String profissao = dados[4];
                    Homem homem = new Homem(nome, idade, tipoPelagem, profissao);
                    homem.emitirSom();
                } else if (tipoAnimal.equals("Beija-Flor")) {
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
