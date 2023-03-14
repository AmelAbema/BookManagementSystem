package com.abema.bookmanagementsystem.Controller;

import com.abema.bookmanagementsystem.Model.Book;
import com.abema.bookmanagementsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/newBookForm")
    public String newBookForm(Model model) {
        // create model attribute to bind form data
        Book book = new Book();
        model.addAttribute("book", book);
        return "new_book";
    }
    @PostMapping("/saveBook")
    public String saveEmployee(@ModelAttribute("employee") Book book) {
        // save employee to database
        bookService.saveBook(book);
        return "redirect:/";
    }
}
