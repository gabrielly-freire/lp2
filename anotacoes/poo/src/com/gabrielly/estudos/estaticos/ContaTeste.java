package com.gabrielly.estudos.estaticos;

public class ContaTeste {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Maria", "1234-5", "123-0");
        Conta conta2 = new Conta("Joao", "1234-5", "123-0");

        System.out.println(conta1.toString());
        System.out.println(conta1.getCount());
        System.out.println(conta2.toString());
        System.out.println(conta2.getCount());
        System.out.println(conta1.getCount());

        // count - não increnta com base no valor anterior
    }
}
