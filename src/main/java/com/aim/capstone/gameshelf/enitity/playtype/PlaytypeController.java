package com.aim.capstone.gameshelf.enitity.playtype;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/api/playtype")
public class PlaytypeController {
    @Autowired
    private PlaytypeRepository playtypeRepository;

    @GetMapping(path = "")
    public Iterable<Playtype> getAllPlaytype() {
        return playtypeRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Playtype getPlaytype(@PathVariable(value = "id") Integer id) {
        Optional<Playtype> playtype = playtypeRepository.findById(id);
        return playtype.get();
    }

}
