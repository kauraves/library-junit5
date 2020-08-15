package com.example.libraryjunit5;

public enum MediaClass {
    BOOK (1, "Book"),
    CD (2, "CD") ,
    UNDEFINED(3, "Undefined"){
        @Override
        public String comment() {
            return "to be decided later: " + getKey() + ", " + getName();
        }
    };

    private final int repr;
    private final String name;

    MediaClass(int repr, String name) {
        this.repr = repr;
        this.name = name;
    }

    public int getKey() {
        return repr;
    }

    public String getName() {
        return name;
    }

    public String comment() {
        return repr + ": " + name;
    }
}
