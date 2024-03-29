package com.zmo.FlashCard;

public class Terminology {
    private String term;
    private String definition;
    private String chapter; // New attribute to specify the chapter

    public Terminology(String term, String definition, String chapter) {
        this.term = term;
        this.definition = definition;
        this.chapter = chapter;
    }

    // Getters
    public String getTerm() {
        return term;
    }

    public String getDefinition() {
        return definition;
    }

    public String getChapter() {
        return chapter;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }
}
