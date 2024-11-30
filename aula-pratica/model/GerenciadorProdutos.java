package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import model.enums.Categoria;

public class GerenciadorProdutos {
    private List<Produto> produtos;
    private final String ARQUIVO_PRODUTOS = "produtos.txt";
    
    public GerenciadorProdutos() {
        if (recuperarProdutos() != null) {
            produtos = recuperarProdutos();
        } else {
            produtos = new ArrayList<>();
        }
    }

    /**
     * Salva o produto no arquivo e no array
     * 
     * @param produto Produto que deseja salvar
     */
    public void salvarProduto(Produto produto) {
        produto.setId(produtos.size() + 1);
        produtos.add(produto);
        System.out.println("Produto salvo com sucesso.");
    }

    /**
     * Recupera os produtos cadastrados do arquivo
     */
    @SuppressWarnings("unchecked")
    private List<Produto> recuperarProdutos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO_PRODUTOS))) {
            produtos = (List<Produto>) ois.readObject(); 
        } catch (FileNotFoundException e) {
            System.out.println("Nenhum produto encontrado. Um novo arquivo será criado.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao recuperar produtos: " + e.getMessage());
        }
        return produtos;
    }

    /**
     * Busca um produto por id
     * 
     * @param id
     * @return
     */
    public void buscarProduto(Integer id) {
        Produto produtoEncontrado = null;
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtoEncontrado = produto;
            }
        }
        if (produtoEncontrado != null) {
            System.out.println(produtoEncontrado.toString());
            System.out.println("Produto encontrado com sucesso!");
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    /**
     * Atualiza o produto no array e no arquivo
     * 
     * @param id               ID do produto a ser atualizado
     * @param produtoAtualizado Produto com os dados atualizados
     */
    public void atualizarProduto(Integer id, Produto produtoAtualizado) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId().equals(id)) {
                produtoAtualizado.setId(id);
                produtos.set(i, produtoAtualizado); 
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    /**
     * Exclui o produto do array e atualiza o arquivo
     * 
     * @param id ID do produto a ser excluído
     */
    public void excluirProduto(Integer id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                produtos.remove(produto);
                System.out.println("Produto excluído com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    /**
     * Lista os produtos filtrados por categoria
     * 
     * @param categoria Categoria dos produtos a serem listados
     * @return Lista de produtos filtrados
     */
    public void listarProdutosPorTipo(Categoria categoria) {
        List<Produto> listaFiltrada = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getCategoria() == categoria) {
                listaFiltrada.add(produto);
            }
        }

        for (Produto produto : listaFiltrada) {
            System.out.println(produto.toString());
        }
    }

    /**
     * Lista todos os produtos
     * 
     */
    public void listarTodosProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }

    /**
     * Salva os produtos no arquivo
     */
    public void salvarProdutosNoArquivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO_PRODUTOS))) {
            oos.writeObject(produtos); 
            System.out.println("Produtos salvos com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }
}
