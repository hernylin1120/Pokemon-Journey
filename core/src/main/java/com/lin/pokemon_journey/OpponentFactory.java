package com.lin.pokemon_journey;

public class OpponentFactory {
    public static Opponent Cynthia() {
        Pokemon[] cynthiaPokemons = {
            PokemonFactory.createPokemon("Spiritomb"),
        };
        return new Opponent("Cynthia", cynthiaPokemons);
    }
}
