package com.digitalinnovationone.heroesapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalinnovationone.heroesapi.document.Heroes;

public interface HeroesRepository extends CrudRepository<Heroes, Integer>{

}
