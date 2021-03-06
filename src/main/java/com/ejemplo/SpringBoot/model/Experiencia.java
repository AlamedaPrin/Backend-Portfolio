
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
public class Experiencia {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String tipoDeExperiencia;    
    

    public Experiencia() {
    }

    public Experiencia(Long id, String tipoDeExperiencia) {
        this.id = id;
        this.tipoDeExperiencia = tipoDeExperiencia;
    }

    

   
    
    
    
}
