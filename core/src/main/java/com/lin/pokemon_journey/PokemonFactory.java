package com.lin.pokemon_journey;

import java.awt.image.BufferedImage;

public class PokemonFactory {
    public static Pokemon createPokemon(String pokemonName) {
        switch (pokemonName) {
            case "Charizard":
                return Charizard();
            default:
                throw new IllegalArgumentException("Unknown Pokemon: " + pokemonName);
        }
    }

    private static Pokemon Charizard() {
        return new Pokemon(
            6,
            "Charizard",
            new String[]{"Fire", "Flying"},
            Main.pokemonSpriteExtractor.extractSprite(6),
            78, 84, 78, 109, 85, 100,
            new Ability[]{}
        );
    }
}
