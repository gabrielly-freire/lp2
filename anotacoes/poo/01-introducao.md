# Introdução à Orientação a Objetos

A Programação Orientada a Objetos (POO) é uma forma de resolver problemas baseada na representação de objetos do mundo real, levando em consideração suas características e comportamentos. Esse paradigma é muito importante, pois modela o mundo real para a resolução de problemas.

## Paradigma Estruturado vs Paradigma Orientado a Objetos

### Estruturado

O paradigma estruturado é um modo de programar que divide problemas em partes menores de forma sequencial. Sua base é:

- **Sequencialidade**: Fluxo de execução linear, onde as instruções seguem uma ordem definida de execução.
- **Funções**: Uso de funções para organizar o código.
- **Controle de fluxo**: Uso de estruturas condicionais e loops para controlar a execução do programa.

Essa abordagem é eficaz para resolver problemas simples, mas pode se tornar complexa e difícil de gerenciar em sistemas maiores.

### Orientação a Objetos

Já o paradigma orientado a objetos segue uma filosofia diferente. Sua base é:

- **Abstração**: A abstração envolve focar no que é importante em um determinado contexto e modelar para resolver um problema. Por exemplo, imagine um gato: em um sistema veterinário, ele terá características e comportamentos importantes para aquele contexto, enquanto em um sistema de adoção, as características e comportamentos relevantes serão outros. Não faz sentido incluir todas as característica de um gato em um sistema, a quantidade de pelos, por exemplo, não é importante em nenhum dos dois casos.
- **Classe**: As classes são representações dos objetos, elas funcionam como um molde que será usado para construir o objeto. Uma classe tem:
  - **Atributos**: características, adjetivos;
  - **Método**: comportamentos, ações;
- **Objeto**: Um objeto é uma instância de uma classe, ou seja, a construção do objeto com suas características e comportamentos próprios.
- **Encapsulamento**: O encapsulamento refere-se a "esconder" alguns detalhes, como certas atributos que não podem ser acessadas diretamente, ou a implementação de um método que é irrelevante para o usuário. O importante para o usuário é o comportamento do método, não como ele é implementado.
- **Herança**: A herança é semelhante à biologia: "Nós herdamos características de nossos pais". Na programação, existe uma classe-mãe (superclasse) que transmite suas atributos e métodos para a classe-filha (subclasse).
- **Polimorfismo**: O polimorfismo, como o próprio nome sugere, refere-se a múltiplas formas de implementar um método. Por exemplo, imagine uma classe Animal com o método `emitirSom()`, cada animal emite som de forma diferente, demonstrando o conceito de polimorfismo.

Os pilares da orientação objetos são: abstração, herança, encapsulamento e polimorfismo.

Portanto, cada paradigma tem suas especificidades e cada um vai ser mais apropriedade a depender da natureza do problema.
