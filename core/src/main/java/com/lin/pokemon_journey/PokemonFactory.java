package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.awt.image.BufferedImage;

public class PokemonFactory {
    public static Pokemon createPokemon(String pokemonName) {
        switch (pokemonName) {
            //Gen1 Pokemon
            case "Charmander":
                return Charmander();
            case "Charizard":
                return Charizard();

            //Gen4 Pokemon
            case "Spiritomb":
                return Spiritomb();
            default:
                throw new IllegalArgumentException("Unknown Pokemon: " + pokemonName);
        }
    }

    // Gen1 Pokemon
    private static Pokemon Charmander() {
        return new Pokemon(
            4,
            "Charmander",
            false,
            new String[] {"Fire"},
            new Texture[] {
                new Texture("Gen1_Pokemon/Charmander_Front1.png"),
                new Texture("Gen1_Pokemon/Charmander_Front2.png"),
                new Texture("Gen1_Pokemon/Charmander_Back1.png"),
                new Texture("Gen1_Pokemon/Charmander_Back2.png"),
            },
            39, 52, 43, 60, 50, 65
        );
    }
    private static Pokemon Charizard() {
        return new Pokemon(
            6,
            "Charizard",
            false,
            new String[] {"Fire", "Flying"},
            new Texture[] {
                new Texture("Gen1_Pokemon/Charizard_Front1.png"),
            },
            78, 84, 78, 109, 85, 100
        );
    }

    //Gen4 Pokemon
    private static Pokemon Spiritomb() {
        return new Pokemon(
            442,
            "Spiritomb",
            false,
            new String[] {"Ghost", "Dark"},
            new Texture[] {
                new Texture("Gen4_Pokemon/Spiritomb_Front1.png"),
            },
            50, 92, 108, 92, 108, 35
        );
    }
}
