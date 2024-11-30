package aula12;
public class Main3 {
   public static void main(String[] args) {
    // @MinhaAnotacao(nome = "João", cpf = "123.456.789-00", email = "teste")
    Generica<String> generica = new Generica<>(" ");

    System.out.println(generica.getValor());
   } 
}
