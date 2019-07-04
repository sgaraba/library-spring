package com.example.demo.service;

import com.example.demo.domain.dto.BookForm;
import com.example.demo.domain.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findByIsbn(String isbn);

    Book save(BookForm bookForm);

    void delete(BookForm bookForm);

    BookForm createBookForm(Book book);
}
