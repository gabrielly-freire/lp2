package br.imd.model;

import java.time.LocalDate;

public class Aluno {
    String nome;
    String matricula;
    LocalDate dataNascimento;
    String curso;
    boolean alunoEAD;
    boolean pcd;
    Genero genero;

    public Aluno(){}
    
    public Aluno(String nome, String matricula, LocalDate dataNascimento, String curso, boolean alunoEAD, boolean pcd,
            Genero genero) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
        this.alunoEAD = alunoEAD;
        this.pcd = pcd;
        this.genero = genero;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public boolean isAlunoEAD() {
        return alunoEAD;
    }
    public void setAlunoEAD(boolean alunoEAD) {
        this.alunoEAD = alunoEAD;
    }
    public boolean isPcd() {
        return pcd;
    }
    public void setPcd(boolean pcd) {
        this.pcd = pcd;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
