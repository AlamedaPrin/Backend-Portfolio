
package com.ejemplo.SpringBoot.Controller;

import com.ejemplo.SpringBoot.model.Skill;
import com.ejemplo.SpringBoot.service.SkillService;
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
public class SkillController {
    
    @Autowired
    private SkillService skillServ;
    
    
    @GetMapping ("/skill")
    @ResponseBody
    public List<Skill> verSkills(){
     return skillServ.verSkills();
    }
    
    @DeleteMapping ("/skill/{id}")
    public void eliminarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);
    } 
    
    @PostMapping ("/skill")
    public void crearSkill(@RequestBody Skill skill){
        skillServ.crearSkill(skill);
    }
    
    @PutMapping("/skill/{id}")
    public void modificarSkill (@RequestBody Skill skill){
        skillServ.modificarSkill(skill);
    }
    
    
    
}
