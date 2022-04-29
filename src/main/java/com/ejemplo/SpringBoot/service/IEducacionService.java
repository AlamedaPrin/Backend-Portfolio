
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> verEducacion();     
    
    public void crearEducacion (Educacion educacion);
    
    public void borrarEducacion (Long id);     
    
    public void modificarEducacion (Educacion educacion);  

    
    
    
    
}
