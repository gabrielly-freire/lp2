package aula07.DAO;

import java.util.ArrayList;

import aula07.model.Material;

public class BibliotecaDAO {
    private ArrayList<Material> materiais;
    private static BibliotecaDAO banco;

    private BibliotecaDAO() {
        materiais = new ArrayList<>();
    }

    public ArrayList<Material> getArrayMateriais() {
        return materiais;
    }

    public static BibliotecaDAO getInstance() {
        if (banco == null) {
            banco = new BibliotecaDAO();
        }
        return banco;
    }
}