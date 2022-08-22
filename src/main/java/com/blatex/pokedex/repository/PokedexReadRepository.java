package com.blatex.pokedex.repository;

import com.blatex.pokedex.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokedexReadRepository extends JpaRepository<Pokemon, Integer> {
    Pokemon findByNumber(Integer number);
}
