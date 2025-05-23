package com.ivb.englishApp.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuestaoRepository extends JpaRepository<Questao, Long>{

}
