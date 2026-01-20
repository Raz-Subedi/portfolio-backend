package com.raz.portfolio_backend.service;

import com.raz.portfolio_backend.dto.SkillRequest;
import com.raz.portfolio_backend.entity.Skill;
import com.raz.portfolio_backend.exception.ResourceNotFoundException;
import com.raz.portfolio_backend.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository skillRepository;

    public Long createSkill(SkillRequest request) {
        Skill skill = Skill.builder()
                .name(request.getName())
                .type(request.getType())
                .proficiency(request.getProficiency())
                .build();

        Skill save = skillRepository.save(skill);
        return save.getId();
    }

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public Optional<Skill> getSkillById(Long id) {
        return skillRepository.findById(id);
    }

    public Long updateSkill(Long id, SkillRequest request) {
        Skill skill = skillRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Skill not found with id: " + id));

        skill.setName(request.getName());
        skill.setType(request.getType());
        skill.setProficiency(request.getProficiency());

        Skill save = skillRepository.save(skill);
        return save.getId();
    }

    public void deleteSkill(Long id) {
        Skill skill = skillRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Skill not found with id: " + id));

        skillRepository.delete(skill);
    }
}
