package org.dal.rbchacks.isans_program.api.services;

import org.dal.rbchacks.isans_program.api.model.Funder;

import org.dal.rbchacks.isans_program.api.repository.FunderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class FunderService {
    @Autowired
    private FunderRepository funderRepository;

    public FunderService(FunderRepository funderRepository) {
        this.funderRepository = funderRepository;
    }
    public Funder saveFunderInfo(Funder funder) {
            return funderRepository.save(funder);

    }
}