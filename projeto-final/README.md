# Projeto Final de LP2: Sistema de Gestão de Biblioteca

Este é o projeto final da disciplina de **Linguagem de Programação 2 (LP2)**. O objetivo é desenvolver um sistema de tema livre utilizando as tecnologias vistas ao longo do semestre. O tema escolhido foi o **Sistema de Gestão de Biblioteca**, que permite gerenciar livros, usuários, empréstimos e devoluções.

## Descrição do Sistema

O sistema tem como objetivo gerenciar uma biblioteca, oferecendo funcionalidades como cadastro, edição, exclusão e pesquisa de livros e usuários. Além disso, permite registrar e controlar empréstimos e devoluções de livros de maneira prática.

## Funcionalidades

### Gerenciamento de livros

- **Adicionar livros:** Cadastrar novos livros no sistema.
- **Listar livros:** Visualizar todos os livros cadastrados.
- **Editar livros:** Atualizar informações de um livro.
- **Remover livros:** Excluir livros do sistema.
- **Filtrar livros:** Pesquisar livros por título, autor ou categoria.

### Gerenciamento de usuários

- **Adicionar usuários:** Cadastrar novos usuários da biblioteca.
- **Listar usuários:** Visualizar todos os usuários cadastrados.
- **Editar usuários:** Atualizar informações de um membro.
- **Remover usuários:** Excluir usuários do sistema.
- **Filtrar usuários:** Pesquisar usuários por nome ou e-mail.

### Gerenciamento de empréstimos

- **Registrar empréstimos:** Realizar empréstimos de livros para usuários.
- **Listar empréstimos:** Exibir todos os empréstimos registrados.
- **Filtrar empréstimos:** Pesquisar empréstimos por membro, livro ou status (pendente/devolvido).
- **Atualizar status:** Marcar empréstimos como devolvidos.

### Relatórios**

- **Livros disponíveis:** Listar livros disponíveis para empréstimo.
- **Livros mais emprestados:** Identificar os livros com maior número de empréstimos.
- **Usuários com mais empréstimos:** Listar usuários que realizaram mais empréstimos.

## **Como executar o projeto**

1. **Pré-requisitos:**
   - Java 17 ou superior.
   - MySQL instalado e configurado.
   - Dependências gerenciadas pelo Maven.

2. **Configuração do Banco de Dados:**
   - Crie o banco de dados utilizando o scriptSQL fornecido na pasta `assets/database.sql`.
   - Configure as credenciais de acesso ao banco.

3. **Execução:**
    

## Tecnologias e ferramentas utilizadas

1. **Java:** Linguagem de programação utilizada no desenvolvimento do sistema.
2. **JavaFX:** Biblioteca gráfica para Java, utilizada para desenvolver a interface do sistema.
3. **Scene Builder:** Ferramenta visual para criação de interfaces gráficas.
4. **MySQL:** Banco de dados relacional para armazenar informações do sistema.
5. **JDBC:** Conector Java para comunicação com o MySQL.
6. **Maven:** Gerenciador de dependências e build do projeto.
7. **VSCode:** Editor de código utilizado no desenvolvimento do projeto.
