import java.util.Scanner;

public class Program03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leia.nextLine();

        System.out.printf("Hello, %s!\n", nome);
    }
}
