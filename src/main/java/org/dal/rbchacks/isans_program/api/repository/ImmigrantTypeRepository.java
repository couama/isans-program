package org.dal.rbchacks.isans_program.api.repository;

import org.dal.rbchacks.isans_program.api.model.ImmigrantType;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ImmigrantTypeRepository extends MongoRepository<ImmigrantType, String> {
}
