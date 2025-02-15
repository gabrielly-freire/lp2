package model.conta;

public class Corrente implements Conta {

    private double saldo;

    public Corrente() {
    }

    public Corrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = valor;
            System.out.println("Deposito realizado com sucesso...");
        } else {
            System.out.println("Deposito não realizado...");
        }
    }

    @Override
    public void sacar(double valor) {
        double valorFinal = valor * TAXA;
        if (this.saldo >= valorFinal) {
            this.saldo -= valorFinal;
            System.out.println("Saque realizado com sucesso...");
        } else {
            System.out.println("Saque não realizado...");
        }
    }

    @Override
    public void verSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

}
