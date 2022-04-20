
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.AcercaDe;
import com.ejemplo.SpringBoot.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService implements IAcercaDeService {
    
    @Autowired
    public AcercaDeRepository acerReposi;

    @Override
    public List<AcercaDe> verAcercaDe() {
        return acerReposi.findAll();
    }

    @Override
    public void crearAcercaDe(AcercaDe acerDe) {
        acerReposi.save(acerDe);
    }

    @Override
    public void borrarAcercaDe(Long id) {
        acerReposi.deleteById(id);
    }

    @Override
    public AcercaDe buscarAcercaDe(Long id) {
        return acerReposi.findById(id).orElse(null);
    }

    @Override
    public void modificarAcercaDe(AcercaDe acercade) {
        acerReposi.save(acercade);
    }
    
    
    
    
    
}
