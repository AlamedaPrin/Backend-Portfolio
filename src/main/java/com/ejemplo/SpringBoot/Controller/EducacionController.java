
package com.ejemplo.SpringBoot.Controller;
import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.service.EducacionService;
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
public class EducacionController {    
    
    @Autowired
    private EducacionService eduServ;      
    
    @GetMapping ("/educacion")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return eduServ.verEducacion();
    }    
    
    @DeleteMapping ("/educacion/{id}")
    public void eliminarEducacion(@PathVariable Long id){
     eduServ.borrarEducacion(id);
    }  
    
    @PostMapping("/educacion")
    public void crearEducacion (@RequestBody Educacion educacion){
        eduServ.crearEducacion(educacion);
    }     
    
    @PutMapping("/educacion/{id}")
    public void modificarEducacion (@RequestBody Educacion educacion){
        eduServ.modificarEducacion(educacion);
    }
            
 
    
}
