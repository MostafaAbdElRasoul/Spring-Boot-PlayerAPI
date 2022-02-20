package com.spring.player.dao;

import com.spring.player.model.Player;

import java.util.List;

public interface PlayerDAO {

     Player getPlayer(int id);

     List<Player> getPlayers();

     int removePlayer(int id);

     void addPlayer(Player player);
}
