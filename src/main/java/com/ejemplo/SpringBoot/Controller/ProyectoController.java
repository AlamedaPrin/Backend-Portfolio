
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyServ;    
    
    @PostMapping ("/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proyecto){
      proyServ.crearProyecto(proyecto);
    }
    
    @GetMapping("/proyecto")
    @ResponseBody
    public List<Proyecto> verProyectos(){
     return proyServ.verProyectos();
    }
    
    @DeleteMapping("/proyecto/{id}")
    public void borrarProyecto (@PathVariable Long id){
     proyServ.borrarProyecto(id);
    }
    
    
   // @GetMapping ("/proyecto/{id}")
   // @ResponseBody
   // public Proyecto obtenerProyecto (@PathVariable Long id){
   //    return proyServ.buscarProyecto(id);
   // }
    
    @PutMapping("/proyecto/{id}")
    public void modificarProyecto (@RequestBody Proyecto proyecto){
        proyServ.modificarProyecto(proyecto);
    }
    
    
    
}
