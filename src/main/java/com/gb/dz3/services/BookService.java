package com.gb.dz3.services;


import com.gb.dz3.models.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public Book create(Long id, String name, String author) {

        Book book1 = new Book();
        book1.setId(id);
        book1.setName(name);
        book1.setAuthor(author);

        return book1;
    }
}
