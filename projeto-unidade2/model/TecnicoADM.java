package model;

import java.time.LocalDate;

import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;

/**
 * Classe para representar um técnico administrativo.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public class TecnicoADM extends Funcionario {

    private Nivel nivel;
    private Formacao formacao;
    private Boolean isInsalubridade;
    private Boolean isFuncaoGratificada;
    private final Double SALARIO_BASE = 2500.0;

    public TecnicoADM() {
        super();
    }

    public TecnicoADM(Nivel nivel, Formacao formacao, Boolean isInsalubridade, Boolean isFuncaoGratificada) {
        this.nivel = nivel;
        this.formacao = formacao;
        this.isInsalubridade = isInsalubridade;
        this.isFuncaoGratificada = isFuncaoGratificada;
    }

    public TecnicoADM(String nome, String cpf, LocalDate dataNascimento, Genero genero, Endereco endereco,
            Long matricula, String departamento, String cargaHoraria, LocalDate dataIngresso,
            Nivel nivel, Formacao formacao, Boolean isInsalubridade, Boolean isFuncaoGratificada) {
        super(nome, cpf, dataNascimento, genero, endereco, matricula, departamento, cargaHoraria,
                dataIngresso);
        this.nivel = nivel;
        this.formacao = formacao;
        this.isInsalubridade = isInsalubridade;
        this.isFuncaoGratificada = isFuncaoGratificada;
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

    public Boolean getIsInsalubridade() {
        return isInsalubridade;
    }

    public void setIsInsalubridade(Boolean isInsalubridade) {
        this.isInsalubridade = isInsalubridade;
    }

    public Boolean getIsFuncaoGratificada() {
        return isFuncaoGratificada;
    }

    public void setIsFuncaoGratificada(Boolean isFuncaoGratificada) {
        this.isFuncaoGratificada = isFuncaoGratificada;
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
            salario += SALARIO_BASE * Math.pow(0.03, nivelInt);
        }

        if (isInsalubridade) {
            salario += SALARIO_BASE*0.5;
        }

        if (isFuncaoGratificada) {
            salario += SALARIO_BASE*0.5;
        }

        super.setSalario(salario);
        return salario;
    }

    // @Override
    // public String toString() {
    //     return "TecnicoADM [nivel=" + nivel + ", formacao=" + formacao + ", isInsalubridade=" + isInsalubridade
    //             + ", isFuncaoGratificada=" + isFuncaoGratificada + ", SALARIO_BASE=" + SALARIO_BASE + super.toString() + "]";
    // }

    @Override
    public String toString() {
        return "Técnico ADM - [Nome: " + getNome() +
                ", Matrícula: " + getMatricula() +
                ", Salário: " + String.format("%.2f", getSalario()) +
                ", Nível: " + nivel +
                ", Formação: " + formacao + "]";
    }   
}
