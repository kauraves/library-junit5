package com.example.libraryjunit5;

public class CD extends Record {

    private String notes;
    private String isrc;

    public CD(String identifier, String author, String contributor, int publicationYear, String language,
              MediaClass mediaClass, String classification, String category, String description, String publisher,
              String extent, String notes) {
        super(identifier, author, contributor, publicationYear, language, mediaClass, classification, category,
                description, publisher, extent);
        this.notes = notes;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
