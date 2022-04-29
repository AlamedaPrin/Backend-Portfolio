
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
public class AcercaDe {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Basic
    String acerca;
    Long idPersona; 

    public AcercaDe() {
    }

    public AcercaDe(Long id, String acerca, Long idPersona) {
        this.id = id;
        this.acerca = acerca;
        this.idPersona = idPersona;
    }

    

   
    
    
    
}
