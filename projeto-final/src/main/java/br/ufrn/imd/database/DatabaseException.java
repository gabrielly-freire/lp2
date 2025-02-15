package br.ufrn.imd.database;

/**
 * Exception para erros de banco de dados.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg) {
        super(msg);
    }
    
}
