package aula08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===================Parte 2===================");

        String[] nomes = new String[3];

        try {
            System.out.println(nomes[4]);
        } catch (Exception e) {
            System.out.println("Tentiva de acesso em um indice inválido de um array na linha: " + e.getMessage());
        }

        System.out.println("Linha não executada");

        System.out.println("===================Parte 2===================");

        int[] numeros = { 10, 20, 30, 40, 50, 60 };
        int[] divisor = { 2, 0, 3, 0 };

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + divisor[i] + " = " + (numeros[i] / divisor[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero na linha: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Tentativa de acesso em um indice inválido de um array na linha: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro desconhecido na linha: " + e.getMessage());
            }
        }

        System.out.println("===============Parte 3===================");
        try {
            System.out.println(lerNumero());
        } catch (Exception e) {
            System.out.println("Erro ao ler um número na linha: " + e.getMessage());
        } finally {
            System.out.println("Fim do programa");
        }

        System.out.println("===============Parte 4===================");
        try {
            System.out.println(cadastrarNotas(-1, 2, 5));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

    static double lerNumero() throws Exception{
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        scanner.close();
        return numero;
    }

    static double cadastrarNotas(double n1, double n2, double n3) throws Exception {
        if (n1 < 0 || n1 > 10) {
            throw new Exception("Nota 1 inválida");
        }

        if (n2 < 0 || n2 > 10) {
            throw new Exception("Nota 2 inválida");
        }

        if (n3 < 0 || n3 > 10) {
            throw new Exception("Nota 3 inválida");
        }

        return (n1 + n2 + n3) / 3;
    }
}