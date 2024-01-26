package com.gb.dz3.controllers;

/**
 *
 */

import com.gb.dz3.models.Book;
import com.gb.dz3.services.BookService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Data
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping(value = "/create")
    public ResponseEntity<Book> create(
            @RequestParam (name = "id") Long id,
            @RequestParam (name = "name") String name,
            @RequestParam (name = "author") String author){

        return new ResponseEntity<>(bookService.create(id, name, author), HttpStatus.OK);
    }

}
