package com.salajhon69.bookcommerce.repository;

import com.salajhon69.bookcommerce.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
