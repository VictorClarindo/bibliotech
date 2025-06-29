package com.bibliotech.domain.book;

import java.util.UUID;

public class Book {
    private UUID BookId;
    private String title;
    private String author;
    private String coverImage;
    private String ISBN;
    private Genre genre;
    private Integer quantityInStock;

    public Book(UUID BookId, String title, String author, String coverImage, String ISBN, Genre genre, Integer quantityInStock) {
        this.BookId = BookId;
        this.title = title;
        this.author = author;
        this.coverImage = coverImage;
        this.ISBN = ISBN;
        this.genre = genre;
        this.quantityInStock = quantityInStock;
    }

    public UUID getBookId() {
        return BookId;
    }

    public void setId(UUID BookId) {
        this.BookId = BookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public String getISBN() {
        return ISBN;
    }

    public Genre getGenre() {
        return genre;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }
}
