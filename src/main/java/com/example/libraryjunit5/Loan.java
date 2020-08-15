package com.example.libraryjunit5;

import java.time.LocalDate;

public class Loan {
    private int id;
    private Item item;
    private String cardNumber;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private int timesRenewed;


    public Loan(int id, Item item, String cardNumber, LocalDate loanDate, LocalDate dueDate, int timesRenewed) {
        this.id = id;
        this.item = item;
        this.cardNumber = cardNumber;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.timesRenewed = timesRenewed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public int getTimesRenewed() {
        return timesRenewed;
    }

    public void setTimesRenewed(int timesRenewed) {
        this.timesRenewed = timesRenewed;
    }
}
