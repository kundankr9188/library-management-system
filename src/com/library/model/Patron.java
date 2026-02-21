package com.library.model;

import java.util.ArrayList;
import java.util.List;
import com.library.observer.Observer;

public class Patron implements Observer {

    private String id;
    private String name;
    private String email;
    private List<Loan> borrowingHistory;

    public Patron(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.borrowingHistory = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Loan> getBorrowingHistory() {
        return borrowingHistory;
    }

    public void addLoan(Loan loan) {
        borrowingHistory.add(loan);
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}
