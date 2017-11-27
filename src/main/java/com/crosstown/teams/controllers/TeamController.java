package com.crosstown.teams.controllers;

import com.crosstown.teams.domain.Team;
import com.crosstown.teams.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author F.S.(Crosstown)
 * @date 11/27/2017
 * @time 12:27 PM
 */
//@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @GetMapping("/teams")
    public Iterable<Team> getTeams() {

        return teamRepository.findAll();
    }

    @GetMapping("/teams/{id}")
    public Team getTeam(@PathVariable Long id) {
        Team myTeam = teamRepository.findOne(id);
        return myTeam;
    }
}
