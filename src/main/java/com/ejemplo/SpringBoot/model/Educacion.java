
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
    String career;
    String school;
    String comienzo;
    String fin;
    String imgEdu;
    

    public Educacion() {
    }

    public Educacion(Long id, String career, String school, String comienzo, String fin, String imgEdu) {
        this.id = id;
        this.career = career;
        this.school = school;
        this.comienzo = comienzo;
        this.fin = fin;
        this.imgEdu = imgEdu;
    }

    
    }
    
    
    
    
