package com.spring.player.service;

import com.spring.player.dao.PlayerDAO;
import com.spring.player.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService{

    private PlayerDAO playerDAO;

    @Autowired
    public PlayerServiceImpl(PlayerDAO playerDAO) {
        this.playerDAO = playerDAO;
    }

    @Override
    public Player showPlayer(int id) {
        return playerDAO.findById(id).get();
    }

    @Override
    public List<Player> allPlayers() {
        return playerDAO.findAll();
    }

    @Override
    public void deletePlayer(int id) {
         playerDAO.deleteById(id);
    }

    @Override
    public void savePlayer(Player player) {
        playerDAO.save(player);
    }
}
