
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.AcercaDe;
import java.util.List;


public interface IAcercaDeService {
    
    public List<AcercaDe> verAcercaDe();
    
    public void crearAcercaDe (AcercaDe acerDe);
    
    public void borrarAcercaDe (Long id);
    
    public AcercaDe buscarAcercaDe (Long id);
    
    public void modificarAcercaDe (AcercaDe acercade);
    
}
