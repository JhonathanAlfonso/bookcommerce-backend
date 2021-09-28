package com.salajhon69.bookcommerce.service;

import com.salajhon69.bookcommerce.model.Book;
import com.salajhon69.bookcommerce.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookService implements IBookService{

    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        book.setCreateTime(LocalDate.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
