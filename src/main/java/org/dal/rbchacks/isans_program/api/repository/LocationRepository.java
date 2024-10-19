package org.dal.rbchacks.isans_program.api.repository;

import org.dal.rbchacks.isans_program.api.model.Location;

import org.dal.rbchacks.isans_program.api.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface LocationRepository extends MongoRepository<Location, String> {
    @Query("{ 'status' : 'Active'")
    List<Location> getAllActiveLocations();
}
