package com.aim.capstone.gameshelf.enitity.game;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
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
    public Game createGame(@RequestBody Game game) {
        return gameRepository.save(game);
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateGame(@PathVariable(value = "id") Integer id, @RequestBody Game gameDetails) {

        Optional<Game> optionalGame = gameRepository.findById(id);
        Game game = optionalGame.get();

        game.setTitle(gameDetails.getTitle());
        game.setPlayer_min(gameDetails.getPlayer_min());
        game.setPlayer_max(gameDetails.getPlayer_max());
        game.setPerson(gameDetails.getPerson());
        game.setPlaytype(gameDetails.getPlaytype());

        gameRepository.save(gameDetails);
        return "Updated";
    }

    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteGame(@PathVariable(value = "id") Integer id) {
        gameRepository.deleteById(id);
        return "Deleted";
    }
}