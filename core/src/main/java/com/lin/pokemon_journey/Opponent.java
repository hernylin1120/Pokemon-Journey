package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.Arrays;

public class Opponent {
    String name;
    Pokemon[] pokemons;
    Texture[] sprites;
    int PokemonAvailable;
    public Opponent(String name, Pokemon[] pokemons) {
        this.name = name;
        this.pokemons = pokemons;
        this.sprites = new Texture[] {};
        this.PokemonAvailable = pokemons.length;
    }
}
