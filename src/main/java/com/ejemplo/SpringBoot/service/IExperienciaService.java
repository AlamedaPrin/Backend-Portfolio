
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias();
    
    public void crearExperiecia (Experiencia experiencia);
    
    public void borrarExperiencia (Long id);  
    
    
    public void modificarExperiencia (Experiencia experiencia);
    
    
}
