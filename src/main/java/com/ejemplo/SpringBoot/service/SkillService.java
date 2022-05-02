
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Skill;
import com.ejemplo.SpringBoot.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {
    
    @Autowired
    public SkillRepository skillRepo;

    @Override
    public List<Skill> verSkills() {
      return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
       skillRepo.deleteById(id);
    }

    @Override
    public void modificarSkill(Skill skill) {
        skillRepo.save(skill);
    }
    
}
