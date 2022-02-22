package com.spring.player.controller;

import com.spring.player.model.Player;
import com.spring.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("players")
    public String getPlayers(Model model){
        model.addAttribute("players", playerService.allPlayers());
        return "home";
    }

    @GetMapping("player-form")
    public String addPlayer( ){
        return "playerform";
    }

}
