package aula10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        File arquivo = new File(".//arquivo.txt");

        try{
            if(arquivo.createNewFile())
                System.out.println("Arquivo criado com sucesso!");
            else
                System.out.println("Arquivo já existe!");
        } catch (IOException e){
            System.err.println("Erro ao criar arquivo: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());
        System.out.println("Caminho relativo: "+arquivo.getPath());
        System.out.println("Nome: "+arquivo.getName());
        System.out.println("Pai: "+arquivo.getParent());
        System.out.println("Leitura: "+arquivo.canRead());
        System.out.println("Escrita: "+arquivo.canWrite());
        System.out.println("Execução: "+arquivo.canExecute());
        System.out.println("É arquivo: "+arquivo.isFile());
        System.out.println("É diretório: "+arquivo.isDirectory());

        try {
            FileWriter output = new FileWriter("./arquivo.txt");
            for (int i = 0; i < 100; i++) {
                output.write(i + "\n");
                // output.write("Linha "+i + "\n");
            }
            output.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}