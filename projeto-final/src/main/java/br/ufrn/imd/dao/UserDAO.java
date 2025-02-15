package br.ufrn.imd.dao;

import java.util.List;

import br.ufrn.imd.model.User;

/**
 * Classe responsável por gerenciar as operações de CRUD de usuários no banco de dados.
 * @autor Gabrielly Freire
 * @version 1.0
 */
public class UserDAO {

    /**
     * Insere um usuário no banco de dados
     * @param user
     */
    public void create(User user){

    }

    /**
     * Busca um usuário por id no banco de dados
     * @param id
     * @return
     */
    public User findById(Long id){
        return null;
    }

    /**
     * Busca todos os usuários no banco de dados
     * @return
     */
    public List<User> findAll(){
        return null;
    }

    /**
     * Busca usuários por uma query no banco de dados
     * @param query
     * @return
     */
    public List<User> searchUsers(String query){
        return null;
    }

    /**
     * Atualiza um usuário no banco de dados
     * @param id
     * @param user
     */
    public void update(Long id, User user){

    }

    /**
     * Deleta um usuário no banco de dados
     * @param id
     */
    public void delete(Long id){

    }
    
}
