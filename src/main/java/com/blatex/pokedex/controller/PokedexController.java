package com.blatex.pokedex.controller;

import com.blatex.pokedex.entity.Pokemon;
import com.blatex.pokedex.repository.PokedexReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokedex")
public class PokedexController {

    @Autowired
    private PokedexReadRepository pokedexReadRepository;

    @GetMapping("/all")
    public List<Pokemon> getAllPokemon(){
        return pokedexReadRepository.findAll();
    }

}
