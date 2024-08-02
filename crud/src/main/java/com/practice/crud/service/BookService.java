package com.practice.crud.service;

import com.practice.crud.model.Book;
import com.practice.crud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
private BookRepository bookRepository;


    public List<Book> getAll(){
        return bookRepository.findAll();
    }

    public Book getById(Long id){
        return bookRepository.findById(id).get();
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public Book update(Long id,Book book){
        Book book1 = bookRepository.findById(id).get();

        book1.setTitle(book.getTitle());
        book1.setAuthor(book.getAuthor());
        book1.setPublisher(book.getPublisher());
        book1.setIsbn(book.getIsbn());

        return bookRepository.save(book1);
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
