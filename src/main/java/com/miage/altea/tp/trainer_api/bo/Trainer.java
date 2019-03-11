package com.miage.altea.tp.trainer_api.bo;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
public class Trainer {


    @Id
    private String name;

    @OneToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Pokemon> team;

    @Column
    private String password;

    public Trainer() {
    }

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getTeam() {
        return team;
    }

    public void setTeam(List<Pokemon> team) {
        this.team = team;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
