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
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "game_id")

    private Integer id;

    @Column
    private String title;
    private int player_min;
    private int player_max;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private Playtype playtype;

    public Game() {

    }

    public Game(int id, String title,  int player_min, int player_max) {
        this.id = id;
        this.title = title;
        this.player_min = player_min;
        this.player_max = player_max;
    }

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

    public int getPlayer_min() {
        return player_min;
    }

    public void setPlayer_min(int player_min) {
        this.player_min = player_min;
    }

    public int getPlayer_max() {
        return player_max;
    }

    public void setPlayer_max(int player_max) {
        this.player_max = player_max;
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
