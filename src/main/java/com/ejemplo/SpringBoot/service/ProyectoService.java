
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proyReposi;

    @Override
    public List<Proyecto> verProyectos() {
        return proyReposi.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
        proyReposi.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyReposi.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proyReposi.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proyecto) {
        proyReposi.save(proyecto);
    }
    
    
    
    
    
}
