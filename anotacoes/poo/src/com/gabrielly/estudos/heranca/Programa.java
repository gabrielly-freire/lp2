package com.gabrielly.estudos.heranca;

public class Programa {

   public static void main(String[] args) {
        //polimorfismo nutella - só vai ter os atributos de pessoa
        Pessoa professor01 = new Professor();
        // professor01.getSalario();

        Professor professor02 = new Professor();
        professor02.getCpf();

        Aluno aluno = new Aluno(); 
   }   
}
