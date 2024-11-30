import java.util.Scanner;
import model.GerenciadorProdutos;
import model.Produto;
import model.enums.Categoria;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        GerenciadorProdutos gerenciadorProdutos = new GerenciadorProdutos();

        int opcao = 0;
        try {
            do {
                menu();
                opcao = leia.nextInt();
                leia.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o nome:");
                        String nome = leia.nextLine();
                        System.out.println("Digite o preço:");
                        Double preco = leia.nextDouble();
                        leia.nextLine();
                        System.out.println("Digite a Categoria:");
                        String categoria = leia.next();

                        try {
                            Produto produto = new Produto(nome, preco, Categoria.valueOf(categoria.toUpperCase()));
                            gerenciadorProdutos.salvarProduto(produto);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Categoria inválida.");
                        }
                        break;

                    case 2:
                        gerenciadorProdutos.listarTodosProdutos();
                        break;

                    case 3:
                        System.out.println("Digite o id do produto:");
                        int id = leia.nextInt();
                        gerenciadorProdutos.buscarProduto(id);
                        break;

                    case 4:
                        System.out.println("Digite o id do produto:");
                        id = leia.nextInt();
                        leia.nextLine();
                        System.out.println("Digite o nome:");
                        nome = leia.nextLine();
                        System.out.println("Digite o preço:");
                        preco = leia.nextDouble();
                        leia.nextLine();
                        System.out.println("Digite a Categoria:");
                        categoria = leia.next();

                        try {
                            Produto produtoAtualizado = new Produto(nome, preco,
                                    Categoria.valueOf(categoria.toUpperCase()));
                            gerenciadorProdutos.atualizarProduto(id, produtoAtualizado);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Categoria inválida.");
                        }
                        break;

                    case 5:
                        System.out.println("Digite o id do produto:");
                        id = leia.nextInt();
                        gerenciadorProdutos.excluirProduto(id);
                        break;

                    case 6:
                        System.out.println("Digite a Categoria:");
                        categoria = leia.nextLine();
                        try {
                            gerenciadorProdutos.listarProdutosPorTipo(Categoria.valueOf(categoria.toUpperCase()));
                        } catch (IllegalArgumentException e) {
                            System.out.println("Categoria inválida.");
                        }
                        break;

                    case 7:
                        System.out.println("Obrigado por usar nosso sistema!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } while (opcao != 7);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        gerenciadorProdutos.salvarProdutosNoArquivo();
        leia.close();
    }

    public static void menu() {
        System.out.println("Bem-vindo ao sistema de gerenciamento de produtos");
        System.out.println("1 - Salvar Produto");
        System.out.println("2 - Listar todos Produtos");
        System.out.println("3 - Buscar Produto");
        System.out.println("4 - Atualizar Produto");
        System.out.println("5 - Remover Produto");
        System.out.println("6 - Listar Produtos por Categoria");
        System.out.println("7 - Sair");
        System.out.println("Digite a opção desejada: ");
    }
}
