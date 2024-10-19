package org.dal.rbchacks.isans_program.api.services;

import org.dal.rbchacks.isans_program.api.model.Funder;
import org.dal.rbchacks.isans_program.api.model.Location;
import org.dal.rbchacks.isans_program.api.repository.FunderRepository;
import org.dal.rbchacks.isans_program.api.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository =locationRepository;
    }
    public Location saveLocationInfo(Location location) {
        return locationRepository.save(location);
    }
    public List<Location> getAvailableLocation(){
        return locationRepository.findAll();
    }
}