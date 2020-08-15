package com.example.libraryjunit5;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class LendingEvent {
    private long id;
    private LocalDateTime timestamp;
    private Item item;
    private String cardNumber;
    private int eventType;

    public LendingEvent(long id, LocalDateTime timestamp, Item item, String cardNumber, int eventType) {
        this.id = id;
        this.timestamp = timestamp;
        this.item = item;
        this.cardNumber = cardNumber;
        this.eventType = eventType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }
}
