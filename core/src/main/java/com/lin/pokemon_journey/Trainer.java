package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

public class Trainer {
    String name;
    Pokemon[] pokemons;
    Texture[] sprites;
    int PokemonAvailable;
    public Trainer(String name, Pokemon[] pokemons, Texture[] sprites) {
        this.name = name;
        this.pokemons = pokemons;
        this.sprites = sprites;
        this.PokemonAvailable = pokemons.length;
    }

    public void nextMove(Pokemon currentPokemon, Pokemon opponent) {

    }
}
