
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Skills;
import java.util.List;


public interface ISkillsService {
    
    public List <Skills> verSkills();
    
    public void crearSkill (Skills skill);
    
    public void borrarSkill (Long id);
    
    public void modificarSkill (Skills skill);
    
}
