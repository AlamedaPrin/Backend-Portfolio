
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

    @Override
    public List<Educacion> verEducacion() {
        return eduReposi.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduReposi.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduReposi.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduReposi.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion educacion) {
        eduReposi.save(educacion);
    }    
   
    @Override
    public List<Educacion> listarEducacionPorIdPersona(Long idPersona) {
        return eduReposi.findByIdPersona(idPersona);
    }  

  

   
    
    
    
    
}
