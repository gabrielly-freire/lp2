package br.ufrn.imd.service;

import br.ufrn.imd.dao.BookDAO;
import br.ufrn.imd.model.Book;

public class BookService {

    private BookDAO bookDAO;
    
    public void createBook(Book book) {
        bookDAO.create(book);
    }
}
