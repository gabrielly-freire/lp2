package com.gabrielly.estudos.heranca;

public class Professor extends Pessoa{
    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor() {
    
    }

    public Professor(String nome, String endereco, String cpf, String departamento, String nomeCurso, double salario) {
        super(nome, endereco, cpf);
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", departamento=" + departamento + ", endereco=" + endereco + ", nomeCurso="
                + nomeCurso + ", cpf=" + cpf + ", salario=" + salario + "]";
    }
}
