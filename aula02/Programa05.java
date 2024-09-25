public class Programa05 {
    public static void main(String[] args) {

        String[] nomes = new String[3]; // Array de strings com 3 posições
        nomes[0] = "Fulano";
        nomes[1] = "Ciclano";
        nomes[2] = "Beltrano";

        int[] idades = {10, 20, 30}; // Array de inteiros com 3 posições

        for (String nome: nomes) {
            System.out.println(nome);
        }

        for (int i: idades) {
            System.out.println(i);
        }

        int[] numeros = new int[10];

        for(int numero: numeros) {
            System.out.println(numero); // quando não atribuímos valor, o valor padrão é 0
        }

        
    }
}
