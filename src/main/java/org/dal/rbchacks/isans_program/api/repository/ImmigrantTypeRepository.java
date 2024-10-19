package org.dal.rbchacks.isans_program.api.repository;

import org.dal.rbchacks.isans_program.api.model.ImmigrantType;
import org.dal.rbchacks.isans_program.api.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface ImmigrantTypeRepository extends MongoRepository<ImmigrantType, String> {
    @Query("{ 'status' : 'Active'")
    List<ImmigrantType> getAllActiveImmigrationTypes();
}
