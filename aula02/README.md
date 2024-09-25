# Aula 02

## Compilação manual de um programa em java

O seguunte comando compila o arquivo `Main.java` e gera o arquivo `Main.class`(gera o bytecode):

```bash
javac Main.java
```

Execução do programa

```bash
java Main
```

Em caso de passagem de argumentos para o programa.

- Compilação normalmente e na execução passa os argumentos:

```bash
java Main arg1 arg2 arg3
```

## Tipo de dados

- Primitivos
  - Numéricos
    - Inteiros
      - byte - 8 bits
      - short - 16 bits
      - int - 32 bits
      - long - 64 bits
    - Ponto flutuante
      - float - 32 bits
      - double - 64 bits
    - Caractere
      - char
    - Booleano
      - boolean
- Referência
  - String
  
## Operadores lógicos

| Operador | Descrição |
|----------|-----------|
| `&&`     | E lógico  |
| `\|\|`   | OU lógico |
| `!`      | Negação   |
| `^`      | OU exclusivo |
| `&`      | E lógico bit a bit |
| `\|`     | OU lógico bit a bit |

- `&&` e `||` são curto-circuito, ou seja, se a primeira condição for suficiente para determinar o resultado, a segunda não é avaliada.
- `&` e `|` são bitwise, ou seja, são aplicados bit a bit.

## Operadores relacionais

| Operador | Descrição |
|----------|-----------|
| `==`     | Igualdade |
| `!=`     | Diferente |
| `>`      | Maior     |
| `<`      | Menor     |
| `>=`     | Maior ou igual |
| `<=`     | Menor ou igual |

## Operadores aritméticos

| Operador | Descrição |
|----------|-----------|
| `+`      | Adição    |
| `-`      | Subtração |
| `*`      | Multiplicação |
| `/`      | Divisão   |
| `%`      | Módulo    |

## Estruturas de controle

### `if-else`
  
```java
if (condicao) {
  // bloco de código
} else if (condicao) {
  // bloco de código
} else {
  // bloco de código
}
```

### `switch-case`

```java
switch (variavel) {
  case valor1:
    // bloco de código
    break;
  case valor2:
    // bloco de código
    break;
  default:
    // bloco de código
}
```

## Estruturas de repetição

### `for`

```java
for (int i = 0; i < 10; i++) {
  // bloco de código
}
```

### `while`

```java
while (condicao) {
  // bloco de código
}
```

### `do-while`

```java
do {
  // bloco de código
} while (condicao);
```

### foreach

```java
for (int i : array) {
  // bloco de código
}
```

### formas otimizadas de `for`

```java
int i = 0
for(; i < 10; i++) {
  // bloco de código
}
```
  
```java
int i = 0
for(; i < 10;) {
  // bloco de código
  i++;
}
```

### `break` e `continue`

- `break` - interrompe a execução do laço
- `continue` - interrompe a execução atual e passa para a próxima iteração.

## Vetor

```java
int[] vetor = new int[10];
```

## Matriz

```java
int[][] matriz = new int[10][10];
```

## Array List

```java
List<String> nomes = new ArrayList<>(); // cria um array de strings

nomes.add("teste"); // adiciona um elemento

System.out.println(nomes.get(0)); // retorna o elemento na posição 0

nomes.remove(0); // remove o elemento na posição 0

System.out.println(nomes.size()); // retorna o tamanho do array

nomes.clear(); // remove todos os elementos
```
