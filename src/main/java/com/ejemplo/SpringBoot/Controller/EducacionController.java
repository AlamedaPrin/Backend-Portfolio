
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.service.IEducacionService;
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

@CrossOrigin (origins = {"http://localhost:4200"})
@RestController
public class EducacionController {    
    
    @Autowired
    private IEducacionService eduServ;     
    
    @GetMapping ("/educacion")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return eduServ.verEducacion();
    }
    
    @GetMapping ("/educacion/{idPersona}")
    public List<Educacion> listarEducacionPorIdPersona(@PathVariable Long idPersona){
        return eduServ.listarEducacionPorIdPersona(idPersona);
    }
    
    @DeleteMapping ("/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
     eduServ.borrarEducacion(id);
    }  
    
    @PostMapping("/educacion")
    public void crearEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    
    @GetMapping ("/educacion/{id}")
    @ResponseBody
    public Educacion obtenerEducacion (@PathVariable Long id){
      return eduServ.buscarEducacion(id);
    }
    
    @PutMapping("/educacion")
    public void modificarEducacion (@RequestBody Educacion educacion){
        eduServ.modificarEducacion(educacion);
    }
            
 
    
}
