package com.raz.portfolio_backend.service;

import com.raz.portfolio_backend.dto.ProfileRequest;
import com.raz.portfolio_backend.entity.Profile;
import com.raz.portfolio_backend.exception.ResourceNotFoundException;
import com.raz.portfolio_backend.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;

    public Long createProfile(ProfileRequest request) {
       Profile profile = Profile.builder()
                .name(request.getName())
                .role(request.getRole())
                .bio(request.getBio())
                .email(request.getEmail())
                .phone(request.getPhone())
                .linkedinUrl(request.getLinkedinUrl())
                .githubUrl(request.getGithubUrl())
                .build();
        Profile save = profileRepository.save(profile);
        return save.getId();
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public Optional<Profile> getProfileById(Long id) {
        return profileRepository.findById(id);
    }

    public Long updateProfile(Long id, ProfileRequest request) {
        Profile profile = profileRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Profile not found with id: " + id));

        profile.setName(request.getName());
        profile.setRole(request.getRole());
        profile.setBio(request.getBio());
        profile.setEmail(request.getEmail());
        profile.setPhone(request.getPhone());
        profile.setLinkedinUrl(request.getLinkedinUrl());
        profile.setGithubUrl(request.getGithubUrl());
        Profile save = profileRepository.save(profile);
        return save.getId();
    }

    public void deleteProfile(Long id) {
        Profile profile = profileRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Profile not found with id: " + id));
        profileRepository.delete(profile);
    }
}
