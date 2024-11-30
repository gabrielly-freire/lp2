package aula07.model;

public class Revista extends Material {

    private String editora;
    private Integer numeroPaginas;

    public Revista() {
        super();
    }

    public Revista(String titulo, String editora, Integer numeroPaginas) {
        super(titulo);
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Revista [titulo=" + titulo + ", editora=" + editora + ", numeroPaginas=" + numeroPaginas + "]";
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + this.titulo + " - Editora: " + this.editora + " - Número de páginas: " + this.numeroPaginas);
    }
}
