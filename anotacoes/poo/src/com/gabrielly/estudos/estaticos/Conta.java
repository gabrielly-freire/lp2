package com.gabrielly.estudos.estaticos;

public class Conta {
    private String nomeCliente;
    private String numeroDaConta;
    private String agenciaBancaria;
    private int count;
    
    public Conta() {
        count++;
    }
    
    public Conta(String nomeCliente, String numeroDaConta, String agenciaBancaria) {
        this.nomeCliente = nomeCliente;
        this.numeroDaConta = numeroDaConta;
        this.agenciaBancaria = agenciaBancaria;
        count++;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getAgenciaBancaria() {
        return agenciaBancaria;
    }
    
    public void setAgenciaBancaria(String agenciaBancaria) {
        this.agenciaBancaria = agenciaBancaria;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Conta [nomeCliente=" + nomeCliente + ", numeroDaConta=" + numeroDaConta + ", agenciaBancaria="
                + agenciaBancaria + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
        result = prime * result + ((numeroDaConta == null) ? 0 : numeroDaConta.hashCode());
        result = prime * result + ((agenciaBancaria == null) ? 0 : agenciaBancaria.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (nomeCliente == null) {
            if (other.nomeCliente != null)
                return false;
        } else if (!nomeCliente.equals(other.nomeCliente))
            return false;
        if (numeroDaConta == null) {
            if (other.numeroDaConta != null)
                return false;
        } else if (!numeroDaConta.equals(other.numeroDaConta))
            return false;
        if (agenciaBancaria == null) {
            if (other.agenciaBancaria != null)
                return false;
        } else if (!agenciaBancaria.equals(other.agenciaBancaria))
            return false;
        return true;
    }

}
