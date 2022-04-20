
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.service.IPersonaService;
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
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;     
    
    @PostMapping ("/persona")
    public void agregarPersona (@RequestBody Persona pers){
       persoServ.crearPersona(pers);
    }     
    
    @GetMapping ("/persona")
    @ResponseBody
    public List<Persona> verPersonas (){       
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/persona/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);    
    }  
   
    @GetMapping ("/persona/{id}")
    @ResponseBody
    public Persona obtenerPersona (@PathVariable Long id){
    return persoServ.buscarPersona(id);
    }
    
    
   @PutMapping("/persona") 
   public void modificarPersona (@RequestBody Persona persona){
       persoServ.modificarPersona(persona);
   }
    
    

    
}
