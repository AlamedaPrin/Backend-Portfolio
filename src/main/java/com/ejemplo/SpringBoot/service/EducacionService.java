
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository eduReposi;
    

    public List<Educacion> verEducacion() {
        return eduReposi.findAll();
    }
    
    
    public void crearEducacion(Educacion edu) {
        eduReposi.save(edu);
    }
    
    
    public void borrarEducacion(Long id) {
        eduReposi.deleteById(id);
    }  
    
    
    public void modificarEducacion(Educacion educacion) {
        eduReposi.save(educacion);
    }    
    

   
    

  

   
    
    
    
    
}
