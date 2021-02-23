package com.aim.capstone.gameshelf.enitity.game;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/game")
public class GameController {
    @Autowired
    private GameRepository gameRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Game> getAllGame() {
        return gameRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Game getGame(@PathVariable(value = "id") Integer id) {
        Optional<Game> game =gameRepository.findById(id);
        return game.get();
    }

    @PostMapping(path = "/")
    public @ResponseBody String createGame(@RequestBody Game game) {
        gameRepository.save(game);
        return "Saved";
    }

    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteGame(@PathVariable(value = "id") Integer id) {
        gameRepository.deleteById(id);
        return "Deleted";
    }
}