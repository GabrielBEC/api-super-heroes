package com.digitalinnovationone.heroesapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.digitalinnovationone.heroesapi.document.Heroes;
import com.digitalinnovationone.heroesapi.repository.HeroesRepository;

@Configuration
public class HeroesData implements CommandLineRunner {

	@Autowired
	private HeroesRepository heroesRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Heroes hero = new Heroes(null, "Mulher Maravilha", "DC comics", 3);
		Heroes hero2 = new Heroes(null, "Viuva Negra", "Marvels", 4);
		Heroes hero3 = new Heroes(null, "Capitã Marvel", "Marvel", 7);
		
		
		heroesRepository.saveAll(Arrays.asList(hero, hero2, hero3));
		
	}
	
	
	
}
