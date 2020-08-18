package com.example.libraryjunit5;

/**
 * @author vesa.kauranen
 * @date 11/08/2020
 * @since 1.0
 */
public class Record {
    protected String identifier;
    private String isbn;
    private String isrc;
    protected String author;
    protected String contributor;
    protected int publicationYear;
    protected String language;
    protected MediaClass mediaClass;
    protected String classification;
    protected String category;
    protected String description;
    protected String publisher;
    protected String extent;
    private String notes;
    private String edition;

    public Record(String identifier, String isbn, String isrc, String author, String contributor, int publicationYear,
                  String language, MediaClass mediaClass, String classification, String category, String description,
                  String publisher, String extent, String notes, String edition) {
        this.identifier = identifier;
        this.isbn = isbn;
        this.isrc = isrc;
        this.author = author;
        this.contributor = contributor;
        this.publicationYear = publicationYear;
        this.language = language;
        this.mediaClass = mediaClass;
        this.classification = classification;
        this.category = category;
        this.description = description;
        this.publisher = publisher;
        this.extent = extent;
        this.notes = notes;
        this.edition = edition;
    }

    public Record(String identifier, String isbn, String isrc, String author, String contributor, int publicationYear,
                  String language, MediaClass mediaClass, String classification, String category, String description,
                  String publisher, String extent, String notes) {
        this.identifier = identifier;
        this.isbn = isbn;
        this.isrc = isrc;
        this.author = author;
        this.contributor = contributor;
        this.publicationYear = publicationYear;
        this.language = language;
        this.mediaClass = mediaClass;
        this.classification = classification;
        this.category = category;
        this.description = description;
        this.publisher = publisher;
        this.extent = extent;
        this.notes = notes;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public MediaClass getMediaClass() {
        return mediaClass;
    }

    public void setMediaClass(MediaClass mediaClass) {
        this.mediaClass = mediaClass;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getExtent() {
        return extent;
    }

    public void setExtent(String extent) {
        this.extent = extent;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
