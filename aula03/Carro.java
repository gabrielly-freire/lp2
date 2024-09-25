package aula03;

public class Carro {
    
    String cor;
    String marca;
    String modelo;
    int anoDeFabricacao;
    int numeroDePortas;
    int consumoDeCombustivel;
    double preco;
    boolean isLigado;

    Carro() {

    }

    Carro(String cor, String marca, String modelo, int anoDeFabricacao, int numeroDePortas, int consumoDeCombustivel, double preco) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.numeroDePortas = numeroDePortas;
        this.consumoDeCombustivel = consumoDeCombustivel;
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getConsumoDeCombustivel() {
        return consumoDeCombustivel;
    }

    public void setConsumoDeCombustivel(int consumoDeCombustivel) {
        this.consumoDeCombustivel = consumoDeCombustivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }

    boolean ligar() {
        isLigado = true;
        return isLigado;
    }

    boolean desligar() {
        isLigado = false;
        return isLigado;
    }

    void acelerar() {
        System.out.println("Acelerando...");
    }
}
