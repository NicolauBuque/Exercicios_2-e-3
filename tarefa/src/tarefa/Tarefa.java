/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarefa;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Administrator
 */
public class Tarefa {

    public static void main(String[] args) {

        try {
            FileReader fr;
            fr = new FileReader("\"E:\\FENG-UEM\\2 ANO\\1-SEMESTRE\\POO1\\Eu\\Animais.txt\"");
            BufferedReader bf = new BufferedReader(fr);
            String linha = bf.readLine();
            System.out.println(linha);
            while (linha != null) {
            }
        } catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        }

    }

}
