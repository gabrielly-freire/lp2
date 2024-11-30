package aula12;

public class Externa {
    String texto = "Externa";

    public class Interna {
        String texto = "Interna";

        public void imprimeTexto() {
            System.out.println(this.texto);
            System.out.println(Externa.this.texto);
        }
    }
}
