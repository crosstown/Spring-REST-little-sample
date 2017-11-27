package com.crosstown.teams;

import com.crosstown.teams.domain.Player;
import com.crosstown.teams.domain.Team;
import com.crosstown.teams.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class TeamsApplication {
	@Autowired
	TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(TeamsApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));

		list.add(new Team( "Globetrotters", "Harlem", "cat", set));
		list.add(new Team("Generals", "Washington", "roater", null));

		teamRepository.save(list);
	}
}