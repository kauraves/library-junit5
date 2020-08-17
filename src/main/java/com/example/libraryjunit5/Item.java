package com.example.libraryjunit5;


public class Item {
    private String guid;
    private Record record;
    private String lentByCardNumber;
    private String lentBySnn;
    private String location;
    private int condition;
    private boolean isLent;

    public Item(String guid, Record record, String lentByCardNumber, String lentBySnn, String location, int condition, boolean isLent) {
        this.guid = guid;
        this.record = record;
        this.lentByCardNumber = lentByCardNumber;
        this.lentBySnn = lentBySnn;
        this.location = location;
        this.condition = condition;
        this.isLent = isLent;
    }

    public Item(String guid, Record record) {
        this(guid, record, "", "", "", 5, false);
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

    public boolean isLent() {
        return isLent;
    }

    public void setLent(boolean lent) {
        isLent = lent;
    }
}
