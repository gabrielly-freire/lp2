package model;

import java.time.LocalDate;
import java.util.List;

import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;

/**
 * Classe para representar um professor.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public class Professor extends Funcionario {

    private Nivel nivel;
    private Formacao formacao;
    private List<String> disciplinas;
    private final Double SALARIO_BASE = 4000.0;

    public Professor() {
    }

    public Professor(Nivel nivel, Formacao formacao, List<String> disciplinas) {
        this.nivel = nivel;
        this.formacao = formacao;
        this.disciplinas = disciplinas;
    }

    public Professor(String nome, String cpf, LocalDate dataNascimento, Genero genero, Endereco endereco,
            Long matricula, String departamento, String cargaHoraria, LocalDate dataIngresso,
            Nivel nivel, Formacao formacao, List<String> disciplinas) {
        super(nome, cpf, dataNascimento, genero, endereco, matricula, departamento, cargaHoraria,
                dataIngresso);
        this.nivel = nivel;
        this.formacao = formacao;
        this.disciplinas = disciplinas;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public Double calcularSalario() {
        Double salario = SALARIO_BASE;
        switch (formacao) {
            case ESPECIALIZACAO:
                salario += 0.25 * salario;
                break;
            case MESTRADO:
                salario += 0.5 * salario;
                break;
            case DOUTORADO:
                salario += 0.75 * salario;
                break;
            default:
                break;
        }

        int nivelInt = nivel.ordinal();
        if (nivelInt > 0) {
            salario += SALARIO_BASE * Math.pow(0.05, nivelInt);
        }

        super.setSalario(salario);

        return salario;
    }

    // @Override
    // public String toString() {
    //     return "Professor [nivel=" + nivel + ", formacao=" + formacao + ", disciplinas=" + disciplinas
    //             + ", SALARIO_BASE=" + SALARIO_BASE + super.toString() + "]";
    // }

    @Override
    public String toString() {
        return "Professor - [Nome: " + getNome() +
                ", Matrícula: " + getMatricula() +
                ", Salário: " + String.format("%.2f", getSalario()) +
                ", Disciplinas: " + String.join(", ", disciplinas) +
                ", Nível: " + nivel +
                ", Formação: " + formacao + "]";
    }
}
