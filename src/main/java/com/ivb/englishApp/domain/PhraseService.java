package com.ivb.englishApp.domain;

import org.springframework.stereotype.Service;

import com.ivb.englishApp.dto.PhraseDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhraseService {

    private final PhraseRepository repository;

    public PhraseService(PhraseRepository repository) {
        this.repository = repository;
    }

    public List<PhraseDTO> getAllPhrases() {
        return repository.findAll().stream()
                .map(PhraseDTO::new)
                .collect(Collectors.toList());
    }
}

