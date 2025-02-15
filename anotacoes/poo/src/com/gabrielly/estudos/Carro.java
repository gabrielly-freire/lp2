package com.gabrielly.estudos;

public class Carro {
    // atributos
    private String marca;
    private String modelo;
    private int capacidadePassageiros;
    private double capacidadeCombustivel;
    private double consumoCombustivelPorKm;

    // construtor padrão
    public Carro(){}

    // construtor parametrizado
    public Carro(String marca, String modelo, int capacidadePassageiros, double capacidadeCombustivel, double consumoCombustivelPorKm){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivelPorKm = consumoCombustivelPorKm;
    }

    // método acessadores
    
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

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getConsumoCombustivelPorKm() {
        return consumoCombustivelPorKm;
    }

    public void setConsumoCombustivelPorKm(double consumoCombustivelPorKm) {
        this.consumoCombustivelPorKm = consumoCombustivelPorKm;
    }

    //métodos

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é " + capacidadeCombustivel*consumoCombustivelPorKm + " km");
    }

    double obterAutonomia(){
        return capacidadeCombustivel * consumoCombustivelPorKm;
    }

    double calcularCombustivel(double km){
        return km/consumoCombustivelPorKm;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
