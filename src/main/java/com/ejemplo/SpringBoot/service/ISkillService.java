
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Skill;
import java.util.List;


public interface ISkillService {
    
    public List<Skill> verSkills();
    
    public void crearSkill (Skill skill);
    
    public void borrarSkill (Long id);
    
    public void modificarSkill (Skill skill);
    
}
