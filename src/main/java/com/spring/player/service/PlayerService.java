package com.spring.player.service;

import com.spring.player.model.Player;

import java.util.List;

public interface PlayerService {

    Player showPlayer(int id);

    List<Player> allPlayers();

    int deletePlayer(int id);

    void savePlayer(Player player);

}
