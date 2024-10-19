package org.dal.rbchacks.isans_program.api.services;

import org.dal.rbchacks.isans_program.api.model.Funder;
import org.dal.rbchacks.isans_program.api.model.ImmigrantType;
import org.dal.rbchacks.isans_program.api.repository.FunderRepository;
import org.dal.rbchacks.isans_program.api.repository.ImmigrantTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

    public class ImmigrantTypeService {
        @Autowired
        private ImmigrantTypeRepository immigrantTypeRepository;

        public ImmigrantTypeService(ImmigrantTypeRepository immigrantTypeRepository) {
            this.immigrantTypeRepository = immigrantTypeRepository;
        }
        public ImmigrantType saveImmigrantType(ImmigrantType type){
            return immigrantTypeRepository.save(type);
        }

    }



