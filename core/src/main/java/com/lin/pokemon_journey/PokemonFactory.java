package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

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
            false,
            new String[]{"Fire", "Flying"},
            new Texture[] {
                new Texture("Gen1_Pokemon/Charizard_Front1.png"),
            },
            78, 84, 78, 109, 85, 100,
            new Ability[]{}
        );
    }
}
