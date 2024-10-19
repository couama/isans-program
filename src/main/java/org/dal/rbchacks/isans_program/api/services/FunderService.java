package org.dal.rbchacks.isans_program.api.services;

import org.dal.rbchacks.isans_program.api.model.Funder;

import org.dal.rbchacks.isans_program.api.repository.FunderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunderService {
    @Autowired
    private FunderRepository funderRepository;

    public FunderService(FunderRepository funderRepository) {
        this.funderRepository = funderRepository;
    }
    public Funder saveFunderInfo(Funder funder) {
        // confirm it doesn't exist
            return funderRepository.save(funder);
    }
    public List<Funder> getFunders(){
        return funderRepository.findAll();
    }
}