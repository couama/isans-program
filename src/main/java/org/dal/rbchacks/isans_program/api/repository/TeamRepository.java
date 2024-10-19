package org.dal.rbchacks.isans_program.api.repository;

import org.dal.rbchacks.isans_program.api.model.Team;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TeamRepository extends MongoRepository<Team, String> {
    @Query("{ 'status' : 'Active'")
    List<Team> getAllActiveTeams();
}
