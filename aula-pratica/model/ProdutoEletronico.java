package model;

import java.time.LocalDate;

import model.enums.Categoria;

public class ProdutoEletronico extends Produto {
    private LocalDate garantia;
    private String marca;
    
    public ProdutoEletronico() {
        super();
    }

    public ProdutoEletronico(String nome, Double preco, Categoria categoria, LocalDate garantia, String marca) {
        super(nome, preco, categoria);
        this.garantia = garantia;
        this.marca = marca;
    }

    public LocalDate getGarantia() {
        return garantia;
    }

    public void setGarantia(LocalDate garantia) {
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ProdutoEletronico [garantia=" + garantia + ", marca=" + marca + "]";
    }

}
