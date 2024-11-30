
class Pessoa {
    String nome;
    String cpf;

    public static void falar(){
        System.out.println("Pessoa falando...");
    }

    // bloco de código estático
    static {
        String nome = "João";
    }
}

class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "João";
        p.cpf = "123.456.789-00";
        // p.falar();

        Pessoa.falar();
        
    }
}