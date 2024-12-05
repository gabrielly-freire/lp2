package model;

import java.time.LocalDate;

import model.enums.Genero;

/**
 * Classe abstrata para representar um funcionário.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public abstract class Funcionario extends Pessoa {

    private Long matricula;
    private Double salario;
    private String departamento;
    private String cargaHoraria;
    private LocalDate dataIngresso;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, LocalDate dataNascimento, Genero genero, Endereco endereco,
            Long matricula, String departamento, String cargaHoraria, LocalDate dataIngresso) {
        super(nome, cpf, dataNascimento, genero, endereco);
        this.matricula = matricula;
        this.departamento = departamento;
        this.cargaHoraria = cargaHoraria;
        this.dataIngresso = dataIngresso;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public abstract Double calcularSalario();

    @Override
    public String toString() {
        return "Funcionario [matricula=" + matricula + ", salario=" + salario + ", departamento=" + departamento
                + ", cargaHoraria=" + cargaHoraria + ", dataIngresso=" + dataIngresso + super.toString() + "]";
    }
}
