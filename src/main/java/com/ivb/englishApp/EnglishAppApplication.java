package com.ivb.englishApp;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ivb.englishApp.domain.PhraseExplanation;
import com.ivb.englishApp.domain.ExplanationRepository;
import com.ivb.englishApp.domain.Phrase;
import com.ivb.englishApp.domain.PhraseRepository;
import com.ivb.englishApp.domain.Questao;
import com.ivb.englishApp.domain.QuestaoRepository;

@SpringBootApplication
public class EnglishAppApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(EnglishAppApplication.class);

	@Autowired
	private PhraseRepository phraseRepository;

	@Autowired
	private QuestaoRepository questaoRepository;

	@Autowired
	private ExplanationRepository explanationRepository;

	public static void main(String[] args) {
		SpringApplication.run(EnglishAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Questao questao = new Questao("oi","a","b","c");
		
		questaoRepository.save(questao);
		
		Phrase phrase0 =new Phrase("Hi",1,1);
		phraseRepository.save(phrase0);
		Phrase phrase1 =new Phrase("Hello",1,1);
		phraseRepository.save(phrase1);
		Phrase phrase2 =new Phrase("God Bless you",1,1);
		phraseRepository.save(phrase2);
		
		
		PhraseExplanation explanation = new PhraseExplanation(phrase0,1,"para se apresentar","olá","");
		PhraseExplanation explanation2 = new PhraseExplanation(phrase0,2,"hablando espanhol","olá espanhol","");
		
		
		explanationRepository.saveAll(Arrays.asList(explanation,explanation2));

		
		   for (Phrase phrase : phraseRepository.findAll()) {
	            logger.info(phrase.getDescription() + "" + phrase.getId());
	        }



		
		
	}

}
