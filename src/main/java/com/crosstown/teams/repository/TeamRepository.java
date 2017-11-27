package com.crosstown.teams.repository;

import com.crosstown.teams.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author F.S.(Crosstown)
 * @date 11/27/2017
 * @time 1:01 PM
 */

@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends CrudRepository<Team, Long>{
}
