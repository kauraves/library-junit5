package com.example.libraryjunit5;

import java.util.*;

public class Customer  {
    private String ssn;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String cardNumber;
    //private List<Loan> loans;
    private Map<String, Loan> loans = new HashMap<String, Loan>();

    public Customer(String ssn, String name, String address, String phone, String email, String cardNumber) throws CustomException {
        try {
            //this.ssn = ssn;
            this.setSsn(ssn);
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.email = email;
            this.cardNumber = cardNumber;
        } catch (CustomException ex){
            throw new CustomException(ex.getMessage());
        }
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) throws CustomException {
        if (ssn.length() < 12) {
            throw new CustomException("The ssn is not valid!");
        }
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Map<String, Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        if (!loans.containsKey(loan.getItemGuid())) {
            loans.put(loan.getItemGuid(), loan);
        }
    }

    public void removeLoan(String itemGuid) {
        if (loans.containsKey(itemGuid)) {
            loans.remove(itemGuid);
        }
    }
}
