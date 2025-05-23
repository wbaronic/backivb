package com.ivb.englishApp.domain;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/questoes")
public class QuestaoController {

    private final QuestaoService service;

    public QuestaoController(QuestaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<QuestaoDTO> listar() {
        return service.getAll();
    }
}

