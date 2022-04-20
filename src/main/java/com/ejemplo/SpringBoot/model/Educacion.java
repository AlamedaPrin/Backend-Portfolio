
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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String school;
    String img;
    String career;
    String comienzo;
    String fin;
    Long idPersona;

    public Educacion() {
    }

    public Educacion(Long id, String school, String img, String career, String comienzo, String fin, Long idPersona) {
        this.id = id;
        this.school = school;
        this.img = img;
        this.career = career;
        this.comienzo = comienzo;
        this.fin = fin;
        this.idPersona = idPersona;
    }
    
    
    
    
}
