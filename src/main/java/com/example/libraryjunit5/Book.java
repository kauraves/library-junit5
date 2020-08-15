package com.example.libraryjunit5;

public class Book extends Record {

    private String isbn;

    public Book(String identifier, String author, String contributor, int publicationYear, String language,
                MediaClass mediaClass, String classification, String category, String description, String publisher,
                String extent, String isbn) {
        super(identifier, author, contributor, publicationYear, language, mediaClass, classification, category,
                description, publisher, extent);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
