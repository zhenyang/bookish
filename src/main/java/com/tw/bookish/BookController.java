package com.tw.bookish;

import com.tw.bookish.model.Book;
import com.tw.bookish.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Book> getAll(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "20") int size) {
        PageRequest pageable = new PageRequest(page, size);
        return bookRepository.findAll(pageable);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Book getOne(@PathVariable(value = "id") Long id) {
        return bookRepository.findOne(id);
    }
}
