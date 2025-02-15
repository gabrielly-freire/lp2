package utils;

import java.util.ArrayList;

import DAO.BancoDAO;
import model.conta.Corrente;
import model.conta.Poupanca;
import model.pessoa.Pessoa;
import model.pessoa.PessoaFisica;

public class BankFunctions {

    public static void cadastrarClientePF(String nome, String cpf, String dataNascimento) {
        PessoaFisica pessoa = new PessoaFisica(nome, cpf, dataNascimento);
        BancoDAO.getIntance().getArrayPessoas().add(pessoa);

        System.out.printf("Cliente %s cadastrado com sucesso!\n", pessoa.getNome());

    }

    public static void depositarCC(int valor, String cpf) {
        ArrayList<Pessoa> clientes = BancoDAO.getIntance().getArrayPessoas();

        for (Pessoa cliente : clientes) {
            if (cliente instanceof PessoaFisica) {
                PessoaFisica clientePF = (PessoaFisica) cliente;
                if (clientePF.getCpf().equals(cpf)) {
                    Corrente contaCorrente = clientePF.getContaCorrente();
                    contaCorrente.depositar(valor);
                    return;
                }
            }
        }

        System.out.println("Cliente não encontrado!");
    }

    public static void verSaldoCC(String cpf) {
        ArrayList<Pessoa> clientes = BancoDAO.getIntance().getArrayPessoas();

        for (Pessoa cliente : clientes) {
            if (cliente instanceof PessoaFisica) {
                PessoaFisica clientePF = (PessoaFisica) cliente;
                if (clientePF.getCpf().equals(cpf)) {
                    Corrente contaCorrente = clientePF.getContaCorrente();
                    contaCorrente.verSaldo();
                    ;
                    return;
                }
            }
        }

        System.out.println("Cliente não encontrado!");
    }

    public static void sacarCC(int valor, String cpf) {
        ArrayList<Pessoa> clientes = BancoDAO.getIntance().getArrayPessoas();

        for (Pessoa cliente : clientes) {
            if (cliente instanceof PessoaFisica) {
                PessoaFisica clientePF = (PessoaFisica) cliente;
                if (clientePF.getCpf().equals(cpf)) {
                    Corrente contaCorrente = clientePF.getContaCorrente();
                    contaCorrente.sacar(valor);
                    return;
                }
            }
        }

        System.out.println("Cliente não encontrado!");
    }

    public static void depositarCP(int valor, String cpf) {
        ArrayList<Pessoa> clientes = BancoDAO.getIntance().getArrayPessoas();

        for (Pessoa cliente : clientes) {
            if (cliente instanceof PessoaFisica) {
                PessoaFisica clientePF = (PessoaFisica) cliente;
                if (clientePF.getCpf().equals(cpf)) {
                    Poupanca contaPonpanca = clientePF.getContaPoupanca();
                    contaPonpanca.depositar(valor);
                    return;
                }
            }
        }

        System.out.println("Cliente não encontrado!");
    }

    public static void sacarCP(int valor, String cpf) {
        ArrayList<Pessoa> clientes = BancoDAO.getIntance().getArrayPessoas();

        for (Pessoa cliente : clientes) {
            if (cliente instanceof PessoaFisica) {
                PessoaFisica clientePF = (PessoaFisica) cliente;
                if (clientePF.getCpf().equals(cpf)) {
                    Poupanca contaPonpanca = clientePF.getContaPoupanca();
                    contaPonpanca.sacar(valor);
                    return;
                }
            }
        }

        System.out.println("Cliente não encontrado!");
    }

    public static void verSaldoCP(String cpf) {
        ArrayList<Pessoa> clientes = BancoDAO.getIntance().getArrayPessoas();

        for (Pessoa cliente : clientes) {
            if (cliente instanceof PessoaFisica) {
                PessoaFisica clientePF = (PessoaFisica) cliente;
                if (clientePF.getCpf().equals(cpf)) {
                    Poupanca contaPonpanca = clientePF.getContaPoupanca();
                    contaPonpanca.verSaldo();
                    return;
                }
            }
        }

        System.out.println("Cliente não encontrado!");
    }

    public static void removerClientePF(String cpf) {
        ArrayList<Pessoa> clientes = BancoDAO.getIntance().getArrayPessoas();

        for (Pessoa cliente : clientes) {
            if (cliente instanceof PessoaFisica) {
                PessoaFisica clientePF = (PessoaFisica) cliente;
                if (clientePF.getCpf().equals(cpf)) {
                    clientes.remove(cliente);
                    System.out.println("Cliente removido com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Cliente não encontrado!");
    }

    public Pessoa buscarPessoa(String cpf) {
        ArrayList<Pessoa> clientes = BancoDAO.getIntance().getArrayPessoas();

        for (Pessoa cliente : clientes) {
            if (cliente instanceof PessoaFisica) {
                PessoaFisica clientePF = (PessoaFisica) cliente;
                if (clientePF.getCpf().equals(cpf)) {
                    System.out.println("Pessoa localizada com sucesso!\n" + cliente.toString());
                    return cliente;
                }
            }
        }

        System.out.println("Pessoa não encontrada!");

        return null;
    }
}

/*
 * 
 * ATRIBUTOS
 * banco: BancoDAO (Use a instância do BancoDAO)
 * 
 * MÉTODOS
 * cadastrarClientePF(String nome, String cpf, String dataNascimento)
 * removerClientePF(String cpf)
 * depositarCC(double valor, String cpf)
 * sacarCC(double valor, String cpf)
 * depositarCP(double valor, String cpf)
 * sacarCP(double valor, String cpf)
 * verSaldoCC(String cpf)
 * verSaldoCP(String cpf)
 * buscarPessoa(String cpf) - retorna a pessoa buscada
 */
