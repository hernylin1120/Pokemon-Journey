package com.lin.pokemon_journey;

import java.util.Arrays;

public class OpponentFactory {
    public static Opponent Cynthia() {
        Pokemon[] cynthiaPokemons = {
            PokemonFactory.createPokemon("Spiritomb"),
        };
        cynthiaPokemons[0].setLevel(50);
        return new Opponent("Cynthia", cynthiaPokemons);
    }
}
