package com.aim.capstone.gameshelf.enitity.gamenight;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/gamenight")
public class GamenightController {
    @Autowired
    private GamenightRepository gamenightRepository;

    @GetMapping(path = "/{id}")
    public @ResponseBody Gamenight getGamenight(@PathVariable(value = "id") Integer id) {
        Optional<Gamenight> game = gamenightRepository.findById(id);
        return game.get();
    }

    @DeleteMapping(path = "")
    public @ResponseBody String deleteGamenight(@PathVariable(value = "id") Integer id) {
        gamenightRepository.deleteById(id);
        return "Deleted";
    }
}
