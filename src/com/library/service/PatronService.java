package com.library.service;

import com.library.model.Patron;
import com.library.repository.PatronRepository;

public class PatronService {

    private PatronRepository patronRepository;

    public PatronService(PatronRepository patronRepository) {
        this.patronRepository = patronRepository;
    }

    public void registerPatron(Patron patron) {
        patronRepository.addPatron(patron);
    }

    public Patron getPatron(String id) {
        return patronRepository.findById(id);
    }
}
