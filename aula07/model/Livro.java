package aula07.model;

public class Livro extends Material {

    private String autor;
    private Integer anoLancamento;
    private String edicao;

    public Livro() {
        super();
    }

    public Livro(String titulo, String autor, Integer anoLancamento, String edicao) {
        super(titulo);
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.edicao = edicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoLancamento=" + anoLancamento + ", edicao="
                + edicao + "]";
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + super.titulo + " - Autor: " + this.autor + " - Ano de lançamento: " + this.anoLancamento + " - Edição: " + this.edicao);
    }
}