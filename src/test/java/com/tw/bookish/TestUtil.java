package com.tw.bookish;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tw.bookish.AnotherBook;
import com.tw.bookish.model.Book;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class TestUtil {

    public static List<Book> readFixture() throws IOException {
        ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
        List<AnotherBook> anotherBook = mapper.readValue(
                new File(TestUtil.class.getClassLoader().getResource("books.json").getFile()),
                new TypeReference<List<AnotherBook>>() {
                });
        List<Book> books = anotherBook.stream().map(AnotherBook::toBook).collect(Collectors.toList());
        return books;
    }

}