# Classe e Objeto

## Classe

É a definição de uma entidade onde essa entidade tem características e pode executar ações.

### Atribitos

Os atributos são as características de uma entidade. Geralmente, são substantivos ou adjetivos.

### Métodos

Os métodos são comportamentos e ações que uma entidade pode executar. Como boa prática, os métodos são verbos.

```java
public class Carro {
    // atributos
    String marca;
    String modelo;
    int capacidadePassageiros;
    double capacidadeCombustivel;
    double consumoCombustivelPorKm;

    // construtor padrão
    Carro(){}

    // construtor parametrizado
    Carro(String marca, String modelo, int capacidadePassageiros, double capacidadeCombustivel, double consumoCombustivelPorKm){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivelPorKm = consumoCombustivelPorKm;
    }

    // métodos
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é " + capacidadeCombustivel/consumoCombustivelPorKm + " km");
    }

    double obterAutonomia(){
        return capacidadeCombustivel / consumoCombustivelPorKm;
    }

    double calcularCombustivel(double km){
        return km * consumoCombustivelPorKm;
    }
}
```

- O construtor é um método espacial que possue o mesmo nome do classe e tem o objetivo de construir o objeto.
- A palavra reservada `this` tem o objeto de fazer referência as propriedades que são da classe, sejam atributos ou método. No contexto do construtor, o `this` é usado para remover a ambiguidade entre variaveis.

## Objeto

Um objeto é uma instância de uma classe.

```java

public class TesteCarro {

 public static void main(String[] args) {
  
  // criando o objeto usando o construtor padrão e depois setando os atributos
  Carro van = new Carro();
  van.marca = "Fiat";
  van.modelo = "Ducato";
  van.capacidadePassageiros = 10;
  van.capacidadeCombustivel = 100;
  van.consumoCombustivelPorKm = 0.2;
  
  System.out.println(van.marca);
  System.out.println(van.modelo);
  
  // criando o objeto usando o construtor parametrizado
  Carro fusca = new Carro("Volkswagen", "Fusca", 5, 30, 0.15);
  System.out.println(fusca.marca);
  System.out.println(fusca.modelo);
 }
}

```

Importante fazer essa distinção entre classe e objeto. A classe é o molde para criar o objeto, mas não é o objeto em si.
