package com.aim.capstone.gameshelf.enitity.person;

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
@RequestMapping(path = "/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Person> getAllPerson() {
        return personRepository.findAll();
    }
    
    @GetMapping(path = "/{id}")
    public @ResponseBody Person getPerson(@PathVariable(value = "id") Integer id) {
        Optional<Person> person = personRepository.findById(id);
        return person.get();
    }

    @PostMapping(path = "/")
    public @ResponseBody String createPerson(@RequestBody Person person) {
        personRepository.save(person);
        return "Saved";
    }

    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deletePerson(@PathVariable(value = "id") Integer id) {
        personRepository.deleteById(id);
        return "Deleted";
    }
}
