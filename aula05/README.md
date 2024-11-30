# Aula 05 - static, visibilidade, sobrescrita, sobrecarga e herança

## Static

- usando para atributos e métodos que são da classe e não do objeto

Também é possível usar um bloco estático para inicializar atributos estáticos

```java
public class Carro {
    private String marca;
    private String modelo;
    private static int quantidadeDeCarros;

    static {
        quantidadeDeCarros = 0;
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        quantidadeDeCarros++;
    }
}
```

## Visibilidade

- public - todos podem acessar
- private - apenas na própria classe
- protected - na própria classe, nas subclasses e no mesmo pacote

## Override

Para sobrescrever métodos de uma superclasse, é necessário usar a anotação `@Override`

```java
public class Animal {
    public void emitirSom() {
        System.out.println("Som do animal");
    }
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
```

## Overload

É uma sobrecarga de métodos, ou seja, métodos com o mesmo nome, mas com parâmetros diferentes

```java
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}
```

## Herança

- Permite a reutilização de código
- Uma classe pode herdar atributos e métodos de outra classe
- A classe que herda é chamada de subclasse ou classe filha
- A classe que é herdada é chamada de superclasse ou classe pai
- A subclasse pode acessar os atributos e métodos da superclasse
- A superclasse não pode acessar os atributos e métodos da subclasse

```java
public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Som do animal");
    }
}

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
```
