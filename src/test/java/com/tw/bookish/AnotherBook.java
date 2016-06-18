package com.tw.bookish;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tw.bookish.model.Book;

import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

public class AnotherBook {
    private String title;
    private String asin;
    private List<String> author;
    private List<String> isbn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value = "published_at")
    private Date publishedAt;

    public AnotherBook() {
    }

    public List<String> getIsbn() {
        return isbn;
    }

    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Book toBook(){
        Book book = new Book();
        book.setTitle(title);
        book.setAsin(asin);
        book.setAuthor(String.join(", ", author));
        book.setIsbn(String.join(", ", isbn));
        book.setPublishedAt(publishedAt);
        return book;
    }
}
