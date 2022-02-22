package com.spring.player.dao;

import com.spring.player.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

//@RepositoryRestResource(path = "students")
public interface PlayerDAO extends JpaRepository<Player, Integer> {

    Player findByName(@RequestParam String name);

    List<Player> findByNameContaining(@RequestParam String name);

    //  Player getPlayer(int id);

   //  List<Player> getPlayers();

   //  int removePlayer(int id);

   //  void addPlayer(Player player);
}
//------------------------------
/*
* Get http://localhost:9090/api/players
* Get http://localhost:9090/api/players/id
* post http://localhost:9090/api/players      player obj in body without id
* put http://localhost:9090/api/players/id       player obj in body without id or with same id in url
* delete http://localhost:9090/api/players/id
* Get http://localhost:9090/api/players/findByName?name=
* Get http://localhost:9090/api/players/findByNameContaining?name=
* */