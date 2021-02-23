package com.aim.capstone.gameshelf.enitity.gamenight;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.aim.capstone.gameshelf.enitity.game.Game;

@Entity
@Table(name = "gamenight")
public class Gamenight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "gamenight_id")

    private Integer gamenight_id;
    private Integer game_id;

    @OneToOne
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    public Integer getGamenight_id() {
        return gamenight_id;
    }

    public void setGamenight_id(Integer gamenight_id) {
        this.gamenight_id = gamenight_id;
    }

    public Integer getGame_id() {
        return game_id;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }
    
}
