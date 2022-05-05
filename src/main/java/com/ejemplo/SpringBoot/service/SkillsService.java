
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Skills;
import com.ejemplo.SpringBoot.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    
    @Autowired
    public SkillsRepository skillRepo;

    @Override
    public List<Skills> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public void modificarSkill(Skills skill) {
        skillRepo.save(skill);
    }
    
}
