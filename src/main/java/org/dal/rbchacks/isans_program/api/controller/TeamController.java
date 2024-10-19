package org.dal.rbchacks.isans_program.api.controller;

import org.dal.rbchacks.isans_program.api.model.Location;
import org.dal.rbchacks.isans_program.api.model.Team;
import org.dal.rbchacks.isans_program.api.services.LocationService;
import org.dal.rbchacks.isans_program.api.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/setup/team-type")
public class TeamController {
    @Autowired
    private TeamService teamService;
    @PostMapping
    public ResponseEntity<Team> createPerson(@RequestBody Team team) {
        Team savedType = teamService.saveTeamInfo(team);
        return ResponseEntity.ok(savedType);
    }
}
