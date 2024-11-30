public class Varargs {
    public static void main(String[] args) {
        System.out.println(soma(1, 2, 3, 4, 5));
    }

    /**
     * Varargs - método que recebe uma quantidade variável de argumentos
     * @param numeros
     * @return
     */
    public static int soma(Integer... numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}
