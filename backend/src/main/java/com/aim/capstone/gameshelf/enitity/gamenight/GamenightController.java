package com.aim.capstone.gameshelf.enitity.gamenight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/gamenight")
public class GamenightController {
    @Autowired
    private GamenightRepository gamenightRepository;

    @PostMapping(path = "/")
    public Gamenight getGame(@RequestBody Gamenight game) {
        return gamenightRepository.save(game);
    }

    @DeleteMapping(path = "")
    public @ResponseBody String deleteGamenight(@PathVariable(value = "id") Integer id) {
        gamenightRepository.deleteById(id);
        return "Deleted";
    }
}
