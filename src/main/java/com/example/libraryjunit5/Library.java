package com.example.libraryjunit5;

import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Library {
    private String name;
    private final Map<String, Record> records = new HashMap<String, Record>();
    private final Map<String, Item> items = new HashMap<String, Item>();
    private final Map<String, Customer> customers = new HashMap<String, Customer>();
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

    public Map<String, Customer> getCustomers() {
        return customers;
    }

    public List<LendingEvent> getLendingEvents() {
        return lendingEvents;
    }

    public void addCustomer(Customer customer) {
        if (!customers.containsKey(customer.getSsn())) {
            customers.put(customer.getSsn(), customer);
        }
    }

    public void addCustomer(String ssn, String name, String address, String phone, String email, String cardNumber) throws CustomException {
        try {
            Customer c = new Customer(ssn, name, address, phone, email, cardNumber);
            this.addCustomer(c);
        } catch (CustomException ex) {
            throw new CustomException(ex.getMessage());
        }
    }

    public void removeCustomer(String ssn) {
        if (customers.containsKey(ssn)) {
            Customer c = (Customer) customers.get(ssn);
            if (c.getLoans().size() == 0) {
                customers.remove(ssn);
            }
        }
    }

    public void addBook(String guid, String identifier, String author, String contributor, int publicationYear, String language,
                        String classification, String category, String description, String publisher,
                        String extent, String isbn, String edition, String notes) {
        MediaClass mediaClass;
        mediaClass = MediaClass.BOOK;

        Record r = new Record(identifier, isbn, null, author, contributor, publicationYear,
                                language, mediaClass, classification, category, description, publisher, extent, notes);
        Item i = new Item(guid, r);

        this.addRecord(r);
        this.addItem(i);
    }

    public void addRecord(Record record) {
        if (!records.containsKey(record.getIdentifier())) {
            records.put(record.getIdentifier(), record);
        }
    }

    public void addItem(Item item) {
        if (!items.containsKey(item.getGuid())) {
            items.put(item.getGuid(), item);
        }
    }

    public void removeItem(String guid) {
        if (items.containsKey(guid)) {
            items.remove(guid);
        }
    }

    public Item findItem(String itemGuid) {
        if (items.containsKey(itemGuid)) {
            Item item = (Item) items.get(itemGuid);
            return item;
        }
        return null;
    }

    public void customerLoansAnItem(Customer customer, String itemGuid) throws CustomException {

        CustomException exception;
        Item item = this.findItem(itemGuid);
        if (item == null) {
            throw new CustomException("The Item does not exist!");
        }
        else {
            if (item.isLent()) {
                throw new CustomException("The Item is not present!");
            }
        }
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDate today = currentTime.toLocalDate();
        Loan loan = new Loan(itemGuid, item, customer.getCardNumber(), today, null, 0);
        customer.addLoan(loan);
        item.setLent(true);
        item.setLentByCardNumber(customer.getCardNumber());
        item.setLentBySnn(customer.getSsn());
    }

    public void customerReturnsAnItem() {

    }
}
