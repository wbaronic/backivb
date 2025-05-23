package com.ivb.englishApp.domain;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestaoService {

    private final QuestaoRepository repository;

    public QuestaoService(QuestaoRepository repository) {
        this.repository = repository;
    }

    public List<QuestaoDTO> getAll() {
        return repository.findAll().stream()
                .map(QuestaoDTO::new)
                .collect(Collectors.toList());
    }
}

