package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.Arrays;

public class Opponent {
    String name;
    Pokemon[] pokemons;
    Texture[] sprites;

    public Opponent(String name, Pokemon[] pokemons) {
        this.name = name;
        this.pokemons = pokemons;
        this.sprites = new Texture[] {};
    }
}
