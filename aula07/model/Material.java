package aula07.model;

public abstract class Material {

    protected String titulo;
    
    public Material() {
    }

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract void exibirDetalhes();
}