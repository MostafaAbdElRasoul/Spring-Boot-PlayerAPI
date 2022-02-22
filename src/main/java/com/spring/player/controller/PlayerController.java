package com.spring.player.controller;

import com.spring.player.model.Player;
import com.spring.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/player")
    public Player getPlayer(@RequestParam String name){
        return playerService.getPlayerByName(name);
    }
    @GetMapping("/test")
    public String test(){
        return "Test";
    }

    @GetMapping("/playercont")
    public List<Player> getPlayerCont(@RequestParam String name){
        return playerService.getPlayersByNameContaining(name);
    }
}
