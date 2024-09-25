package aula03;

import java.util.List;

public class Aluno {

    private String nome;
    private String matricula;
    private String dataNascimento;
    private String curso;
    private List<String> disciplinas;
    private int periodo;
    private String statusDiscente;

    public Aluno() {

    }

    public Aluno(String nome, String matricula, String dataNascimento, String curso, List<String> disciplinas, int periodo, String statusDiscente) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.periodo = periodo;
        this.statusDiscente = statusDiscente;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getStatusDiscente() {
        return statusDiscente;
    }

    public void setStatusDiscente(String statusDiscente) {
        this.statusDiscente = statusDiscente;
    }

    public void matricularEmDisciplina(String disciplina) {
        this.disciplinas.add(disciplina);
        System.out.println("Disciplina matriculada com sucesso!");
    }

    public void trancarDisciplina(String disciplina) {
        this.disciplinas.remove(disciplina);
        System.out.println("Disciplina trancada com sucesso!");
    }

    public void mudarStatus(String status) {
        this.statusDiscente = status;
        System.out.println("Status alterado com sucesso!");
    }

    public String toString(){
        return "Nome: " + this.nome + "\nMatrícula: " + this.matricula + "\nData de Nascimento: " + this.dataNascimento + "\nCurso: " + this.curso + "\nDisciplinas: " + this.disciplinas + "\nPeríodo: " + this.periodo + "\nStatus Discente: " + this.statusDiscente;
    }
}
