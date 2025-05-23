package com.ivb.englishApp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivb.englishApp.domain.Message;
import com.ivb.englishApp.domain.PhraseService;
import com.ivb.englishApp.dto.PhraseDTO;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/phrases")
public class PhraseController {

    private final PhraseService service;

    public PhraseController(PhraseService service) {
        this.service = service;
    }

    @GetMapping
    public List<PhraseDTO> getAllPhrases() {
        return service.getAllPhrases();
    }
}
