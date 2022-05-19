
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.service.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping("/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia experiencia){
        expServ.crearExperiecia(experiencia);
    }
    
    @GetMapping("/experiencia")
    @ResponseBody
    public List <Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }    
    
    @DeleteMapping ("/experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id){
     expServ.borrarExperiencia(id);
    }
   
   // @GetMapping ("/experiencia/{id}")
   // @ResponseBody
   // public Experiencia obtenerExperiencia (@PathVariable Long id){
   //   return expServ.buscarExperiencia(id);
   // } 
   
    @PutMapping ("/experiencia/{id}")
    public void modificarExperiencia (@RequestBody Experiencia experiencia){
        expServ.modificarExperiencia(experiencia);
    }
    
    
}
