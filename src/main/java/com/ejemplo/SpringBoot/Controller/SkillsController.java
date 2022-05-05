
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Skills;
import com.ejemplo.SpringBoot.service.ISkillsService;
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
public class SkillsController {    
    
    @Autowired
    private ISkillsService skillServ;    
    
    @GetMapping("/skills")
    @ResponseBody
    public List<Skills> verSkills(){
        return skillServ.verSkills();
    }
    
    @DeleteMapping("/skills/{id}")
    public void eliminarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);
    }
    
    @PostMapping ("/skills")
    public void crearSkill (@RequestBody Skills skill){
        skillServ.crearSkill(skill);
    }                    
            
    @PutMapping("/skills/{id}")
    public void modificarSkill(@RequestBody Skills skill){
        skillServ.modificarSkill(skill);
    }
    
    
    
    
}
