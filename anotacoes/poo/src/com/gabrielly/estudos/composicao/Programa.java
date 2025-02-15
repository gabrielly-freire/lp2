public class Programa {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua 1", "123", "Casa 1", "12345678", "Cidade 1", "Estado 1");

        Contato contato = new Contato("Gabrielly", endereco, "123456789");
        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        System.out.println(contato.getTelefone());
    }
}
