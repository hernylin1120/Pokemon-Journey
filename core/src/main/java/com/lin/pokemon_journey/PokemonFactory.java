package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;

public class PokemonFactory {
    private PokemonFactory() {
    }
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
                    new String[]{"Grass", "Poison"},
                    new Texture[]{
                        new Texture("Gen1_Pokemon/Bulbasaur_Front1.png"),
                        new Texture("Gen1_Pokemon/Bulbasaur_Front2.png"),
                        new Texture("Gen1_Pokemon/Bulbasaur_Back1.png"),
                        new Texture("Gen1_Pokemon/Bulbasaur_Back2.png"),
                    },
                    45, 49, 49, 65, 65, 45
                );
                break;
            case "Ivysaur":
                pokemon = new Pokemon(
                    2,
                    "Ivysaur",
                    false,
                    new String[]{"Grass", "Poison"},
                    new Texture[]{
                        new Texture("Gen1_Pokemon/Ivysaur_Front1.png"),
                        new Texture("Gen1_Pokemon/Ivysaur_Front2.png"),
                        new Texture("Gen1_Pokemon/Ivysaur_Back1.png"),
                        new Texture("Gen1_Pokemon/Ivysaur_Back2.png"),
                    },
                    60, 62, 63, 80, 80, 60
                );
                break;
            case "Venusaur":
                pokemon = new Pokemon(
                    3,
                    "Venusaur",
                    true,
                    new String[]{"Grass", "Poison"},
                    new Texture[]{
                        new Texture("Gen1_Pokemon/Venusaur_Front1.png"),
                        new Texture("Gen1_Pokemon/Venusaur_Front2.png"),
                        new Texture("Gen1_Pokemon/Venusaur_Back1.png"),
                        new Texture("Gen1_Pokemon/Venusaur_Back2.png"),
                        new Texture("Gen1_Pokemon/Venusaur_Icon2.png"),
                        new Texture("Gen1_Pokemon/Venusaur_Icon2.png")
                    },
                    80, 82, 83, 100, 100, 80
                );
                break;
            case "Charmander":
                pokemon = new Pokemon(
                    4,
                    "Charmander",
                    false,
                    new String[]{"Fire"},
                    new Texture[]{
                        new Texture("Gen1_Pokemon/Charmander_Front1.png"),
                        new Texture("Gen1_Pokemon/Charmander_Front2.png"),
                        new Texture("Gen1_Pokemon/Charmander_Back1.png"),
                        new Texture("Gen1_Pokemon/Charmander_Back2.png"),
                        new Texture("Gen1_Pokemon/Charmander_Icon1.png"),
                        new Texture("Gen1_Pokemon/Charmander_Icon2.png")
                    },
                    39, 52, 43, 60, 50, 65
                );
                break;
            case "Charmeleon":
                pokemon = new Pokemon(
                    5,
                    "Charmeleon",
                    false,
                    new String[]{"Fire"},
                    new Texture[]{
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
                    new String[]{"Fire", "Flying"},
                    new Texture[]{
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
                    new String[]{"Water"},
                    new Texture[]{
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
                    new String[]{"Water"},
                    new Texture[]{
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
                    new String[]{"Water"},
                    new Texture[]{
//                new Texture("Gen1_Pokemon/Blastoise_Front1.png"),
//                new Texture("Gen1_Pokemon/Blastoise_Front2.png"),
//                new Texture("Gen1_Pokemon/Blastoise_Back1.png"),
//                new Texture("Gen1_Pokemon/Blastoise_Back2.png"),
                    },
                    79, 83, 100, 85, 105, 78
                );
                break;
            case "Caterpie":
                pokemon = new Pokemon(
                    10,
                    "Caterpie",
                    false,
                    new String[]{"Bug"},
                    new Texture[]{
//                new Texture("Gen1_Pokemon/Caterpie_Front1.png"),
//                new Texture("Gen1_Pokemon/Caterpie_Front2.png"),
//                new Texture("Gen1_Pokemon/Caterpie_Back1.png"),
//                new Texture("Gen1_Pokemon/Caterpie_Back2.png"),
                    },
                    45, 30, 35, 20, 20, 45
                );
                break;
            case "Metapod":
                pokemon = new Pokemon(
                    11,
                    "Metapod",
                    false,
                    new String[]{"Bug"},
                    new Texture[]{
//                new Texture("Gen1_Pokemon/Metapod_Front1.png"),
//                new Texture("Gen1_Pokemon/Metapod_Front2.png"),
//                new Texture("Gen1_Pokemon/Metapod_Back1.png"),
//                new Texture("Gen1_Pokemon/Metapod_Back2.png"),
                    },
                    50, 20, 55, 25, 25, 30
                );
                break;
            case "Butterfree":
                pokemon = new Pokemon(
                    12,
                    "Butterfree",
                    false,
                    new String[]{"Bug", "Flying"},
                    new Texture[]{
//                new Texture("Gen1_Pokemon/Butterfree_Front1.png"),
//                new Texture("Gen1_Pokemon/Butterfree_Front2.png"),
//                new Texture("Gen1_Pokemon/Butterfree_Back1.png"),
//                new Texture("Gen1_Pokemon/Butterfree_Back2.png"),
                    },
                    60, 45, 50, 90, 80, 70
                );
                break;
            case "Weedle":
                pokemon = new Pokemon(
                    13,
                    "Weedle",
                    false,
                    new String[]{"Bug", "Poison"},
                    new Texture[]{
//                new Texture("Gen1_Pokemon/Weedle_Front1.png"),
//                new Texture("Gen1_Pokemon/Weedle_Front2.png"),
//                new Texture("Gen1_Pokemon/Weedle_Back1.png"),
//                new Texture("Gen1_Pokemon/Weedle_Back2.png"),
                    },
                    40, 35, 30, 20, 20, 50
                );
                break;
            case "Kakuna":
                pokemon = new Pokemon(
                    14,
                    "Kakuna",
                    false,
                    new String[]{"Bug", "Poison"},
                    new Texture[]{
//                new Texture("Gen1_Pokemon/Kakuna_Front1.png"),
//                new Texture("Gen1_Pokemon/Kakuna_Front2.png"),
//                new Texture("Gen1_Pokemon/Kakuna_Back1.png"),
//                new Texture("Gen1_Pokemon/Kakuna_Back2.png"),
                    },
                    45, 25, 50, 25, 25, 35
                );
                break;
            case "Beedrill":
                pokemon = new Pokemon(
                    15,
                    "Beedrill",
                    false,
                    new String[]{"Bug", "Poison"},
                    new Texture[]{
//                new Texture("Gen1_Pokemon/Beedrill_Front1.png"),
//                new Texture("Gen1_Pokemon/Beedrill_Front2.png"),
//                new Texture("Gen1_Pokemon/Beedrill_Back1.png"),
//                new Texture("Gen1_Pokemon/Beedrill_Back2.png"),
                    },
                    65, 90, 40, 45, 80, 75
                );
                break;
            case "Pidgey":
                pokemon = new Pokemon(
                    16,
                    "Pidgey",
                    false,
                    new String[]{"Normal", "Flying"},
                    new Texture[]{
//                new Texture("Gen1_Pokemon/Pidgey_Front1.png"),
//                new Texture("Gen1_Pokemon/Pidgey_Front2.png"),
//                new Texture("Gen1_Pokemon/Pidgey_Back1.png"),
//                new Texture("Gen1_Pokemon/Pidgey_Back2.png"),
                    },
                    40, 45, 40, 35, 35, 56
                );
                break;
            case "Pidgeotto":
                pokemon = new Pokemon(
                    17,
                    "Pidgeotto",
                    false,
                    new String[]{"Normal", "Flying"},
                    new Texture[]{
//                new Texture("Gen1_Pokemon/Pidgeotto_Front1.png"),
//                new Texture("Gen1_Pokemon/Pidgeotto_Front2.png"),
//                new Texture("Gen1_Pokemon/Pidgeotto_Back1.png"),
//                new Texture("Gen1_Pokemon/Pidgeotto_Back2.png"),
                    },
                    63, 60, 55, 50, 50, 71
                );
                break;
            case "Pidgeot":
                pokemon = new Pokemon(
                    18,
                    "Pidgeot",
                    false,
                    new String[]{"Normal", "Flying"},
                    new Texture[]{
//                new Texture("Gen1_Pokemon/Pidgeot_Front1.png"),
//                new Texture("Gen1_Pokemon/Pidgeot_Front2.png"),
//                new Texture("Gen1_Pokemon/Pidgeot_Back1.png"),
//                new Texture("Gen1_Pokemon/Pidgeot_Back2.png"),
                    },
                    83, 80, 75, 70, 70, 101
                );
                break;
            case "Rattata":
                pokemon = new Pokemon(
                    19,
                    "Rattata",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Rattata_Front1.png"),
                        // new Texture("Gen1_Pokemon/Rattata_Front2.png"),
                        // new Texture("Gen1_Pokemon/Rattata_Back1.png"),
                        // new Texture("Gen1_Pokemon/Rattata_Back2.png"),
                    },
                    30, 56, 35, 25, 35, 72
                );
                break;
            case "Raticate":
                pokemon = new Pokemon(
                    20,
                    "Raticate",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Raticate_Front1.png"),
                        // new Texture("Gen1_Pokemon/Raticate_Front2.png"),
                        // new Texture("Gen1_Pokemon/Raticate_Back1.png"),
                        // new Texture("Gen1_Pokemon/Raticate_Back2.png"),
                    },
                    55, 81, 60, 50, 70, 97
                );
                break;
            case "Spearow":
                pokemon = new Pokemon(
                    21,
                    "Spearow",
                    false,
                    new String[]{"Normal", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Spearow_Front1.png"),
                        // new Texture("Gen1_Pokemon/Spearow_Front2.png"),
                        // new Texture("Gen1_Pokemon/Spearow_Back1.png"),
                        // new Texture("Gen1_Pokemon/Spearow_Back2.png"),
                    },
                    40, 60, 30, 31, 31, 70
                );
                break;
            case "Fearow":
                pokemon = new Pokemon(
                    22,
                    "Fearow",
                    false,
                    new String[]{"Normal", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Fearow_Front1.png"),
                        // new Texture("Gen1_Pokemon/Fearow_Front2.png"),
                        // new Texture("Gen1_Pokemon/Fearow_Back1.png"),
                        // new Texture("Gen1_Pokemon/Fearow_Back2.png"),
                    },
                    65, 90, 65, 61, 61, 100
                );
                break;
            case "Ekans":
                pokemon = new Pokemon(
                    23,
                    "Ekans",
                    false,
                    new String[]{"Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Ekans_Front1.png"),
                        // new Texture("Gen1_Pokemon/Ekans_Front2.png"),
                        // new Texture("Gen1_Pokemon/Ekans_Back1.png"),
                        // new Texture("Gen1_Pokemon/Ekans_Back2.png"),
                    },
                    35, 60, 44, 40, 54, 55
                );
                break;
            case "Arbok":
                pokemon = new Pokemon(
                    24,
                    "Arbok",
                    false,
                    new String[]{"Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Arbok_Front1.png"),
                        // new Texture("Gen1_Pokemon/Arbok_Front2.png"),
                        // new Texture("Gen1_Pokemon/Arbok_Back1.png"),
                        // new Texture("Gen1_Pokemon/Arbok_Back2.png"),
                    },
                    60, 95, 69, 65, 79, 80
                );
                break;
            case "Pikachu":
                pokemon = new Pokemon(
                    25,
                    "Pikachu",
                    false,
                    new String[]{"Electric"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Pikachu_Front1.png"),
                        // new Texture("Gen1_Pokemon/Pikachu_Front2.png"),
                        // new Texture("Gen1_Pokemon/Pikachu_Back1.png"),
                        // new Texture("Gen1_Pokemon/Pikachu_Back2.png"),
                    },
                    35, 55, 40, 50, 50, 90
                );
                break;
            case "Raichu":
                pokemon = new Pokemon(
                    26,
                    "Raichu",
                    false,
                    new String[]{"Electric"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Raichu_Front1.png"),
                        // new Texture("Gen1_Pokemon/Raichu_Front2.png"),
                        // new Texture("Gen1_Pokemon/Raichu_Back1.png"),
                        // new Texture("Gen1_Pokemon/Raichu_Back2.png"),
                    },
                    60, 90, 55, 90, 80, 110
                );
                break;
            case "Sandshrew":
                pokemon = new Pokemon(
                    27,
                    "Sandshrew",
                    false,
                    new String[]{"Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Sandshrew_Front1.png"),
                        // new Texture("Gen1_Pokemon/Sandshrew_Front2.png"),
                        // new Texture("Gen1_Pokemon/Sandshrew_Back1.png"),
                        // new Texture("Gen1_Pokemon/Sandshrew_Back2.png"),
                    },
                    50, 75, 85, 20, 30, 40
                );
                break;
            case "Sandslash":
                pokemon = new Pokemon(
                    28,
                    "Sandslash",
                    false,
                    new String[]{"Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Sandslash_Front1.png"),
                        // new Texture("Gen1_Pokemon/Sandslash_Front2.png"),
                        // new Texture("Gen1_Pokemon/Sandslash_Back1.png"),
                        // new Texture("Gen1_Pokemon/Sandslash_Back2.png"),
                    },
                    75, 100, 110, 45, 55, 65
                );
                break;
            case "Nidoran♀":
                pokemon = new Pokemon(
                    29,
                    "Nidoran♀",
                    false,
                    new String[]{"Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/NidoranF_Front1.png"),
                        // new Texture("Gen1_Pokemon/NidoranF_Front2.png"),
                        // new Texture("Gen1_Pokemon/NidoranF_Back1.png"),
                        // new Texture("Gen1_Pokemon/NidoranF_Back2.png"),
                    },
                    55, 47, 52, 40, 40, 41
                );
                break;
            case "Nidorina":
                pokemon = new Pokemon(
                    30,
                    "Nidorina",
                    false,
                    new String[]{"Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Nidorina_Front1.png"),
                        // new Texture("Gen1_Pokemon/Nidorina_Front2.png"),
                        // new Texture("Gen1_Pokemon/Nidorina_Back1.png"),
                        // new Texture("Gen1_Pokemon/Nidorina_Back2.png"),
                    },
                    70, 62, 67, 55, 55, 56
                );
                break;
            case "Nidoqueen":
                pokemon = new Pokemon(
                    31,
                    "Nidoqueen",
                    false,
                    new String[]{"Poison", "Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Nidoqueen_Front1.png"),
                        // new Texture("Gen1_Pokemon/Nidoqueen_Front2.png"),
                        // new Texture("Gen1_Pokemon/Nidoqueen_Back1.png"),
                        // new Texture("Gen1_Pokemon/Nidoqueen_Back2.png"),
                    },
                    90, 92, 87, 75, 85, 76
                );
                break;
            case "Nidoran♂":
                pokemon = new Pokemon(
                    32,
                    "Nidoran♂",
                    false,
                    new String[]{"Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/NidoranM_Front1.png"),
                        // new Texture("Gen1_Pokemon/NidoranM_Front2.png"),
                        // new Texture("Gen1_Pokemon/NidoranM_Back1.png"),
                        // new Texture("Gen1_Pokemon/NidoranM_Back2.png"),
                    },
                    46, 57, 40, 40, 40, 50
                );
                break;
            case "Nidorino":
                pokemon = new Pokemon(
                    33,
                    "Nidorino",
                    false,
                    new String[]{"Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Nidorino_Front1.png"),
                        // new Texture("Gen1_Pokemon/Nidorino_Front2.png"),
                        // new Texture("Gen1_Pokemon/Nidorino_Back1.png"),
                        // new Texture("Gen1_Pokemon/Nidorino_Back2.png"),
                    },
                    61, 72, 57, 55, 55, 65
                );
                break;
            case "Nidoking":
                pokemon = new Pokemon(
                    34,
                    "Nidoking",
                    false,
                    new String[]{"Poison", "Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Nidoking_Front1.png"),
                        // new Texture("Gen1_Pokemon/Nidoking_Front2.png"),
                        // new Texture("Gen1_Pokemon/Nidoking_Back1.png"),
                        // new Texture("Gen1_Pokemon/Nidoking_Back2.png"),
                    },
                    81, 102, 77, 85, 75, 85
                );
                break;
            case "Clefairy":
                pokemon = new Pokemon(
                    35,
                    "Clefairy",
                    false,
                    new String[]{"Fairy"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Clefairy_Front1.png"),
                        // new Texture("Gen1_Pokemon/Clefairy_Front2.png"),
                        // new Texture("Gen1_Pokemon/Clefairy_Back1.png"),
                        // new Texture("Gen1_Pokemon/Clefairy_Back2.png"),
                    },
                    70, 45, 48, 60, 65, 35
                );
                break;
            case "Clefable":
                pokemon = new Pokemon(
                    36,
                    "Clefable",
                    false,
                    new String[]{"Fairy"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Clefable_Front1.png"),
                        // new Texture("Gen1_Pokemon/Clefable_Front2.png"),
                        // new Texture("Gen1_Pokemon/Clefable_Back1.png"),
                        // new Texture("Gen1_Pokemon/Clefable_Back2.png"),
                    },
                    95, 70, 73, 95, 90, 60
                );
                break;
            case "Vulpix":
                pokemon = new Pokemon(
                    37,
                    "Vulpix",
                    false,
                    new String[]{"Fire"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Vulpix_Front1.png"),
                        // new Texture("Gen1_Pokemon/Vulpix_Front2.png"),
                        // new Texture("Gen1_Pokemon/Vulpix_Back1.png"),
                        // new Texture("Gen1_Pokemon/Vulpix_Back2.png"),
                    },
                    38, 41, 40, 50, 65, 65
                );
                break;
            case "Ninetales":
                pokemon = new Pokemon(
                    38,
                    "Ninetales",
                    false,
                    new String[]{"Fire"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Ninetales_Front1.png"),
                        // new Texture("Gen1_Pokemon/Ninetales_Front2.png"),
                        // new Texture("Gen1_Pokemon/Ninetales_Back1.png"),
                        // new Texture("Gen1_Pokemon/Ninetales_Back2.png"),
                    },
                    73, 76, 75, 81, 100, 100
                );
                break;
            case "Jigglypuff":
                pokemon = new Pokemon(
                    39,
                    "Jigglypuff",
                    false,
                    new String[]{"Normal", "Fairy"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Jigglypuff_Front1.png"),
                        // new Texture("Gen1_Pokemon/Jigglypuff_Front2.png"),
                        // new Texture("Gen1_Pokemon/Jigglypuff_Back1.png"),
                        // new Texture("Gen1_Pokemon/Jigglypuff_Back2.png"),
                    },
                    115, 45, 20, 45, 25, 20
                );
                break;
            case "Wigglytuff":
                pokemon = new Pokemon(
                    40,
                    "Wigglytuff",
                    false,
                    new String[]{"Normal", "Fairy"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Wigglytuff_Front1.png"),
                        // new Texture("Gen1_Pokemon/Wigglytuff_Front2.png"),
                        // new Texture("Gen1_Pokemon/Wigglytuff_Back1.png"),
                        // new Texture("Gen1_Pokemon/Wigglytuff_Back2.png"),
                    },
                    140, 70, 45, 85, 50, 45
                );
                break;
            case "Zubat":
                pokemon = new Pokemon(
                    41,
                    "Zubat",
                    false,
                    new String[]{"Poison", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Zubat_Front1.png"),
                        // new Texture("Gen1_Pokemon/Zubat_Front2.png"),
                        // new Texture("Gen1_Pokemon/Zubat_Back1.png"),
                        // new Texture("Gen1_Pokemon/Zubat_Back2.png"),
                    },
                    40, 45, 35, 30, 40, 55
                );
                break;
            case "Golbat":
                pokemon = new Pokemon(
                    42,
                    "Golbat",
                    false,
                    new String[]{"Poison", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Golbat_Front1.png"),
                        // new Texture("Gen1_Pokemon/Golbat_Front2.png"),
                        // new Texture("Gen1_Pokemon/Golbat_Back1.png"),
                        // new Texture("Gen1_Pokemon/Golbat_Back2.png"),
                    },
                    75, 80, 70, 65, 75, 90
                );
                break;
            case "Oddish":
                pokemon = new Pokemon(
                    43,
                    "Oddish",
                    false,
                    new String[]{"Grass", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Oddish_Front1.png"),
                        // new Texture("Gen1_Pokemon/Oddish_Front2.png"),
                        // new Texture("Gen1_Pokemon/Oddish_Back1.png"),
                        // new Texture("Gen1_Pokemon/Oddish_Back2.png"),
                    },
                    45, 50, 55, 75, 65, 30
                );
                break;
            case "Gloom":
                pokemon = new Pokemon(
                    44,
                    "Gloom",
                    false,
                    new String[]{"Grass", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Gloom_Front1.png"),
                        // new Texture("Gen1_Pokemon/Gloom_Front2.png"),
                        // new Texture("Gen1_Pokemon/Gloom_Back1.png"),
                        // new Texture("Gen1_Pokemon/Gloom_Back2.png"),
                    },
                    60, 65, 70, 85, 75, 40
                );
                break;
            case "Vileplume":
                pokemon = new Pokemon(
                    45,
                    "Vileplume",
                    false,
                    new String[]{"Grass", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Vileplume_Front1.png"),
                        // new Texture("Gen1_Pokemon/Vileplume_Front2.png"),
                        // new Texture("Gen1_Pokemon/Vileplume_Back1.png"),
                        // new Texture("Gen1_Pokemon/Vileplume_Back2.png"),
                    },
                    75, 80, 85, 110, 90, 50
                );
                break;
            case "Paras":
                pokemon = new Pokemon(
                    46,
                    "Paras",
                    false,
                    new String[]{"Bug", "Grass"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Paras_Front1.png"),
                        // new Texture("Gen1_Pokemon/Paras_Front2.png"),
                        // new Texture("Gen1_Pokemon/Paras_Back1.png"),
                        // new Texture("Gen1_Pokemon/Paras_Back2.png"),
                    },
                    35, 70, 55, 45, 55, 25
                );
                break;
            case "Parasect":
                pokemon = new Pokemon(
                    47,
                    "Parasect",
                    false,
                    new String[]{"Bug", "Grass"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Parasect_Front1.png"),
                        // new Texture("Gen1_Pokemon/Parasect_Front2.png"),
                        // new Texture("Gen1_Pokemon/Parasect_Back1.png"),
                        // new Texture("Gen1_Pokemon/Parasect_Back2.png"),
                    },
                    60, 95, 80, 60, 80, 30
                );
                break;
            case "Venonat":
                pokemon = new Pokemon(
                    48,
                    "Venonat",
                    false,
                    new String[]{"Bug", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Venonat_Front1.png"),
                        // new Texture("Gen1_Pokemon/Venonat_Front2.png"),
                        // new Texture("Gen1_Pokemon/Venonat_Back1.png"),
                        // new Texture("Gen1_Pokemon/Venonat_Back2.png"),
                    },
                    60, 55, 50, 40, 55, 45
                );
                break;
            case "Venomoth":
                pokemon = new Pokemon(
                    49,
                    "Venomoth",
                    false,
                    new String[]{"Bug", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Venomoth_Front1.png"),
                        // new Texture("Gen1_Pokemon/Venomoth_Front2.png"),
                        // new Texture("Gen1_Pokemon/Venomoth_Back1.png"),
                        // new Texture("Gen1_Pokemon/Venomoth_Back2.png"),
                    },
                    70, 65, 60, 90, 75, 90
                );
                break;
            case "Diglett":
                pokemon = new Pokemon(
                    50,
                    "Diglett",
                    false,
                    new String[]{"Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Diglett_Front1.png"),
                        // new Texture("Gen1_Pokemon/Diglett_Front2.png"),
                        // new Texture("Gen1_Pokemon/Diglett_Back1.png"),
                        // new Texture("Gen1_Pokemon/Diglett_Back2.png"),
                    },
                    10, 55, 25, 35, 45, 95
                );
                break;
            case "Dugtrio":
                pokemon = new Pokemon(
                    51,
                    "Dugtrio",
                    false,
                    new String[]{"Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Dugtrio_Front1.png"),
                        // new Texture("Gen1_Pokemon/Dugtrio_Front2.png"),
                        // new Texture("Gen1_Pokemon/Dugtrio_Back1.png"),
                        // new Texture("Gen1_Pokemon/Dugtrio_Back2.png"),
                    },
                    35, 100, 50, 50, 70, 120
                );
                break;
            case "Meowth":
                pokemon = new Pokemon(
                    52,
                    "Meowth",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Meowth_Front1.png"),
                        // new Texture("Gen1_Pokemon/Meowth_Front2.png"),
                        // new Texture("Gen1_Pokemon/Meowth_Back1.png"),
                        // new Texture("Gen1_Pokemon/Meowth_Back2.png"),
                    },
                    40, 45, 35, 40, 40, 90
                );
                break;
            case "Persian":
                pokemon = new Pokemon(
                    53,
                    "Persian",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Persian_Front1.png"),
                        // new Texture("Gen1_Pokemon/Persian_Front2.png"),
                        // new Texture("Gen1_Pokemon/Persian_Back1.png"),
                        // new Texture("Gen1_Pokemon/Persian_Back2.png"),
                    },
                    65, 70, 60, 65, 65, 115
                );
                break;
            case "Psyduck":
                pokemon = new Pokemon(
                    54,
                    "Psyduck",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Psyduck_Front1.png"),
                        // new Texture("Gen1_Pokemon/Psyduck_Front2.png"),
                        // new Texture("Gen1_Pokemon/Psyduck_Back1.png"),
                        // new Texture("Gen1_Pokemon/Psyduck_Back2.png"),
                    },
                    50, 52, 48, 65, 50, 55
                );
                break;
            case "Golduck":
                pokemon = new Pokemon(
                    55,
                    "Golduck",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Golduck_Front1.png"),
                        // new Texture("Gen1_Pokemon/Golduck_Front2.png"),
                        // new Texture("Gen1_Pokemon/Golduck_Back1.png"),
                        // new Texture("Gen1_Pokemon/Golduck_Back2.png"),
                    },
                    80, 82, 78, 95, 80, 85
                );
                break;
            case "Mankey":
                pokemon = new Pokemon(
                    56,
                    "Mankey",
                    false,
                    new String[]{"Fighting"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Mankey_Front1.png"),
                        // new Texture("Gen1_Pokemon/Mankey_Front2.png"),
                        // new Texture("Gen1_Pokemon/Mankey_Back1.png"),
                        // new Texture("Gen1_Pokemon/Mankey_Back2.png"),
                    },
                    40, 80, 35, 35, 45, 70
                );
                break;
            case "Primeape":
                pokemon = new Pokemon(
                    57,
                    "Primeape",
                    false,
                    new String[]{"Fighting"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Primeape_Front1.png"),
                        // new Texture("Gen1_Pokemon/Primeape_Front2.png"),
                        // new Texture("Gen1_Pokemon/Primeape_Back1.png"),
                        // new Texture("Gen1_Pokemon/Primeape_Back2.png"),
                    },
                    65, 105, 60, 60, 70, 95
                );
                break;
            case "Growlithe":
                pokemon = new Pokemon(
                    58,
                    "Growlithe",
                    false,
                    new String[]{"Fire"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Growlithe_Front1.png"),
                        // new Texture("Gen1_Pokemon/Growlithe_Front2.png"),
                        // new Texture("Gen1_Pokemon/Growlithe_Back1.png"),
                        // new Texture("Gen1_Pokemon/Growlithe_Back2.png"),
                    },
                    55, 70, 45, 70, 50, 60
                );
                break;
            case "Arcanine":
                pokemon = new Pokemon(
                    59,
                    "Arcanine",
                    false,
                    new String[]{"Fire"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Arcanine_Front1.png"),
                        // new Texture("Gen1_Pokemon/Arcanine_Front2.png"),
                        // new Texture("Gen1_Pokemon/Arcanine_Back1.png"),
                        // new Texture("Gen1_Pokemon/Arcanine_Back2.png"),
                    },
                    90, 110, 80, 100, 80, 95
                );
                break;
            case "Poliwag":
                pokemon = new Pokemon(
                    60,
                    "Poliwag",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Poliwag_Front1.png"),
                        // new Texture("Gen1_Pokemon/Poliwag_Front2.png"),
                        // new Texture("Gen1_Pokemon/Poliwag_Back1.png"),
                        // new Texture("Gen1_Pokemon/Poliwag_Back2.png"),
                    },
                    40, 50, 40, 40, 40, 90
                );
                break;
            case "Poliwhirl":
                pokemon = new Pokemon(
                    61,
                    "Poliwhirl",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Poliwhirl_Front1.png"),
                        // new Texture("Gen1_Pokemon/Poliwhirl_Front2.png"),
                        // new Texture("Gen1_Pokemon/Poliwhirl_Back1.png"),
                        // new Texture("Gen1_Pokemon/Poliwhirl_Back2.png"),
                    },
                    65, 65, 65, 50, 50, 90
                );
                break;
            case "Poliwrath":
                pokemon = new Pokemon(
                    62,
                    "Poliwrath",
                    false,
                    new String[]{"Water", "Fighting"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Poliwrath_Front1.png"),
                        // new Texture("Gen1_Pokemon/Poliwrath_Front2.png"),
                        // new Texture("Gen1_Pokemon/Poliwrath_Back1.png"),
                        // new Texture("Gen1_Pokemon/Poliwrath_Back2.png"),
                    },
                    90, 95, 95, 70, 90, 70
                );
                break;
            case "Abra":
                pokemon = new Pokemon(
                    63,
                    "Abra",
                    false,
                    new String[]{"Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Abra_Front1.png"),
                        // new Texture("Gen1_Pokemon/Abra_Front2.png"),
                        // new Texture("Gen1_Pokemon/Abra_Back1.png"),
                        // new Texture("Gen1_Pokemon/Abra_Back2.png"),
                    },
                    25, 20, 15, 105, 55, 90
                );
                break;
            case "Kadabra":
                pokemon = new Pokemon(
                    64,
                    "Kadabra",
                    false,
                    new String[]{"Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Kadabra_Front1.png"),
                        // new Texture("Gen1_Pokemon/Kadabra_Front2.png"),
                        // new Texture("Gen1_Pokemon/Kadabra_Back1.png"),
                        // new Texture("Gen1_Pokemon/Kadabra_Back2.png"),
                    },
                    40, 35, 30, 120, 70, 105
                );
                break;
            case "Alakazam":
                pokemon = new Pokemon(
                    65,
                    "Alakazam",
                    false,
                    new String[]{"Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Alakazam_Front1.png"),
                        // new Texture("Gen1_Pokemon/Alakazam_Front2.png"),
                        // new Texture("Gen1_Pokemon/Alakazam_Back1.png"),
                        // new Texture("Gen1_Pokemon/Alakazam_Back2.png"),
                    },
                    55, 50, 45, 135, 95, 120
                );
                break;
            case "Machop":
                pokemon = new Pokemon(
                    66,
                    "Machop",
                    false,
                    new String[]{"Fighting"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Machop_Front1.png"),
                        // new Texture("Gen1_Pokemon/Machop_Front2.png"),
                        // new Texture("Gen1_Pokemon/Machop_Back1.png"),
                        // new Texture("Gen1_Pokemon/Machop_Back2.png"),
                    },
                    70, 80, 50, 35, 35, 35
                );
                break;
            case "Machoke":
                pokemon = new Pokemon(
                    67,
                    "Machoke",
                    false,
                    new String[]{"Fighting"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Machoke_Front1.png"),
                        // new Texture("Gen1_Pokemon/Machoke_Front2.png"),
                        // new Texture("Gen1_Pokemon/Machoke_Back1.png"),
                        // new Texture("Gen1_Pokemon/Machoke_Back2.png"),
                    },
                    80, 100, 70, 50, 60, 45
                );
                break;
            case "Machamp":
                pokemon = new Pokemon(
                    68,
                    "Machamp",
                    false,
                    new String[]{"Fighting"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Machamp_Front1.png"),
                        // new Texture("Gen1_Pokemon/Machamp_Front2.png"),
                        // new Texture("Gen1_Pokemon/Machamp_Back1.png"),
                        // new Texture("Gen1_Pokemon/Machamp_Back2.png"),
                    },
                    90, 130, 80, 65, 85, 55
                );
                break;
            case "Bellsprout":
                pokemon = new Pokemon(
                    69,
                    "Bellsprout",
                    false,
                    new String[]{"Grass", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Bellsprout_Front1.png"),
                        // new Texture("Gen1_Pokemon/Bellsprout_Front2.png"),
                        // new Texture("Gen1_Pokemon/Bellsprout_Back1.png"),
                        // new Texture("Gen1_Pokemon/Bellsprout_Back2.png"),
                    },
                    50, 75, 35, 70, 30, 40
                );
                break;
            case "Weepinbell":
                pokemon = new Pokemon(
                    70,
                    "Weepinbell",
                    false,
                    new String[]{"Grass", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Weepinbell_Front1.png"),
                        // new Texture("Gen1_Pokemon/Weepinbell_Front2.png"),
                        // new Texture("Gen1_Pokemon/Weepinbell_Back1.png"),
                        // new Texture("Gen1_Pokemon/Weepinbell_Back2.png"),
                    },
                    65, 90, 50, 85, 45, 55
                );
                break;
            case "Victreebel":
                pokemon = new Pokemon(
                    71,
                    "Victreebel",
                    false,
                    new String[]{"Grass", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Victreebel_Front1.png"),
                        // new Texture("Gen1_Pokemon/Victreebel_Front2.png"),
                        // new Texture("Gen1_Pokemon/Victreebel_Back1.png"),
                        // new Texture("Gen1_Pokemon/Victreebel_Back2.png"),
                    },
                    80, 105, 65, 100, 70, 70
                );
                break;
            case "Tentacool":
                pokemon = new Pokemon(
                    72,
                    "Tentacool",
                    false,
                    new String[]{"Water", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Tentacool_Front1.png"),
                        // new Texture("Gen1_Pokemon/Tentacool_Front2.png"),
                        // new Texture("Gen1_Pokemon/Tentacool_Back1.png"),
                        // new Texture("Gen1_Pokemon/Tentacool_Back2.png"),
                    },
                    40, 40, 35, 50, 100, 70
                );
                break;
            case "Tentacruel":
                pokemon = new Pokemon(
                    73,
                    "Tentacruel",
                    false,
                    new String[]{"Water", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Tentacruel_Front1.png"),
                        // new Texture("Gen1_Pokemon/Tentacruel_Front2.png"),
                        // new Texture("Gen1_Pokemon/Tentacruel_Back1.png"),
                        // new Texture("Gen1_Pokemon/Tentacruel_Back2.png"),
                    },
                    80, 70, 65, 80, 120, 100
                );
                break;
            case "Geodude":
                pokemon = new Pokemon(
                    74,
                    "Geodude",
                    false,
                    new String[]{"Rock", "Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Geodude_Front1.png"),
                        // new Texture("Gen1_Pokemon/Geodude_Front2.png"),
                        // new Texture("Gen1_Pokemon/Geodude_Back1.png"),
                        // new Texture("Gen1_Pokemon/Geodude_Back2.png"),
                    },
                    40, 80, 100, 30, 30, 20
                );
                break;
            case "Graveler":
                pokemon = new Pokemon(
                    75,
                    "Graveler",
                    false,
                    new String[]{"Rock", "Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Graveler_Front1.png"),
                        // new Texture("Gen1_Pokemon/Graveler_Front2.png"),
                        // new Texture("Gen1_Pokemon/Graveler_Back1.png"),
                        // new Texture("Gen1_Pokemon/Graveler_Back2.png"),
                    },
                    55, 95, 115, 45, 45, 35
                );
                break;
            case "Golem":
                pokemon = new Pokemon(
                    76,
                    "Golem",
                    false,
                    new String[]{"Rock", "Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Golem_Front1.png"),
                        // new Texture("Gen1_Pokemon/Golem_Front2.png"),
                        // new Texture("Gen1_Pokemon/Golem_Back1.png"),
                        // new Texture("Gen1_Pokemon/Golem_Back2.png"),
                    },
                    80, 120, 130, 55, 65, 45
                );
                break;
            case "Ponyta":
                pokemon = new Pokemon(
                    77,
                    "Ponyta",
                    false,
                    new String[]{"Fire"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Ponyta_Front1.png"),
                        // new Texture("Gen1_Pokemon/Ponyta_Front2.png"),
                        // new Texture("Gen1_Pokemon/Ponyta_Back1.png"),
                        // new Texture("Gen1_Pokemon/Ponyta_Back2.png"),
                    },
                    50, 85, 55, 65, 65, 90
                );
                break;
            case "Rapidash":
                pokemon = new Pokemon(
                    78,
                    "Rapidash",
                    false,
                    new String[]{"Fire"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Rapidash_Front1.png"),
                        // new Texture("Gen1_Pokemon/Rapidash_Front2.png"),
                        // new Texture("Gen1_Pokemon/Rapidash_Back1.png"),
                        // new Texture("Gen1_Pokemon/Rapidash_Back2.png"),
                    },
                    65, 100, 70, 80, 80, 105
                );
                break;
            case "Slowpoke":
                pokemon = new Pokemon(
                    79,
                    "Slowpoke",
                    false,
                    new String[]{"Water", "Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Slowpoke_Front1.png"),
                        // new Texture("Gen1_Pokemon/Slowpoke_Front2.png"),
                        // new Texture("Gen1_Pokemon/Slowpoke_Back1.png"),
                        // new Texture("Gen1_Pokemon/Slowpoke_Back2.png"),
                    },
                    90, 65, 65, 40, 40, 15
                );
                break;
            case "Slowbro":
                pokemon = new Pokemon(
                    80,
                    "Slowbro",
                    false,
                    new String[]{"Water", "Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Slowbro_Front1.png"),
                        // new Texture("Gen1_Pokemon/Slowbro_Front2.png"),
                        // new Texture("Gen1_Pokemon/Slowbro_Back1.png"),
                        // new Texture("Gen1_Pokemon/Slowbro_Back2.png"),
                    },
                    95, 75, 110, 100, 80, 30
                );
                break;
            case "Magnemite":
                pokemon = new Pokemon(
                    81,
                    "Magnemite",
                    false,
                    new String[]{"Electric", "Steel"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Magnemite_Front1.png"),
                        // new Texture("Gen1_Pokemon/Magnemite_Front2.png"),
                        // new Texture("Gen1_Pokemon/Magnemite_Back1.png"),
                        // new Texture("Gen1_Pokemon/Magnemite_Back2.png"),
                    },
                    25, 35, 70, 95, 55, 45
                );
                break;
            case "Magneton":
                pokemon = new Pokemon(
                    82,
                    "Magneton",
                    false,
                    new String[]{"Electric", "Steel"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Magneton_Front1.png"),
                        // new Texture("Gen1_Pokemon/Magneton_Front2.png"),
                        // new Texture("Gen1_Pokemon/Magneton_Back1.png"),
                        // new Texture("Gen1_Pokemon/Magneton_Back2.png"),
                    },
                    50, 60, 95, 120, 70, 70
                );
                break;
            case "Farfetch'd":
                pokemon = new Pokemon(
                    83,
                    "Farfetch'd",
                    false,
                    new String[]{"Normal", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Farfetchd_Front1.png"),
                        // new Texture("Gen1_Pokemon/Farfetchd_Front2.png"),
                        // new Texture("Gen1_Pokemon/Farfetchd_Back1.png"),
                        // new Texture("Gen1_Pokemon/Farfetchd_Back2.png"),
                    },
                    52, 90, 55, 58, 62, 60
                );
                break;
            case "Doduo":
                pokemon = new Pokemon(
                    84,
                    "Doduo",
                    false,
                    new String[]{"Normal", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Doduo_Front1.png"),
                        // new Texture("Gen1_Pokemon/Doduo_Front2.png"),
                        // new Texture("Gen1_Pokemon/Doduo_Back1.png"),
                        // new Texture("Gen1_Pokemon/Doduo_Back2.png"),
                    },
                    35, 85, 45, 35, 35, 75
                );
                break;
            case "Dodrio":
                pokemon = new Pokemon(
                    85,
                    "Dodrio",
                    false,
                    new String[]{"Normal", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Dodrio_Front1.png"),
                        // new Texture("Gen1_Pokemon/Dodrio_Front2.png"),
                        // new Texture("Gen1_Pokemon/Dodrio_Back1.png"),
                        // new Texture("Gen1_Pokemon/Dodrio_Back2.png"),
                    },
                    60, 110, 70, 60, 60, 110
                );
                break;
            case "Seel":
                pokemon = new Pokemon(
                    86,
                    "Seel",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Seel_Front1.png"),
                        // new Texture("Gen1_Pokemon/Seel_Front2.png"),
                        // new Texture("Gen1_Pokemon/Seel_Back1.png"),
                        // new Texture("Gen1_Pokemon/Seel_Back2.png"),
                    },
                    65, 45, 55, 45, 70, 45
                );
                break;
            case "Dewgong":
                pokemon = new Pokemon(
                    87,
                    "Dewgong",
                    false,
                    new String[]{"Water", "Ice"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Dewgong_Front1.png"),
                        // new Texture("Gen1_Pokemon/Dewgong_Front2.png"),
                        // new Texture("Gen1_Pokemon/Dewgong_Back1.png"),
                        // new Texture("Gen1_Pokemon/Dewgong_Back2.png"),
                    },
                    90, 70, 80, 70, 95, 70
                );
                break;
            case "Grimer":
                pokemon = new Pokemon(
                    88,
                    "Grimer",
                    false,
                    new String[]{"Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Grimer_Front1.png"),
                        // new Texture("Gen1_Pokemon/Grimer_Front2.png"),
                        // new Texture("Gen1_Pokemon/Grimer_Back1.png"),
                        // new Texture("Gen1_Pokemon/Grimer_Back2.png"),
                    },
                    80, 80, 50, 40, 50, 25
                );
                break;
            case "Muk":
                pokemon = new Pokemon(
                    89,
                    "Muk",
                    false,
                    new String[]{"Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Muk_Front1.png"),
                        // new Texture("Gen1_Pokemon/Muk_Front2.png"),
                        // new Texture("Gen1_Pokemon/Muk_Back1.png"),
                        // new Texture("Gen1_Pokemon/Muk_Back2.png"),
                    },
                    105, 105, 75, 65, 100, 50
                );
                break;
            case "Shellder":
                pokemon = new Pokemon(
                    90,
                    "Shellder",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Shellder_Front1.png"),
                        // new Texture("Gen1_Pokemon/Shellder_Front2.png"),
                        // new Texture("Gen1_Pokemon/Shellder_Back1.png"),
                        // new Texture("Gen1_Pokemon/Shellder_Back2.png"),
                    },
                    30, 65, 100, 45, 25, 40
                );
                break;
            case "Cloyster":
                pokemon = new Pokemon(
                    91,
                    "Cloyster",
                    false,
                    new String[]{"Water", "Ice"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Cloyster_Front1.png"),
                        // new Texture("Gen1_Pokemon/Cloyster_Front2.png"),
                        // new Texture("Gen1_Pokemon/Cloyster_Back1.png"),
                        // new Texture("Gen1_Pokemon/Cloyster_Back2.png"),
                    },
                    50, 95, 180, 85, 45, 70
                );
                break;
            case "Gastly":
                pokemon = new Pokemon(
                    92,
                    "Gastly",
                    false,
                    new String[]{"Ghost", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Gastly_Front1.png"),
                        // new Texture("Gen1_Pokemon/Gastly_Front2.png"),
                        // new Texture("Gen1_Pokemon/Gastly_Back1.png"),
                        // new Texture("Gen1_Pokemon/Gastly_Back2.png"),
                    },
                    30, 35, 30, 100, 35, 80
                );
                break;
            case "Haunter":
                pokemon = new Pokemon(
                    93,
                    "Haunter",
                    false,
                    new String[]{"Ghost", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Haunter_Front1.png"),
                        // new Texture("Gen1_Pokemon/Haunter_Front2.png"),
                        // new Texture("Gen1_Pokemon/Haunter_Back1.png"),
                        // new Texture("Gen1_Pokemon/Haunter_Back2.png"),
                    },
                    45, 50, 45, 115, 55, 95
                );
                break;
            case "Gengar":
                pokemon = new Pokemon(
                    94,
                    "Gengar",
                    false,
                    new String[]{"Ghost", "Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Gengar_Front1.png"),
                        // new Texture("Gen1_Pokemon/Gengar_Front2.png"),
                        // new Texture("Gen1_Pokemon/Gengar_Back1.png"),
                        // new Texture("Gen1_Pokemon/Gengar_Back2.png"),
                    },
                    60, 65, 60, 130, 75, 110
                );
                break;
            case "Onix":
                pokemon = new Pokemon(
                    95,
                    "Onix",
                    false,
                    new String[]{"Rock", "Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Onix_Front1.png"),
                        // new Texture("Gen1_Pokemon/Onix_Front2.png"),
                        // new Texture("Gen1_Pokemon/Onix_Back1.png"),
                        // new Texture("Gen1_Pokemon/Onix_Back2.png"),
                    },
                    35, 45, 160, 30, 45, 70
                );
                break;
            case "Drowzee":
                pokemon = new Pokemon(
                    96,
                    "Drowzee",
                    false,
                    new String[]{"Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Drowzee_Front1.png"),
                        // new Texture("Gen1_Pokemon/Drowzee_Front2.png"),
                        // new Texture("Gen1_Pokemon/Drowzee_Back1.png"),
                        // new Texture("Gen1_Pokemon/Drowzee_Back2.png"),
                    },
                    60, 48, 45, 43, 90, 42
                );
                break;
            case "Hypno":
                pokemon = new Pokemon(
                    97,
                    "Hypno",
                    false,
                    new String[]{"Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Hypno_Front1.png"),
                        // new Texture("Gen1_Pokemon/Hypno_Front2.png"),
                        // new Texture("Gen1_Pokemon/Hypno_Back1.png"),
                        // new Texture("Gen1_Pokemon/Hypno_Back2.png"),
                    },
                    85, 73, 70, 73, 115, 67
                );
                break;
            case "Krabby":
                pokemon = new Pokemon(
                    98,
                    "Krabby",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Krabby_Front1.png"),
                        // new Texture("Gen1_Pokemon/Krabby_Front2.png"),
                        // new Texture("Gen1_Pokemon/Krabby_Back1.png"),
                        // new Texture("Gen1_Pokemon/Krabby_Back2.png"),
                    },
                    30, 105, 90, 25, 25, 50
                );
                break;
            case "Kingler":
                pokemon = new Pokemon(
                    99,
                    "Kingler",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Kingler_Front1.png"),
                        // new Texture("Gen1_Pokemon/Kingler_Front2.png"),
                        // new Texture("Gen1_Pokemon/Kingler_Back1.png"),
                        // new Texture("Gen1_Pokemon/Kingler_Back2.png"),
                    },
                    55, 130, 115, 50, 50, 75
                );
                break;
            case "Voltorb":
                pokemon = new Pokemon(
                    100,
                    "Voltorb",
                    false,
                    new String[]{"Electric"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Voltorb_Front1.png"),
                        // new Texture("Gen1_Pokemon/Voltorb_Front2.png"),
                        // new Texture("Gen1_Pokemon/Voltorb_Back1.png"),
                        // new Texture("Gen1_Pokemon/Voltorb_Back2.png"),
                    },
                    40, 30, 50, 55, 55, 100
                );
                break;
            case "Electrode":
                pokemon = new Pokemon(
                    101,
                    "Electrode",
                    false,
                    new String[]{"Electric"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Electrode_Front1.png"),
                        // new Texture("Gen1_Pokemon/Electrode_Front2.png"),
                        // new Texture("Gen1_Pokemon/Electrode_Back1.png"),
                        // new Texture("Gen1_Pokemon/Electrode_Back2.png"),
                    },
                    60, 50, 70, 80, 80, 150
                );
                break;
            case "Exeggcute":
                pokemon = new Pokemon(
                    102,
                    "Exeggcute",
                    false,
                    new String[]{"Grass", "Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Exeggcute_Front1.png"),
                        // new Texture("Gen1_Pokemon/Exeggcute_Front2.png"),
                        // new Texture("Gen1_Pokemon/Exeggcute_Back1.png"),
                        // new Texture("Gen1_Pokemon/Exeggcute_Back2.png"),
                    },
                    60, 40, 80, 60, 45, 40
                );
                break;
            case "Exeggutor":
                pokemon = new Pokemon(
                    103,
                    "Exeggutor",
                    false,
                    new String[]{"Grass", "Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Exeggutor_Front1.png"),
                        // new Texture("Gen1_Pokemon/Exeggutor_Front2.png"),
                        // new Texture("Gen1_Pokemon/Exeggutor_Back1.png"),
                        // new Texture("Gen1_Pokemon/Exeggutor_Back2.png"),
                    },
                    95, 95, 85, 125, 75, 55
                );
                break;
            case "Cubone":
                pokemon = new Pokemon(
                    104,
                    "Cubone",
                    false,
                    new String[]{"Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Cubone_Front1.png"),
                        // new Texture("Gen1_Pokemon/Cubone_Front2.png"),
                        // new Texture("Gen1_Pokemon/Cubone_Back1.png"),
                        // new Texture("Gen1_Pokemon/Cubone_Back2.png"),
                    },
                    50, 50, 95, 40, 50, 35
                );
                break;
            case "Marowak":
                pokemon = new Pokemon(
                    105,
                    "Marowak",
                    false,
                    new String[]{"Ground"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Marowak_Front1.png"),
                        // new Texture("Gen1_Pokemon/Marowak_Front2.png"),
                        // new Texture("Gen1_Pokemon/Marowak_Back1.png"),
                        // new Texture("Gen1_Pokemon/Marowak_Back2.png"),
                    },
                    60, 80, 110, 50, 80, 45
                );
                break;
            case "Hitmonlee":
                pokemon = new Pokemon(
                    106,
                    "Hitmonlee",
                    false,
                    new String[]{"Fighting"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Hitmonlee_Front1.png"),
                        // new Texture("Gen1_Pokemon/Hitmonlee_Front2.png"),
                        // new Texture("Gen1_Pokemon/Hitmonlee_Back1.png"),
                        // new Texture("Gen1_Pokemon/Hitmonlee_Back2.png"),
                    },
                    50, 120, 53, 35, 110, 87
                );
                break;
            case "Hitmonchan":
                pokemon = new Pokemon(
                    107,
                    "Hitmonchan",
                    false,
                    new String[]{"Fighting"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Hitmonchan_Front1.png"),
                        // new Texture("Gen1_Pokemon/Hitmonchan_Front2.png"),
                        // new Texture("Gen1_Pokemon/Hitmonchan_Back1.png"),
                        // new Texture("Gen1_Pokemon/Hitmonchan_Back2.png"),
                    },
                    50, 105, 79, 35, 110, 76
                );
                break;
            case "Lickitung":
                pokemon = new Pokemon(
                    108,
                    "Lickitung",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Lickitung_Front1.png"),
                        // new Texture("Gen1_Pokemon/Lickitung_Front2.png"),
                        // new Texture("Gen1_Pokemon/Lickitung_Back1.png"),
                        // new Texture("Gen1_Pokemon/Lickitung_Back2.png"),
                    },
                    90, 55, 75, 60, 75, 30
                );
                break;
            case "Koffing":
                pokemon = new Pokemon(
                    109,
                    "Koffing",
                    false,
                    new String[]{"Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Koffing_Front1.png"),
                        // new Texture("Gen1_Pokemon/Koffing_Front2.png"),
                        // new Texture("Gen1_Pokemon/Koffing_Back1.png"),
                        // new Texture("Gen1_Pokemon/Koffing_Back2.png"),
                    },
                    40, 65, 95, 60, 45, 35
                );
                break;
            case "Weezing":
                pokemon = new Pokemon(
                    110,
                    "Weezing",
                    false,
                    new String[]{"Poison"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Weezing_Front1.png"),
                        // new Texture("Gen1_Pokemon/Weezing_Front2.png"),
                        // new Texture("Gen1_Pokemon/Weezing_Back1.png"),
                        // new Texture("Gen1_Pokemon/Weezing_Back2.png"),
                    },
                    65, 90, 120, 85, 70, 60
                );
                break;
            case "Rhyhorn":
                pokemon = new Pokemon(
                    111,
                    "Rhyhorn",
                    false,
                    new String[]{"Ground", "Rock"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Rhyhorn_Front1.png"),
                        // new Texture("Gen1_Pokemon/Rhyhorn_Front2.png"),
                        // new Texture("Gen1_Pokemon/Rhyhorn_Back1.png"),
                        // new Texture("Gen1_Pokemon/Rhyhorn_Back2.png"),
                    },
                    80, 85, 95, 30, 30, 25
                );
                break;
            case "Rhydon":
                pokemon = new Pokemon(
                    112,
                    "Rhydon",
                    false,
                    new String[]{"Ground", "Rock"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Rhydon_Front1.png"),
                        // new Texture("Gen1_Pokemon/Rhydon_Front2.png"),
                        // new Texture("Gen1_Pokemon/Rhydon_Back1.png"),
                        // new Texture("Gen1_Pokemon/Rhydon_Back2.png"),
                    },
                    105, 130, 120, 45, 45, 40
                );
                break;
            case "Chansey":
                pokemon = new Pokemon(
                    113,
                    "Chansey",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Chansey_Front1.png"),
                        // new Texture("Gen1_Pokemon/Chansey_Front2.png"),
                        // new Texture("Gen1_Pokemon/Chansey_Back1.png"),
                        // new Texture("Gen1_Pokemon/Chansey_Back2.png"),
                    },
                    250, 5, 5, 35, 105, 50
                );
                break;
            case "Tangela":
                pokemon = new Pokemon(
                    114,
                    "Tangela",
                    false,
                    new String[]{"Grass"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Tangela_Front1.png"),
                        // new Texture("Gen1_Pokemon/Tangela_Front2.png"),
                        // new Texture("Gen1_Pokemon/Tangela_Back1.png"),
                        // new Texture("Gen1_Pokemon/Tangela_Back2.png"),
                    },
                    65, 55, 115, 100, 40, 60
                );
                break;
            case "Kangaskhan":
                pokemon = new Pokemon(
                    115,
                    "Kangaskhan",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Kangaskhan_Front1.png"),
                        // new Texture("Gen1_Pokemon/Kangaskhan_Front2.png"),
                        // new Texture("Gen1_Pokemon/Kangaskhan_Back1.png"),
                        // new Texture("Gen1_Pokemon/Kangaskhan_Back2.png"),
                    },
                    105, 95, 80, 40, 80, 90
                );
                break;
            case "Horsea":
                pokemon = new Pokemon(
                    116,
                    "Horsea",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Horsea_Front1.png"),
                        // new Texture("Gen1_Pokemon/Horsea_Front2.png"),
                        // new Texture("Gen1_Pokemon/Horsea_Back1.png"),
                        // new Texture("Gen1_Pokemon/Horsea_Back2.png"),
                    },
                    30, 40, 70, 70, 25, 60
                );
                break;
            case "Seadra":
                pokemon = new Pokemon(
                    117,
                    "Seadra",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Seadra_Front1.png"),
                        // new Texture("Gen1_Pokemon/Seadra_Front2.png"),
                        // new Texture("Gen1_Pokemon/Seadra_Back1.png"),
                        // new Texture("Gen1_Pokemon/Seadra_Back2.png"),
                    },
                    55, 65, 95, 95, 45, 85
                );
                break;
            case "Goldeen":
                pokemon = new Pokemon(
                    118,
                    "Goldeen",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Goldeen_Front1.png"),
                        // new Texture("Gen1_Pokemon/Goldeen_Front2.png"),
                        // new Texture("Gen1_Pokemon/Goldeen_Back1.png"),
                        // new Texture("Gen1_Pokemon/Goldeen_Back2.png"),
                    },
                    45, 67, 60, 35, 50, 63
                );
                break;
            case "Seaking":
                pokemon = new Pokemon(
                    119,
                    "Seaking",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Seaking_Front1.png"),
                        // new Texture("Gen1_Pokemon/Seaking_Front2.png"),
                        // new Texture("Gen1_Pokemon/Seaking_Back1.png"),
                        // new Texture("Gen1_Pokemon/Seaking_Back2.png"),
                    },
                    80, 92, 65, 65, 80, 68
                );
                break;
            case "Staryu":
                pokemon = new Pokemon(
                    120,
                    "Staryu",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Staryu_Front1.png"),
                        // new Texture("Gen1_Pokemon/Staryu_Front2.png"),
                        // new Texture("Gen1_Pokemon/Staryu_Back1.png"),
                        // new Texture("Gen1_Pokemon/Staryu_Back2.png"),
                    },
                    30, 45, 55, 70, 55, 85
                );
                break;
            case "Starmie":
                pokemon = new Pokemon(
                    121,
                    "Starmie",
                    false,
                    new String[]{"Water", "Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Starmie_Front1.png"),
                        // new Texture("Gen1_Pokemon/Starmie_Front2.png"),
                        // new Texture("Gen1_Pokemon/Starmie_Back1.png"),
                        // new Texture("Gen1_Pokemon/Starmie_Back2.png"),
                    },
                    60, 75, 85, 100, 85, 115
                );
                break;
            case "Mr. Mime":
                pokemon = new Pokemon(
                    122,
                    "Mr. Mime",
                    false,
                    new String[]{"Psychic", "Fairy"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/MrMime_Front1.png"),
                        // new Texture("Gen1_Pokemon/MrMime_Front2.png"),
                        // new Texture("Gen1_Pokemon/MrMime_Back1.png"),
                        // new Texture("Gen1_Pokemon/MrMime_Back2.png"),
                    },
                    40, 45, 65, 100, 120, 90
                );
                break;
            case "Scyther":
                pokemon = new Pokemon(
                    123,
                    "Scyther",
                    false,
                    new String[]{"Bug", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Scyther_Front1.png"),
                        // new Texture("Gen1_Pokemon/Scyther_Front2.png"),
                        // new Texture("Gen1_Pokemon/Scyther_Back1.png"),
                        // new Texture("Gen1_Pokemon/Scyther_Back2.png"),
                    },
                    70, 110, 80, 55, 80, 105
                );
                break;
            case "Jynx":
                pokemon = new Pokemon(
                    124,
                    "Jynx",
                    false,
                    new String[]{"Ice", "Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Jynx_Front1.png"),
                        // new Texture("Gen1_Pokemon/Jynx_Front2.png"),
                        // new Texture("Gen1_Pokemon/Jynx_Back1.png"),
                        // new Texture("Gen1_Pokemon/Jynx_Back2.png"),
                    },
                    65, 50, 35, 115, 95, 95
                );
                break;
            case "Electabuzz":
                pokemon = new Pokemon(
                    125,
                    "Electabuzz",
                    false,
                    new String[]{"Electric"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Electabuzz_Front1.png"),
                        // new Texture("Gen1_Pokemon/Electabuzz_Front2.png"),
                        // new Texture("Gen1_Pokemon/Electabuzz_Back1.png"),
                        // new Texture("Gen1_Pokemon/Electabuzz_Back2.png"),
                    },
                    65, 83, 57, 95, 85, 105
                );
                break;
            case "Magmar":
                pokemon = new Pokemon(
                    126,
                    "Magmar",
                    false,
                    new String[]{"Fire"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Magmar_Front1.png"),
                        // new Texture("Gen1_Pokemon/Magmar_Front2.png"),
                        // new Texture("Gen1_Pokemon/Magmar_Back1.png"),
                        // new Texture("Gen1_Pokemon/Magmar_Back2.png"),
                    },
                    65, 95, 57, 100, 85, 93
                );
                break;
            case "Pinsir":
                pokemon = new Pokemon(
                    127,
                    "Pinsir",
                    false,
                    new String[]{"Bug"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Pinsir_Front1.png"),
                        // new Texture("Gen1_Pokemon/Pinsir_Front2.png"),
                        // new Texture("Gen1_Pokemon/Pinsir_Back1.png"),
                        // new Texture("Gen1_Pokemon/Pinsir_Back2.png"),
                    },
                    65, 125, 100, 55, 70, 85
                );
                break;
            case "Tauros":
                pokemon = new Pokemon(
                    128,
                    "Tauros",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Tauros_Front1.png"),
                        // new Texture("Gen1_Pokemon/Tauros_Front2.png"),
                        // new Texture("Gen1_Pokemon/Tauros_Back1.png"),
                        // new Texture("Gen1_Pokemon/Tauros_Back2.png"),
                    },
                    75, 100, 95, 40, 70, 110
                );
                break;
            case "Magikarp":
                pokemon = new Pokemon(
                    129,
                    "Magikarp",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Magikarp_Front1.png"),
                        // new Texture("Gen1_Pokemon/Magikarp_Front2.png"),
                        // new Texture("Gen1_Pokemon/Magikarp_Back1.png"),
                        // new Texture("Gen1_Pokemon/Magikarp_Back2.png"),
                    },
                    20, 10, 55, 15, 20, 80
                );
                break;
            case "Gyarados":
                pokemon = new Pokemon(
                    130,
                    "Gyarados",
                    false,
                    new String[]{"Water", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Gyarados_Front1.png"),
                        // new Texture("Gen1_Pokemon/Gyarados_Front2.png"),
                        // new Texture("Gen1_Pokemon/Gyarados_Back1.png"),
                        // new Texture("Gen1_Pokemon/Gyarados_Back2.png"),
                    },
                    95, 125, 79, 60, 100, 81
                );
                break;
            case "Lapras":
                pokemon = new Pokemon(
                    131,
                    "Lapras",
                    false,
                    new String[]{"Water", "Ice"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Lapras_Front1.png"),
                        // new Texture("Gen1_Pokemon/Lapras_Front2.png"),
                        // new Texture("Gen1_Pokemon/Lapras_Back1.png"),
                        // new Texture("Gen1_Pokemon/Lapras_Back2.png"),
                    },
                    130, 85, 80, 85, 95, 60
                );
                break;
            case "Ditto":
                pokemon = new Pokemon(
                    132,
                    "Ditto",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Ditto_Front1.png"),
                        // new Texture("Gen1_Pokemon/Ditto_Front2.png"),
                        // new Texture("Gen1_Pokemon/Ditto_Back1.png"),
                        // new Texture("Gen1_Pokemon/Ditto_Back2.png"),
                    },
                    48, 48, 48, 48, 48, 48
                );
                break;
            case "Eevee":
                pokemon = new Pokemon(
                    133,
                    "Eevee",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Eevee_Front1.png"),
                        // new Texture("Gen1_Pokemon/Eevee_Front2.png"),
                        // new Texture("Gen1_Pokemon/Eevee_Back1.png"),
                        // new Texture("Gen1_Pokemon/Eevee_Back2.png"),
                    },
                    55, 55, 50, 45, 65, 55
                );
                break;
            case "Vaporeon":
                pokemon = new Pokemon(
                    134,
                    "Vaporeon",
                    false,
                    new String[]{"Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Vaporeon_Front1.png"),
                        // new Texture("Gen1_Pokemon/Vaporeon_Front2.png"),
                        // new Texture("Gen1_Pokemon/Vaporeon_Back1.png"),
                        // new Texture("Gen1_Pokemon/Vaporeon_Back2.png"),
                    },
                    130, 65, 60, 110, 95, 65
                );
                break;
            case "Jolteon":
                pokemon = new Pokemon(
                    135,
                    "Jolteon",
                    false,
                    new String[]{"Electric"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Jolteon_Front1.png"),
                        // new Texture("Gen1_Pokemon/Jolteon_Front2.png"),
                        // new Texture("Gen1_Pokemon/Jolteon_Back1.png"),
                        // new Texture("Gen1_Pokemon/Jolteon_Back2.png"),
                    },
                    65, 65, 60, 110, 95, 130
                );
                break;
            case "Flareon":
                pokemon = new Pokemon(
                    136,
                    "Flareon",
                    false,
                    new String[]{"Fire"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Flareon_Front1.png"),
                        // new Texture("Gen1_Pokemon/Flareon_Front2.png"),
                        // new Texture("Gen1_Pokemon/Flareon_Back1.png"),
                        // new Texture("Gen1_Pokemon/Flareon_Back2.png"),
                    },
                    65, 130, 60, 95, 110, 65
                );
                break;
            case "Porygon":
                pokemon = new Pokemon(
                    137,
                    "Porygon",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Porygon_Front1.png"),
                        // new Texture("Gen1_Pokemon/Porygon_Front2.png"),
                        // new Texture("Gen1_Pokemon/Porygon_Back1.png"),
                        // new Texture("Gen1_Pokemon/Porygon_Back2.png"),
                    },
                    65, 60, 70, 85, 75, 40
                );
                break;
            case "Omanyte":
                pokemon = new Pokemon(
                    138,
                    "Omanyte",
                    false,
                    new String[]{"Rock", "Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Omanyte_Front1.png"),
                        // new Texture("Gen1_Pokemon/Omanyte_Front2.png"),
                        // new Texture("Gen1_Pokemon/Omanyte_Back1.png"),
                        // new Texture("Gen1_Pokemon/Omanyte_Back2.png"),
                    },
                    35, 40, 100, 90, 55, 35
                );
                break;
            case "Omastar":
                pokemon = new Pokemon(
                    139,
                    "Omastar",
                    false,
                    new String[]{"Rock", "Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Omastar_Front1.png"),
                        // new Texture("Gen1_Pokemon/Omastar_Front2.png"),
                        // new Texture("Gen1_Pokemon/Omastar_Back1.png"),
                        // new Texture("Gen1_Pokemon/Omastar_Back2.png"),
                    },
                    70, 60, 125, 115, 70, 55
                );
                break;
            case "Kabuto":
                pokemon = new Pokemon(
                    140,
                    "Kabuto",
                    false,
                    new String[]{"Rock", "Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Kabuto_Front1.png"),
                        // new Texture("Gen1_Pokemon/Kabuto_Front2.png"),
                        // new Texture("Gen1_Pokemon/Kabuto_Back1.png"),
                        // new Texture("Gen1_Pokemon/Kabuto_Back2.png"),
                    },
                    30, 80, 90, 55, 45, 55
                );
                break;
            case "Kabutops":
                pokemon = new Pokemon(
                    141,
                    "Kabutops",
                    false,
                    new String[]{"Rock", "Water"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Kabutops_Front1.png"),
                        // new Texture("Gen1_Pokemon/Kabutops_Front2.png"),
                        // new Texture("Gen1_Pokemon/Kabutops_Back1.png"),
                        // new Texture("Gen1_Pokemon/Kabutops_Back2.png"),
                    },
                    60, 115, 105, 65, 70, 80
                );
                break;
            case "Aerodactyl":
                pokemon = new Pokemon(
                    142,
                    "Aerodactyl",
                    false,
                    new String[]{"Rock", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Aerodactyl_Front1.png"),
                        // new Texture("Gen1_Pokemon/Aerodactyl_Front2.png"),
                        // new Texture("Gen1_Pokemon/Aerodactyl_Back1.png"),
                        // new Texture("Gen1_Pokemon/Aerodactyl_Back2.png"),
                    },
                    80, 105, 65, 60, 75, 130
                );
                break;
            case "Snorlax":
                pokemon = new Pokemon(
                    143,
                    "Snorlax",
                    false,
                    new String[]{"Normal"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Snorlax_Front1.png"),
                        // new Texture("Gen1_Pokemon/Snorlax_Front2.png"),
                        // new Texture("Gen1_Pokemon/Snorlax_Back1.png"),
                        // new Texture("Gen1_Pokemon/Snorlax_Back2.png"),
                    },
                    160, 110, 65, 65, 110, 30
                );
                break;
            case "Articuno":
                pokemon = new Pokemon(
                    144,
                    "Articuno",
                    false,
                    new String[]{"Ice", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Articuno_Front1.png"),
                        // new Texture("Gen1_Pokemon/Articuno_Front2.png"),
                        // new Texture("Gen1_Pokemon/Articuno_Back1.png"),
                        // new Texture("Gen1_Pokemon/Articuno_Back2.png"),
                    },
                    90, 85, 100, 95, 125, 85
                );
                break;
            case "Zapdos":
                pokemon = new Pokemon(
                    145,
                    "Zapdos",
                    false,
                    new String[]{"Electric", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Zapdos_Front1.png"),
                        // new Texture("Gen1_Pokemon/Zapdos_Front2.png"),
                        // new Texture("Gen1_Pokemon/Zapdos_Back1.png"),
                        // new Texture("Gen1_Pokemon/Zapdos_Back2.png"),
                    },
                    90, 90, 85, 125, 90, 100
                );
                break;
            case "Moltres":
                pokemon = new Pokemon(
                    146,
                    "Moltres",
                    false,
                    new String[]{"Fire", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Moltres_Front1.png"),
                        // new Texture("Gen1_Pokemon/Moltres_Front2.png"),
                        // new Texture("Gen1_Pokemon/Moltres_Back1.png"),
                        // new Texture("Gen1_Pokemon/Moltres_Back2.png"),
                    },
                    90, 100, 90, 125, 85, 90
                );
                break;
            case "Dratini":
                pokemon = new Pokemon(
                    147,
                    "Dratini",
                    false,
                    new String[]{"Dragon"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Dratini_Front1.png"),
                        // new Texture("Gen1_Pokemon/Dratini_Front2.png"),
                        // new Texture("Gen1_Pokemon/Dratini_Back1.png"),
                        // new Texture("Gen1_Pokemon/Dratini_Back2.png"),
                    },
                    41, 64, 45, 50, 50, 50
                );
                break;
            case "Dragonair":
                pokemon = new Pokemon(
                    148,
                    "Dragonair",
                    false,
                    new String[]{"Dragon"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Dragonair_Front1.png"),
                        // new Texture("Gen1_Pokemon/Dragonair_Front2.png"),
                        // new Texture("Gen1_Pokemon/Dragonair_Back1.png"),
                        // new Texture("Gen1_Pokemon/Dragonair_Back2.png"),
                    },
                    61, 84, 65, 70, 70, 70
                );
                break;
            case "Dragonite":
                pokemon = new Pokemon(
                    149,
                    "Dragonite",
                    false,
                    new String[]{"Dragon", "Flying"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Dragonite_Front1.png"),
                        // new Texture("Gen1_Pokemon/Dragonite_Front2.png"),
                        // new Texture("Gen1_Pokemon/Dragonite_Back1.png"),
                        // new Texture("Gen1_Pokemon/Dragonite_Back2.png"),
                    },
                    91, 134, 95, 100, 100, 80
                );
                break;
            case "Mewtwo":
                pokemon = new Pokemon(
                    150,
                    "Mewtwo",
                    false,
                    new String[]{"Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Mewtwo_Front1.png"),
                        // new Texture("Gen1_Pokemon/Mewtwo_Front2.png"),
                        // new Texture("Gen1_Pokemon/Mewtwo_Back1.png"),
                        // new Texture("Gen1_Pokemon/Mewtwo_Back2.png"),
                    },
                    106, 110, 90, 154, 90, 130
                );
                break;
            case "Mew":
                pokemon = new Pokemon(
                    151,
                    "Mew",
                    false,
                    new String[]{"Psychic"},
                    new Texture[]{
                        // new Texture("Gen1_Pokemon/Mew_Front1.png"),
                        // new Texture("Gen1_Pokemon/Mew_Front2.png"),
                        // new Texture("Gen1_Pokemon/Mew_Back1.png"),
                        // new Texture("Gen1_Pokemon/Mew_Back2.png"),
                    },
                    100, 100, 100, 100, 100, 100
                );
                break;
            // Gen4 Pokemon
            case "Spiritomb":
                pokemon = new Pokemon(
                    442,
                    "Spiritomb",
                    false,
                    new String[]{"Ghost", "Dark"},
                    new Texture[]{
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
