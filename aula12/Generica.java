package aula12;

public class Generica <T> {
    T valor;
    
    public Generica(T valor) {
        this.valor = valor;
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
}
