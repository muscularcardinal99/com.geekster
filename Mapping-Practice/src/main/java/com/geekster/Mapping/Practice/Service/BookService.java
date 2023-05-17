package com.geekster.Mapping.Practice.Service;

import com.geekster.Mapping.Practice.DAO.IBookRepo;
import com.geekster.Mapping.Practice.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;
    public ResponseEntity<List<Book>> getBooks() {
        HttpStatus status=null;
        List<Book> bookList= (List<Book>) bookRepo.findAll();
        if(bookList.isEmpty()){
            status=HttpStatus.NO_CONTENT;
            return new ResponseEntity<>(null,status);
        }
        status=HttpStatus.OK;
        return new ResponseEntity<>(bookList,status);
    }
}
