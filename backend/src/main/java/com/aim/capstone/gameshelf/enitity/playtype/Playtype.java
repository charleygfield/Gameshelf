package com.aim.capstone.gameshelf.enitity.playtype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playtype")
public class Playtype {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "type_id")

    private Integer type_id;
    private String playtype;

    public Playtype() {

    }

    public Playtype(Integer type_id, String playtype){
        this.type_id = type_id;
        this.playtype = playtype;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getPlaytype() {
        return playtype;
    }

    public void setPlaytype(String playtype) {
        this.playtype = playtype;
    }
}
