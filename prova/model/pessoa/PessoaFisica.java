package model.pessoa;

import model.conta.Corrente;
import model.conta.Poupanca;

public class PessoaFisica extends Pessoa {

      private String cpf;
      private String dataNascimento;

      public PessoaFisica() {
            super();
      }

      public PessoaFisica(String nome, Corrente contaCorrente, Poupanca contaPoupanca, String cpf,
                  String dataNascimento) {
            super(nome, contaCorrente, contaPoupanca);
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
      }

      public PessoaFisica(String nome, String cpf, String dataNascimento) {
            super(nome);
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
      }

      public String getCpf() {
            return cpf;
      }

      public void setCpf(String cpf) {
            this.cpf = cpf;
      }

      public String getDataNascimento() {
            return dataNascimento;
      }

      public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
      }

      @Override
      public String toString() {
            return "PessoaFisica [cpf=" + cpf + ", dataNascimento=" + dataNascimento + "]";
      }

} 
