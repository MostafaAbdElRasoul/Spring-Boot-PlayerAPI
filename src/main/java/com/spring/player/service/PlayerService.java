package com.spring.player.service;

import com.spring.player.dao.PlayerDAO;
import com.spring.player.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

        private PlayerDAO playerDAO;

    @Autowired
    public PlayerService(PlayerDAO playerDAO) {
        this.playerDAO = playerDAO;
    }


    public Player showPlayer(int id) {
        return playerDAO.findById(id).get();
    }


    public List<Player> allPlayers() {
        return playerDAO.findAll();
    }


    public void deletePlayer(int id) {
         playerDAO.deleteById(id);
    }


    public void savePlayer(Player player) {
        playerDAO.save(player);
    }
}
