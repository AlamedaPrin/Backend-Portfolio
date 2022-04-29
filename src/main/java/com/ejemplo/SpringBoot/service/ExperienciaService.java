
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    
    @Autowired
    public ExperienciaRepository expReposi;

    @Override
    public List<Experiencia> verExperiencias() {
        return expReposi.findAll();
    }

    @Override
    public void crearExperiecia(Experiencia exp) {
        expReposi.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expReposi.deleteById(id);
    }   

    @Override
    public void modificarExperiencia(Experiencia experiencia) {
        expReposi.save(experiencia);
    }
    
    
    
    
    
}
