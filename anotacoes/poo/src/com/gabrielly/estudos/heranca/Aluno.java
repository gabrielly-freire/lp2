package com.gabrielly.estudos.heranca;

import java.util.Arrays;

public class Aluno extends Pessoa{
    private String curso;
    private double[] notas;
    
    public Aluno() {
    }

    public Aluno(String nome, String endereco, String cpf, String curso, double[] notas) {
        super(nome, endereco, cpf);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", curso=" + curso + ", endereco=" + endereco + ", notas="
                + Arrays.toString(notas) + ", cpf=" + cpf + "]";
    } 
    
}
