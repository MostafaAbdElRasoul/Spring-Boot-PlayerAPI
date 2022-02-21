package com.spring.player.dao;

import com.spring.player.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerDAO extends JpaRepository<Player, Integer> {

   //  Player getPlayer(int id);

   //  List<Player> getPlayers();

   //  int removePlayer(int id);

   //  void addPlayer(Player player);
}
//------------------------------
/*
* Get http://localhost:9090/players
* Get http://localhost:9090/players/id
* post http://localhost:9090/players      player obj in body without id
* put http://localhost:9090/players/id       player obj in body without id or with same id in url
* delete http://localhost:9090/players/id
*
* */