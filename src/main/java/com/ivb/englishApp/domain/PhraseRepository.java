package com.ivb.englishApp.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PhraseRepository extends JpaRepository<Phrase, Long> {
	
	List<Phrase> findByCategoryId(int category);

}
