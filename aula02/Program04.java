import java.util.ArrayList;

public class Program04 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");

        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}
