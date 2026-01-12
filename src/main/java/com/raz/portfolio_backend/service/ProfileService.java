package com.raz.portfolio_backend.service;

import com.raz.portfolio_backend.entity.Profile;
import com.raz.portfolio_backend.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public Optional<Profile> getProfileById(Long id) {
        return profileRepository.findById(id);
    }

    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile updateProfile(Long id, Profile profileDetails) {
        Profile profile = profileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profile not found with id: " + id));

        profile.setName(profileDetails.getName());
        profile.setRole(profileDetails.getRole());
        profile.setBio(profileDetails.getBio());
        profile.setEmail(profileDetails.getEmail());
        profile.setPhone(profileDetails.getPhone());
        profile.setLinkedinUrl(profileDetails.getLinkedinUrl());
        profile.setGithubUrl(profileDetails.getGithubUrl());

        return profileRepository.save(profile);
    }

    public void deleteProfile(Long id) {
        Profile profile = profileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profile not found with id: " + id));
        profileRepository.delete(profile);
    }
}
