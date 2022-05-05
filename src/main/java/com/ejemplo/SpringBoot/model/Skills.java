
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
public class Skills {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id; 
    @Basic
    String tipoDeSkill;
    Number score;

    public Skills() {
    }

    public Skills(Long id, String tipoDeSkill, Number score) {
        this.id = id;
        this.tipoDeSkill = tipoDeSkill;
        this.score = score;
    }
    
    
    
}