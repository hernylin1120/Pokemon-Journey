package com.lin.pokemon_journey;

public class WildPokemon extends Opponent {
    Pokemon pokemon;
    public WildPokemon(Pokemon pokemon) {
        super("Wild " + pokemon.name);
        this.pokemon = pokemon;
    }
}
