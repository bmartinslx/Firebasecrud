package com.example.firebasecrud;

import com.google.firebase.database.Exclude;

public class Note {
    private String documentId;
    private String title;
    private String description;
    public Note() {
        //public no-arg constructor needed
    }
    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }
    @Exclude
    public String getDocumentId() {
        return documentId;
    }
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
}