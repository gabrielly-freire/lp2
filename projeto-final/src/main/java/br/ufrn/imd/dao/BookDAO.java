package br.ufrn.imd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.model.Book;
import br.ufrn.imd.model.enums.Genre;

/**
 * Classe responsável por gerenciar as operações de CRUD de livros no banco de
 * dados.
 * 
 * @author Gabrielly Freire
 * @version 1.0
 */
public class BookDAO {

    private Connection connection;

    public BookDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Insere um livro no banco de dados
     * 
     * @param book livro a ser inserido
     * @throws SQLException caso ocorra um erro ao inserir o livro ou ao fechar os recursos
     */
    public void create(Book book) {
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(
                    "INSERT INTO book (title, author, genre, publication_year, isbn, is_available) VALUES (?, ?, ?, ?, ?, ?)");

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getGenre().toString());
            ps.setInt(4, book.getPublicationYear());
            ps.setString(5, book.getIsbn());
            ps.setBoolean(6, book.getIsAvailable());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Livro inserido com sucesso!");
            } else {
                System.out.println("Nenhum livro foi inserido.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao inserir livro: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }

    /**
     * Busca um livro no banco de dados
     * 
     * @param id id do livro a ser buscado
     * @throws SQLException caso ocorra um erro ao buscar um livro ou ao fechar os recursos
     * @return livro encontrado
     */
    public Book findById(Long id) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement("SELECT * FROM book WHERE id = ?");
            ps.setLong(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {
                Book book = new Book();
                book.setId(rs.getLong("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setGenre(Genre.valueOf(rs.getString("genre")));
                book.setPublicationYear(rs.getInt("publication_year"));
                book.setIsbn(rs.getString("isbn"));
                book.setIsAvailable(rs.getBoolean("is_available"));

                return book;
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar livro: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return null;
    }

    /**
     * Busca todos os livros no banco de dados
     * 
     * @throws SQLException caso ocorra um erro ao buscar livros ou ao fechar os recursos
     * @return lista de livros encontrados
     */
    public List<Book> findAll() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Book> books = new ArrayList<>();

        try {
            ps = connection.prepareStatement("SELECT * FROM book");
            rs = ps.executeQuery();

            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getLong("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setGenre(Genre.valueOf(rs.getString("genre")));
                book.setPublicationYear(rs.getInt("publication_year"));
                book.setIsbn(rs.getString("isbn"));
                book.setIsAvailable(rs.getBoolean("is_available"));

                books.add(book);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar livros: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return books;
    }

    /**
     * Busca livros no banco de dados
     * 
     * @param query query de busca
     * @throws SQLException caso ocorra um erro ao buscar livros ou ao fechar os recursos
     * @return lista de livros encontrados
     */
    public List<Book> searchBooks(String query) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Book> books = new ArrayList<>();

        try {
            ps = connection.prepareStatement("SELECT * FROM book WHERE title LIKE ? OR author LIKE ?");
            ps.setString(1, "%" + query + "%");
            ps.setString(2, "%" + query + "%");

            rs = ps.executeQuery();

            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getLong("id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setGenre(Genre.valueOf(rs.getString("genre")));
                book.setPublicationYear(rs.getInt("publication_year"));
                book.setIsbn(rs.getString("isbn"));
                book.setIsAvailable(rs.getBoolean("is_available"));

                books.add(book);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar livros: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return books;
    }

    /**
     * Atualiza um livro no banco de dados
     * 
     * @param id   id do livro a ser atualizado
     * @throws SQLException caso ocorra um erro ao atualizar o livro ou ao fechar os recursos
     * @param book livro com os novos dados
     */
    public void update(Long id, Book book) {
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(
                    "UPDATE book SET title = ?, author = ?, genre = ?, publication_year = ?, isbn = ?, is_available = ? WHERE id = ?");
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getGenre().toString());
            ps.setInt(4, book.getPublicationYear());
            ps.setString(5, book.getIsbn());
            ps.setBoolean(6, book.getIsAvailable());
            ps.setLong(7, id);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Livro atualizado com sucesso!");
            } else {
                System.out.println("Nenhum livro foi atualizado.");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar livro: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }

    /**
     * Deleta um livro no banco de dados
     * 
     * @param id id do livro a ser deletado
     * @throws SQLException caso ocorra um erro ao deletar o livro ou ao fechar os recursos
     */
    public void delete(Long id) {
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("DELETE FROM book WHERE id = ?");
            ps.setLong(1, id);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Livro deletado com sucesso!");
            } else {
                System.out.println("Nenhum livro foi deletado.");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao deletar livro: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }

}
