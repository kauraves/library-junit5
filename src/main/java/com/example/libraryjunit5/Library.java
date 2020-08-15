package com.example.libraryjunit5;

import java.util.*;

public class Library {
    private String name;
    private final Map<String, Record> records = new HashMap<String, Record>();
    private final Map<String, Item> items = new HashMap<String, Item>();
    private final List<LendingEvent> lendingEvents = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Record> getRecords() {
        return records;
    }

    public Map<String, Item> getItems() {
        return items;
    }

    public void customerLoansAnItem() {

    }

    public void customerReturnsAnItem() {

    }
}
