# Composição, herança e encapsulamento

## Encapsulamento

O encapsulamento é um pilar da orientação a objetos. Ele consiste em esconder a complexidade do usuário, a implementação pouco importa para o usuário, o que de fato importa é a finalidade daquele método. Por essa razão, se um método sofre modificações internas, não há alterações na sua chamada, o que é muito bom para a flexibilidade e manutenção. Além disso, o encapsulamento é responsável por impedir o acesso direto a algumas propriedades e métodos por meio dos modificadores de acesso.

### Modificadores de acesso

Existe 4 formas de controlar o acesso na linguagem Java.

|                                         | default | public | protected | private |
|-----------------------------------------|---------|--------|-----------|---------|
| Na mesma classe                         |   sim   |   sim  |    sim    |   sim   |
| Qualquer classe no mesmo pacote         |   sim   |   sim  |    sim    |   não   |
| Qualquer classe em pacote diferente     |   não   |   sim  |    não    |   não   |
| Qualquer sub-classe no mesmo pacote     |   sim   |   sim  |    sim    |   não   |
| Qualquer sub-classe em pacote diferente |   não   |   sim  |    sim    |   não   |

- default: as propriedades tem sua visibilidade default quando nenhuma outra é declarada. Ela tem acesso a tudo que está no mesmo pacote, mas não é acessível fora dele.
- public: as propriedades declaradas como public tem acesso livre a qualquer classe, independentemente do pacote.
- protected: as propriedades declaradas como protected têm acesso as classe do mesmo pacote e a todas sub-classes, mesmo que sejam em pacotes diferentes.
- private: as propriedades declaradas com private só são acessíveis na própria classe.

**Observação**: O termo "propriedade" refere-se a classes, atributos e métodos.

### Métodos getters e setters

Para impedir o acesso direto a atributos existe os métodos acesseadores os getters e setters. Isso é uma forma de encapsulamente, pois protege as propriedades.

O métodos getters servem para pegar o pripriedade enquanto os setters servem para fazer a atribuição da propriedade.

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {}

    public Pessoa(String nome; int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
```

## Modificador `static`

 O modificador static indica que a propriedade pertence à classe. Por exemplo, em um contexto de uma classe, digamos que queremos saber quantas vezes uma classe foi instanciada. Para isso, teremos um atributo `int contador` que será incrementado no construtor. Mas, se deixarmos assim, esse atributo não cumprirá sua missão, pois todas as classes que forem instanciadas terão um contador com o mesmo valor 1. Se esse atributo for declarado como `static`, ele não será um atributo inerente ao objeto, mas sim à classe, e assim funcionará como um contador de fato. Isso é importante para a economia de memória, uma vez que não estará presente em todos os objetos.

- Métodos `static` só podem serem chamados por outros métodos `static`;
- Não é possível sobrescrever um método estatico;
- Interessante usar para métodos utility e factory;

[Referência](https://codegym.cc/pt/groups/posts/pt.141.10-coisas-que-voce-precisa-saber-sobre-o-modificador-estatico-em-java)

## Herença

A ideia de herança na orientada objeto é muito semelhante a biologia. Uma super-classe transfere seus atribuitos e métodos para sub-classe. Vale mencionar que toda classe Java herda da super-classe Object.

Essa herança é demarcada pela palavra reservada `extends`. Segue o exemplo:

```java
public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String cpf;

    public Pessoa (){

    }

    public Pessoa(String nome, String endereco, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    //Getters e Setters ...
}

public class Aluno extends Pessoa{
    private String curso;
    private double[] notas;

    public Aluno(){
        super();
    }

    public Aluno(String nome, String endereco, String cpf, String curso, double[] notas){
        super(nome, endereco, cpf);
        this.curso = curso;
        this.notas = notas;
    }

    //Getters e Setters ...

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return false;
    }
}

public class Professor extends Pessoa{
    private String departamento;
    private String nomeCurso;
    private double salario;

    public Professor(){
        super();
    }

    public Professor(String nome, String endereco, String cpf, String departamento, String nomeCurso, double salario){
        super(nome, endereco, cpf);
        this.departamento = departamento;
        this.nomeCurso = nomeCurso;
        this.salario = salario;
    }

    // Getters e Setters

    public double calcularSalarioLiquido(){
        return 0;
    }
}

```

O super é usado para referenciar a super-classe

A herança é um tipo de relacionamento "é uma". Um Professor É UMA Pessoa.

## Herança e Polimorfismo

### Polimorfismo em tempo de execução

O polimorfismo em tempo de execução, também conhecido como sobrescrita de métodos, permite que as classes filhas forneçam suas próprias implementações para os métodos herdados das classes pai. Isso significa que um objeto de uma classe filha pode ser tratado como um objeto da classe pai, mas seu comportamento específico será exibido durante a execução do programa.

 ```java
 class Animal {
    public void makeSound() {
        System.out.println("O animal faz um som.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("O cachorro late.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("O gato mia.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.makeSound(); // O cachorro late.

        Animal animal2 = new Cat();
        animal2.makeSound(); // O gato mia.
    }
}
```

### Polimorfismo em tempo de compilação

O polimorfismo em tempo de compilação, também conhecido como sobrecarga de métodos e construtores, permite que uma classe tenha múltiplos métodos ou construtores com o mesmo nome, mas com assinaturas diferentes. O compilador determina qual método ou construtor deve ser chamado com base nos argumentos fornecidos no ponto de chamada.

```java
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));
        System.out.println(calc.add(2.5, 3.7));
        System.out.println(calc.add(4, 6, 2)); 
    }
}
```

## Modificador `abstract`

Abstrato, como o próprio nome já diz, não é concreto. Traduzindo para o mundo da programação, uma classe abstrata não possui implementação e serve de base para outras classes.

### Classes abstratas

Classes abstratas não podem ser instanciadas diretamente, mas sim estendidas. Elas servem como base para a criação de classes concretas.

#### Caracteristicas

- Não instanciáveis: Não é possível criar uma instância usando o operador `new`.
- Métodos abstratos - podem conter métodos abstratos (sem implementação)
- Métodos concretos - podem conter métodos concretos (com implementação)

### Métodos abstratos

Quando um método é declarado como abstrato, ele não possui uma implementação, assim, é declarada apenas a assinatura do método. Quando uma classe é estendida, as classes filhas têm a obrigação de implementá-los.

```java
abstract class Animal {
    // Método abstrato
    public abstract void makeSound();

    // Método concreto
    public void eat() {
        System.out.println("O animal está comendo.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("O cachorro late.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("O gato mia.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // O cachorro late.
        dog.eat();       // O animal está comendo.

        Animal cat = new Cat();
        cat.makeSound(); // O gato mia.
        cat.eat();       // O animal está comendo.
    }
}
```

## Modificador `final`

Uma classe com esse modificador não pode ser estendido.

Usado para criação de constante, pois é imutavel. Uma boa prática é escrever a constante com letras maiusculas e separado por underscore. Geralmente constantes são `static` também.

## Composição
