package com.example.myapplication;

public class Item {

    String title;
    String additionalNotes;
    boolean isImportant;

    public Item(String title, boolean isImportant) {
        this.title = title;
        this.isImportant = isImportant;
    }

    public Item(String title, boolean isImportant, String additionalNotes) {
        this.title = title;
        this.isImportant = isImportant;
        this.additionalNotes = additionalNotes;
    }

    public String getTitle() {
        return title;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public boolean getIsImportant() {
        return isImportant;
    }
}
