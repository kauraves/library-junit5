package com.example.libraryjunit5;

import java.security.PrivateKey;

public class Item {
    private String guid;
    private Record record;
    private String location;
    private int condition;

    public Item(String guid, Record record, String location, int condition) {
        this.guid = guid;
        this.record = record;
        this.location = location;
        this.condition = condition;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
