package model.pessoa;

import model.conta.Corrente;
import model.conta.Poupanca;

public abstract class Pessoa {

  private String nome;
  private Corrente contaCorrente;
  private Poupanca contaPoupanca;

  public Pessoa() {
  }

  public Pessoa(String nome, Corrente contaCorrente, Poupanca contaPoupanca) {
    this.nome = nome;
    this.contaCorrente = contaCorrente;
    this.contaPoupanca = contaPoupanca;
  }

  public Pessoa(String nome) {
    this.nome = nome;
    this.contaCorrente = new Corrente();
    this.contaPoupanca = new Poupanca();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Corrente getContaCorrente() {
    return contaCorrente;
  }

  public void setContaCorrente(Corrente contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  public Poupanca getContaPoupanca() {
    return contaPoupanca;
  }

  public void setContaPoupanca(Poupanca contaPoupanca) {
    this.contaPoupanca = contaPoupanca;
  }

  @Override
  public String toString() {
    return "Pessoa [nome=" + nome + ", contaCorrente=" + contaCorrente + ", contaPoupanca=" + contaPoupanca + "]";
  }

}
