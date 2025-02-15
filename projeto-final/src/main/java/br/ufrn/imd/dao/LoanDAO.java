package br.ufrn.imd.dao;

import java.util.List;

import br.ufrn.imd.model.Loan;

/**
 * Classe responsável por gerenciar as operações de CRUD de empréstimos no banco de dados.
 * @autor Gabrielly Freire
 * @version 1.0
 */
public class LoanDAO {

    /**
     * Insere um empréstimo no banco de dados
     * @param loan
     */
    public void create(Loan loan) {

    }

    /**
     * Busca um empréstimo por id no banco de dados
     * @param id
     * @return
     */
    public Loan findById(Long id) {
        return null;
    }

    /**
     * Busca todos os empréstimos no banco de dados
     * @return
     */

    public List<Loan> findAll() {
        return null;
    }

    /**
     * Busca empréstimos por uma query no banco de dados
     * @param query
     * @return
     */
    public List<Loan> searchLoans(String query) {
        return null;
    }
    
    /**
     * Atualiza um empréstimo no banco de dados
     * @param id
     * @param loan
     */
    public void update(Long id, Loan loan) {
        
    }
}
