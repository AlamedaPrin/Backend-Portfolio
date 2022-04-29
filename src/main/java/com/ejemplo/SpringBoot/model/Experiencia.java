
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
    String experienciaUno;
    String experienciaDos;
    String experienciaTres;
    String experienciaCuatro;
    Long idPersona;

    public Experiencia() {
    }

    public Experiencia(Long id, String experienciaUno, String experienciaDos, String experienciaTres, String experienciaCuatro, Long idPersona) {
        this.id = id;
        this.experienciaUno = experienciaUno;
        this.experienciaDos = experienciaDos;
        this.experienciaTres = experienciaTres;
        this.experienciaCuatro = experienciaCuatro;
        this.idPersona = idPersona;
    }

   
    
    
    
}
