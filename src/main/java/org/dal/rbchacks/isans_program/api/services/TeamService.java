package org.dal.rbchacks.isans_program.api.services;

import org.dal.rbchacks.isans_program.api.model.Location;
import org.dal.rbchacks.isans_program.api.model.Team;
import org.dal.rbchacks.isans_program.api.repository.LocationRepository;
import org.dal.rbchacks.isans_program.api.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository =teamRepository;
    }
    public Team saveTeamInfo(Team team) {
        return teamRepository.save(team);
    }
}