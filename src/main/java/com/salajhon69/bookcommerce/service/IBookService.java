package com.salajhon69.bookcommerce.service;

import com.salajhon69.bookcommerce.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long bookId);

    List<Book> findAllBooks();
}
