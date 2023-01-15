package com.example.architecturalstyles.service;

import org.springframework.stereotype.Service;

@Service
public class BookService implements IUserService {

    @Override
    public Book getBookById(Long id) {
        Book book = new Book();
        book.setId(123L);
        book.setTitle("Title");
        book.setLanguage("English");
        book.setGenre("genre");
        book.setPages(123);
        return book;
    }

}
