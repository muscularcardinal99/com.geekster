package com.geekster.Mapping.Practice.Controller;

import com.geekster.Mapping.Practice.Model.Book;
import com.geekster.Mapping.Practice.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mapping/book")
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("getBook")
    public ResponseEntity<List<Book>> getAllBooks(){
        return bookService.getBooks();
    }
}
