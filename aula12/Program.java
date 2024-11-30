package aula12;

public class Program {
    public static void main(String[] args) {
        Externa external = new Externa();
        Externa.Interna internal = external.new Interna();

        internal.imprimeTexto();
    }
}
