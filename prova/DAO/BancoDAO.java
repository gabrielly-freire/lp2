package DAO;

import java.util.ArrayList;
import model.pessoa.Pessoa;

public class BancoDAO {

    private ArrayList<Pessoa> clientes;

    public static BancoDAO banco;

    private BancoDAO() {
        clientes = new ArrayList<>();
    }

    public static BancoDAO getIntance() {
        if (banco == null) {
            banco = new BancoDAO();
        }
        return banco;
    }

    public ArrayList<Pessoa> getArrayPessoas() {
        return this.clientes;
    }

}
