package com.raz.portfolio_backend.service;

import com.raz.portfolio_backend.dto.ContactMessageRequest;
import com.raz.portfolio_backend.entity.ContactMessage;
import com.raz.portfolio_backend.exception.ResourceNotFoundException;
import com.raz.portfolio_backend.repository.ContactMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactMessageService {

    private final ContactMessageRepository contactMessageRepository;

    public Long createMessage(ContactMessageRequest request) {

        ContactMessage message = ContactMessage.builder()
                .name(request.getName())
                .email(request.getEmail())
                .subject(request.getSubject())
                .message(request.getMessage())
                .receivedAt(LocalDateTime.now())
                .build();

        ContactMessage save = contactMessageRepository.save(message);
        return save.getId();
    }

    public List<ContactMessage> getAllMessages() {
        return contactMessageRepository.findAll();
    }

    public Optional<ContactMessage> getMessageById(Long id) {
        return contactMessageRepository.findById(id);
    }

    public void deleteMessage(Long id) {
        ContactMessage message = contactMessageRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Message not found with id: " + id));

        contactMessageRepository.delete(message);
    }
}
