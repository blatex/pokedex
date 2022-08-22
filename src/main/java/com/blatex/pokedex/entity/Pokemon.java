package com.blatex.pokedex.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Pokemon {

    @Id
    @Column(name = "pokemon_number")
    private Integer number;

    @Column(name = "pokemon_name")
    private String name;

    @Column(name = "pokemon_type")
    private String type;

    @Column(name = "pokemon_image_name")
    private String imageName;

}
