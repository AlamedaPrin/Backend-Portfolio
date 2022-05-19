
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.AcercaDe;
import com.ejemplo.SpringBoot.service.IAcercaDeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin (origins = {"https://front-porfolio.web.app/"})
@RestController
public class AcercaDeController {
    
    @Autowired
    private IAcercaDeService acercaServ;    
    
    @PostMapping ("/acerca")
    public void agregarAcercaDe (@RequestBody AcercaDe acer) {
        acercaServ.crearAcercaDe(acer);
    }
    
    @GetMapping ("/acerca")
    @ResponseBody
    public List <AcercaDe> verAcerca(){
     return acercaServ.verAcercaDe();
    }    
    
    @DeleteMapping ("/acerca/{id}")
    public void borrarAcerca (@PathVariable Long id){
      acercaServ.borrarAcercaDe(id);
    }    
    
    @GetMapping ("/acerca/{id}")
    @ResponseBody
    public AcercaDe obtenerAcercaDe (@PathVariable Long id){
       return acercaServ.buscarAcercaDe(id);
    }
    
    @PutMapping ("/acerca")
    public void modificarAcercaDe (@RequestBody AcercaDe acercade){
        acercaServ.modificarAcercaDe(acercade);
    }
    
    
    
}
