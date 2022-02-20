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
