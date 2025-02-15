package model.conta;

public interface Conta {

    public final double TAXA = 1.25;


    public void depositar(double valor);
    public void sacar(double valor);
    public void verSaldo();

}