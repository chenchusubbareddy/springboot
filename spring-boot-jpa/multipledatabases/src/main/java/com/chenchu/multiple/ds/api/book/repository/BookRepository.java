package com.chenchu.multiple.ds.api.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chenchu.multiple.ds.api.model.book.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
