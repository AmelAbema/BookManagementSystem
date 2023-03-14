package com.abema.bookmanagementsystem.Service;

import com.abema.bookmanagementsystem.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookService {
    List<Book> getALLBooks();
    void saveBook(Book book);
}
