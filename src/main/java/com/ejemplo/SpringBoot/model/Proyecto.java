
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
public class Proyecto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String proyecto;
    Long idPersona; 

    public Proyecto() {
    }

    public Proyecto(Long id, String proyecto, Long idPersona) {
        this.id = id;
        this.proyecto = proyecto;
        this.idPersona = idPersona;
    }

    
    
    
    
    
    
}
