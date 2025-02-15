package com.gabrielly.estudos.estaticos;

public class CalculadoraTeste {
    public static void main(String[] args) {

        System.out.println(Calculadora.soma(1, 5, 7));
        // exibirSaudacao("Gabrielly");
    }

    public void exibirSaudacao(String nome){
        System.out.printf("Olá %s", nome);
    }
}
