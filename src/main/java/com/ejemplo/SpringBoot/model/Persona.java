
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
public class Persona {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)       
    Long id;
    @Basic
    String ubication;
    String position;
    String url;
    String fullName;

    public Persona() {
    }

    public Persona(Long id, String ubication, String position, String url, String fullName) {
        this.id = id;
        this.ubication = ubication;
        this.position = position;
        this.url = url;
        this.fullName = fullName;
    }

   
    
    
    
}
