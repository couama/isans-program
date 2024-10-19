package org.dal.rbchacks.isans_program.api.repository;

import org.dal.rbchacks.isans_program.api.model.Funder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;


public interface FunderRepository extends MongoRepository<Funder, String> {
}
