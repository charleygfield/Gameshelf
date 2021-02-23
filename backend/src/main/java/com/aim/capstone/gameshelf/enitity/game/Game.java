package com.aim.capstone.gameshelf.enitity.game;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aim.capstone.gameshelf.enitity.person.Person;
import com.aim.capstone.gameshelf.enitity.playtype.Playtype;

@Entity
@Table(name = "gameshelf")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "game_id")

    private Integer id;

    private String title;
    private Integer player_min;
    private Integer player_max;
    private Integer person_id;
    private Integer type_id;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private Playtype playtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPlayer_min() {
        return player_min;
    }

    public void setPlayer_min(Integer player_min) {
        this.player_min = player_min;
    }

    public Integer getPlayer_max() {
        return player_max;
    }

    public void setPlayer_max(Integer player_max) {
        this.player_max = player_max;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Playtype getPlaytype() {
        return playtype;
    }

    public void setPlaytype(Playtype playtype) {
        this.playtype = playtype;
    }
}
