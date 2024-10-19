package org.dal.rbchacks.isans_program.api.controller;

import org.dal.rbchacks.isans_program.api.model.Funder;
import org.dal.rbchacks.isans_program.api.model.Location;
import org.dal.rbchacks.isans_program.api.services.FunderService;
import org.dal.rbchacks.isans_program.api.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/setup/location")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @PostMapping
    public ResponseEntity<Location> createPerson(@RequestBody Location location) {
        Location savedType = locationService.saveLocationInfo(location);
        return ResponseEntity.ok(savedType);
    }
}
