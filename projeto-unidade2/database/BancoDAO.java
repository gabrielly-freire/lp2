package database;

import java.util.ArrayList;

import model.Funcionario;
/**
 * Classe que simula um banco de dados
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public class BancoDAO {

    private ArrayList<Funcionario> funcionarios;

    public static BancoDAO banco;

    /**
     * Construtor da classe BancoDAO
     */
    private BancoDAO() {
        funcionarios = new ArrayList<>();
    }

    /**
     * Método que retorna a instância do banco
     * 
     * @return banco
     */
    public static BancoDAO getIntance() {
        if (banco == null) {
            banco = new BancoDAO();
        }
        return banco;
    }

    /**
     * Método que retorna o array de funcionários
     * 
     * @return funcionarios
     */
    public ArrayList<Funcionario> getArrayFuncionarios() {
        return this.funcionarios;
    }

}