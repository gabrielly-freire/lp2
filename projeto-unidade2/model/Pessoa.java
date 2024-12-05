package model;

import java.io.Serializable;
import java.time.LocalDate;

import model.enums.Genero;

/**
 * Classe abstrata para representar uma pessoa.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public abstract class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Genero genero;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, LocalDate dataNascimento, Genero genero, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", genero=" + genero
                + ", endereco=" + endereco + "]";
    }
}
