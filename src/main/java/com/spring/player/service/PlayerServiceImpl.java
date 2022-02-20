package com.spring.player.service;

import com.spring.player.dao.PlayerDAO;
import com.spring.player.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlayerServiceImpl implements PlaerService{

    @Autowired
    private PlayerDAO playerDAO;

    public PlayerServiceImpl() {
    }

    @Override
    public Player showPlayer(int id) {
        return playerDAO.getPlayer(id);
    }

    @Override
    public List<Player> allPlayers() {
        return playerDAO.getPlayers();
    }

    @Override
    public int deletePlayer(int id) {
        return playerDAO.removePlayer(id);
    }

    @Override
    public void savePlayer(Player player) {
        playerDAO.addPlayer(player);
    }
}
