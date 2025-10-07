package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;

public class PokemonFactory {
    private static final Map<String, Pokemon> pokemonMap = new HashMap<>();
    public static Pokemon createPokemon(String pokemonName) {
        if (pokemonMap.containsKey(pokemonName)) {
            return pokemonMap.get(pokemonName);
        }
        Pokemon pokemon;
        switch (pokemonName) {
            // Gen1 Pokemon
            case "Bulbasaur":
                pokemon = new Pokemon(
                    1,
                    "Bulbasaur",
                    false,
                    new String[] {"Grass", "Poison"},
                    new Texture[] {
//                new Texture("Gen1_Pokemon/Bulbasaur_Front1.png"),
//                new Texture("Gen1_Pokemon/Bulbasaur_Front2.png"),
//                new Texture("Gen1_Pokemon/Bulbasaur_Back1.png"),
//                new Texture("Gen1_Pokemon/Bulbasaur_Back2.png"),
                    },
                    45, 49, 49, 65, 65, 45
                );
                break;
            case "Ivysaur":
                pokemon = new Pokemon(
                    2,
                    "Ivysaur",
                    false,
                    new String[] {"Grass", "Poison"},
                    new Texture[] {
//                new Texture("Gen1_Pokemon/Ivysaur_Front1.png"),
//                new Texture("Gen1_Pokemon/Ivysaur_Front2.png"),
//                new Texture("Gen1_Pokemon/Ivysaur_Back1.png"),
//                new Texture("Gen1_Pokemon/Ivysaur_Back2.png"),
                    },
                    60, 62, 63, 80, 80, 60
                );
                break;
            case "Venusaur":
                pokemon = new Pokemon(
                    3,
                    "Venusaur",
                    true,
                    new String[] {"Grass", "Poison"},
                    new Texture[] {
//                new Texture("Gen1_Pokemon/Venusaur_Front1.png"),
//                new Texture("Gen1_Pokemon/Venusaur_Front2.png"),
//                new Texture("Gen1_Pokemon/Venusaur_Back1.png"),
//                new Texture("Gen1_Pokemon/Venusaur_Back2.png"),
                    },
                    80, 82, 83, 100, 100, 80
                );
                break;
            case "Charmander":
                pokemon = new Pokemon(
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
                break;
            case "Charmeleon":
                pokemon = new Pokemon(
                    5,
                    "Charmeleon",
                    false,
                    new String[] {"Fire"},
                    new Texture[] {
//                new Texture("Gen1_Pokemon/Charmeleon_Front1.png"),
//                new Texture("Gen1_Pokemon/Charmeleon_Front2.png"),
//                new Texture("Gen1_Pokemon/Charmeleon_Back1.png"),
//                new Texture("Gen1_Pokemon/Charmeleon_Back2.png"),
                    },
                    58, 64, 58, 80, 65, 80
                );
                break;
            case "Charizard":
                pokemon = new Pokemon(
                    6,
                    "Charizard",
                    false,
                    new String[] {"Fire", "Flying"},
                    new Texture[] {
                        new Texture("Gen1_Pokemon/Charizard_Front1.png"),
                    },
                    78, 84, 78, 109, 85, 100
                );
                break;
            case "Squirtle":
                pokemon = new Pokemon(
                    7,
                    "Squirtle",
                    false,
                    new String[] {"Water"},
                    new Texture[] {
//                new Texture("Gen1_Pokemon/Squirtle_Front1.png"),
//                new Texture("Gen1_Pokemon/Squirtle_Front2.png"),
//                new Texture("Gen1_Pokemon/Squirtle_Back1.png"),
//                new Texture("Gen1_Pokemon/Squirtle_Back2.png"),
                    },
                    44, 48, 65, 50, 64, 43
                );
                break;
            case "Wartortle":
                pokemon = new Pokemon(
                    8,
                    "Wartortle",
                    false,
                    new String[] {"Water"},
                    new Texture[] {
//                new Texture("Gen1_Pokemon/Wartortle_Front1.png"),
//                new Texture("Gen1_Pokemon/Wartortle_Front2.png"),
//                new Texture("Gen1_Pokemon/Wartortle_Back1.png"),
//                new Texture("Gen1_Pokemon/Wartortle_Back2.png"),
                    },
                    59, 63, 80, 65, 80, 58
                );
                break;
            case "Blastoise":
                pokemon = new Pokemon(
                    9,
                    "Blastoise",
                    false,
                    new String[] {"Water"},
                    new Texture[] {
//                new Texture("Gen1_Pokemon/Blastoise_Front1.png"),
//                new Texture("Gen1_Pokemon/Blastoise_Front2.png"),
//                new Texture("Gen1_Pokemon/Blastoise_Back1.png"),
//                new Texture("Gen1_Pokemon/Blastoise_Back2.png"),
                    },
                    79, 83, 100, 85, 105, 78
                );
                break;
            // Gen4 Pokemon
            case "Spiritomb":
                pokemon = new Pokemon(
                    442,
                    "Spiritomb",
                    false,
                    new String[] {"Ghost", "Dark"},
                    new Texture[] {
                        new Texture("Gen4_Pokemon/Spiritomb_Front1.png"),
                    },
                    50, 92, 108, 92, 108, 35
                );
                break;
            default:
                throw new IllegalArgumentException("Unknown Pokemon: " + pokemonName);
        }
        pokemonMap.put(pokemonName, pokemon);
        return pokemon;
    }
}
