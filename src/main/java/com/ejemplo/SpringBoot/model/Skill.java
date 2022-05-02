
package com.ejemplo.SpringBoot.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id; 
    @Basic
    String tipoDeSkill;
    int score;

    public Skill() {
    }

    public Skill(Long id, String tipoDeSkill, int score) {
        this.id = id;
        this.tipoDeSkill = tipoDeSkill;
        this.score = score;
    }
    
    
    
}
