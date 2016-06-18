package com.tw.bookish;

import com.tw.bookish.model.Book;
import com.tw.bookish.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class BookControllerTest {
    @Autowired
    BookRepository bookRepository;

    @Test
    public void loadData() throws Exception {
        bookRepository.deleteAll();
        List<Book> books = TestUtil.readFixture();
        bookRepository.save(books);
    }

}