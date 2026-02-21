package com.library.repository;

import com.library.model.Patron;

import java.util.HashMap;
import java.util.Map;

public class PatronRepository {

    private Map<String, Patron> patrons = new HashMap<>();

    public void addPatron(Patron patron) {
        patrons.put(patron.getId(), patron);
    }

    public Patron findById(String id) {
        return patrons.get(id);
    }

    public void updatePatron(Patron patron) {
        patrons.put(patron.getId(), patron);
    }
}
