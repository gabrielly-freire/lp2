# Interface

## Abstract

- Uma classe abstrata não pode ser instanciada
- Pode conter métodos abstratos
- Métodos abstratos não possuem implementação
- Uma classe que contém métodos abstratos deve ser abstrata
- Uma classe abstrata pode conter métodos concretos

```java
public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();
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
