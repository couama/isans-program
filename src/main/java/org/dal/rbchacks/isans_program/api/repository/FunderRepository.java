package org.dal.rbchacks.isans_program.api.repository;

import org.dal.rbchacks.isans_program.api.model.Funder;
import org.dal.rbchacks.isans_program.api.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface FunderRepository extends MongoRepository<Funder, String> {
    @Query("{ 'status' : 'Active'")
    List<Funder> getAllActiveFunders();
}
