package com.spring.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.player.model.Player;
import com.spring.player.service.PlayerService;

import java.util.List;

// http://localhost:9090/
@RestController
@RequestMapping("/api")
// http://localhost:9090/api
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    // http://localhost:9090/api/players
    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerService.allPlayers();
    }

    // http://localhost:9090/api/player?id=1
    @GetMapping("/player")
    public Player getPlayer(@RequestParam int id) {
        Player player = playerService.showPlayer(id);
        if (player == null) {
            throw new RuntimeException("Player not found of id : " + id);
        }
        return player;
    }

    // http://localhost:9090/api/player/1
    @GetMapping("/player/{id}")
    public Player getPlayerWithPathVar(@PathVariable("id") int id) {
        Player player = playerService.showPlayer(id);
        if (player == null) {
            throw new RuntimeException("Player not found of id : " + id);
        }
        return player;
    }

    // http://localhost:9090/api/players post method
    @PostMapping("/players")
    public Player createPlayer(@RequestBody Player player) {
        playerService.savePlayer(player);
        return player;
    }

    // http://localhost:9090/api/players put method
    @PutMapping("/players")
    public String editPlayer(@RequestBody Player player) {
        playerService.savePlayer(player);
        return "success editting";
    }

    // http://localhost:9090/api/player/1
    @DeleteMapping("/player/{id}")
    public String deletePlayerWithPathVar(@PathVariable("id") int id) {
        int result = playerService.deletePlayer(id);
        if(result == 0) {
            throw new RuntimeException("Player not found of id : " + id);
        }
        return "Success Deleting";
    }
}
