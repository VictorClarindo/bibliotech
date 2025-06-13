package com.bibliotech.domain.book;

public enum BookCategory {
    FICTION("Fiction"),
    MYSTERY("Mystery"),
    THRILLER("Thriller"),
    SCIENCE_FICTION("Science Fiction"),
    FANTASY("Fantasy"),
    HISTORICAL_FICTION("Historical Fiction"),
    ROMANCE("Romance"),
    YOUNG_ADULT("Young Adult"),
    NON_FICTION("Non-Fiction"),
    BIOGRAPHY("Biography"),
    AUTOBIOGRAPHY("Autobiography"),
    HISTORY("History"),
    SCIENCE("Science"),
    TECHNOLOGY("Technology"),
    SELF_HELP("Self-Help"),
    POETRY("Poetry"),
    DRAMA("Drama"),
    CHILDREN("Children's Literature"),
    COOKING("Cooking"),
    TRAVEL("Travel");

    private final String displayName;

    BookCategory(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }

    @Override
    public String toString(){
        return displayName;
    }
}
