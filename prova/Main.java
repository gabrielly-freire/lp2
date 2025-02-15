import utils.BankFunctions;

//Essa classe deve funcionar após a conclusão da tarefa. Não modifique seu conteúdo
public class Main {
    public static void main(String[] args) {

        System.out.println("\n########################## PARTE 01 ##########################");
        // Cadastro de novos CLientes
        BankFunctions.cadastrarClientePF("Francisco de Souza", "111.222.333-44", "10/10/1987");
        BankFunctions.cadastrarClientePF("Pedro de Albuquerque", "123.456.789-10", "25/12/1996");
        BankFunctions.cadastrarClientePF("Maximus Decimus Meridius", "999.777.555-33", "12/07/1999");
        BankFunctions.cadastrarClientePF("Lúcio Aurélio Cómodo", "888.666.444-22", "14/05/0050");

        System.out.println("\n########################## PARTE 02 ##########################");
        // Depositar na conta corrente de clientes
        BankFunctions.depositarCC(1000, "111.222.333-44"); // Cliente Francisco
        BankFunctions.depositarCC(0, "123.456.789-10"); // Cliente Pedro

        System.out.println("\n########################## PARTE 03 ##########################");
        // Sacar e ver saldo na conta poupanca de clientes
        BankFunctions.verSaldoCC("111.222.333-44"); // Francisco tem 1000
        BankFunctions.sacarCC(500, "111.222.333-44");
        BankFunctions.verSaldoCC("111.222.333-44");
        BankFunctions.sacarCC(1000, "111.222.333-44");
        BankFunctions.verSaldoCC("111.222.333-44");

        System.out.println("\n########################## PARTE 04 ##########################");
        // Depositar na conta poupança de clientes
        BankFunctions.depositarCP(1000, "111.222.333-44"); // Cliente Francisco
        BankFunctions.depositarCP(0, "123.456.789-10"); // Cliente Pedro

        System.out.println("\n########################## PARTE 05 ##########################");
        // Sacar e ver saldo na conta poupança de clientes
        BankFunctions.verSaldoCP("111.222.333-44");
        BankFunctions.sacarCP(500, "111.222.333-44");
        BankFunctions.verSaldoCP("111.222.333-44");
        BankFunctions.sacarCP(1000, "111.222.333-44");
        BankFunctions.verSaldoCP("111.222.333-44");

        System.out.println("\n########################## PARTE 06 ##########################");
        // Excluir uma pessoa e tentar depositar na conta dela
        BankFunctions.removerClientePF("111.222.333-44"); // Cliente Francisco
        BankFunctions.depositarCC(1000, "111.222.333-44"); // Cliente Francisco

    }

}
