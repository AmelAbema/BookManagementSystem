package com.abema.bookmanagementsystem.Controller;

import com.abema.bookmanagementsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    private BookService bookService;
    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("listBooks", bookService.getALLBooks());
        return "home";
    }
}
