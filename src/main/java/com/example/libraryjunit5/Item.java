package com.example.libraryjunit5;


public class Item {
    private String guid;
    private Record record;
    private String lentByCardNumber;
    private String lentBySnn;
    private String location;
    private int condition;

    public Item(String guid, Record record, String lentByCardNumber, String lentBySnn, String location, int condition) {
        this.guid = guid;
        this.record = record;
        this.lentByCardNumber = lentByCardNumber;
        this.lentBySnn = lentBySnn;
        this.location = location;
        this.condition = condition;
    }

    public Item(String guid, Record record) {
        this.guid = guid;
        this.record = record;
        this.lentByCardNumber = "";
        this.lentBySnn = "";
        this.location = "";
        this.condition = 5;
    }

    public String getLentByCardNumber() {
        return lentByCardNumber;
    }

    public void setLentByCardNumber(String lentByCardNumber) {
        this.lentByCardNumber = lentByCardNumber;
    }

    public String getLentBySnn() {
        return lentBySnn;
    }

    public void setLentBySnn(String lentBySnn) {
        this.lentBySnn = lentBySnn;
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
