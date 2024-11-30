package aula07.utils;

import java.util.ArrayList;

import DAO.BibliotecaDAO;
import model.Livro;
import model.Material;
import model.Revista;

public class BibliotecaFunctions {

    private static BibliotecaDAO dao = BibliotecaDAO.getInstance();

    public static void cadastrarMaterial(String titulo, String autor, int anoLancamento, String edicao) {
        Livro novoLivro = new Livro(titulo, autor, anoLancamento, edicao);
        dao.getArrayMateriais().add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public static void cadastrarMaterial(String titulo, String editora, int numeroPaginas) {
        Revista novaRevista = new Revista(titulo, editora, numeroPaginas);
        dao.getArrayMateriais().add(novaRevista);
        System.out.println("Revista cadastrado com sucesso!");
    }

    public static void exibirListaMateriais() {
        ArrayList<Material> materiais = dao.getArrayMateriais();
        for (Material material : materiais)
           material.exibirDetalhes();
    }

    public static void pesquisarMaterial(String titulo) {
        ArrayList<Material> materiais = dao.getArrayMateriais();
        boolean encontrou = false;
        for (Material material : materiais){
            if(material.getTitulo() == titulo) 
                encontrou = true;
        }

        if (encontrou) {
            System.out.println("Encontrou Material");
        }else {
            System.out.println("Não encontrou material");
        }
    }

    public static void removerMaterial(String titulo) {
        ArrayList<Material> materiais = dao.getArrayMateriais();
        boolean encontrou = false;

        for (int i = 0; i < materiais.size(); i++) {
            if(materiais.get(i).getTitulo() == titulo) {
                encontrou = true;
                materiais.remove(i);
            }
        }

        if(encontrou){
            System.out.println("Material removido com sucesso!");
        } else {
            System.out.println("Material não encontrado para remover!");
        }
    }

}