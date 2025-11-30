package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;

public class TrainerFactory {
    private static final Map<String, Trainer> trainerMap = new HashMap<>();
    public static Trainer createTrainer(String trainerName) {
        if (trainerMap.containsKey(trainerName)) {
            return trainerMap.get(trainerName);
        }
        Trainer trainer;
        switch (trainerName) {
            //Gen4 Opponents
            case "Cynthia":
                trainer = new Trainer(
                    "Cynthia",
                    new Pokemon[] {
                        PokemonFactory.createPokemon("Spiritomb"),
//                        PokemonFactory.createPokemon("Roserade"),
//                        PokemonFactory.createPokemon("Gastrodon"),
//                        PokemonFactory.createPokemon("Lucario"),
//                        PokemonFactory.createPokemon("Milotic"),
//                        PokemonFactory.createPokemon("Garchomp")
                    },
                    new Texture[] {
                        new Texture("Gen4_Trainer/Cynthia_Front1.png"),
                        new Texture("Gen4_Trainer/Cynthia_Front2.png"),
                        new Texture("Gen4_Trainer/Cynthia_Front3.png"),
                    }
                );
                trainer.pokemons[0].setLevel(58);
                trainer.pokemons[0].abilities = new Ability[] {
                    AbilityFactory.createAbility("Dark Pulse"),
                    AbilityFactory.createAbility("Psychic"),
                    AbilityFactory.createAbility("Silver Wind"),
                    AbilityFactory.createAbility("Embargo"),
                };
                //trainer.pokemons[1].setLevel(58);
                //trainer.pokemons[2].setLevel(60);
                //trainer.pokemons[3].setLevel(60);
                //trainer.pokemons[4].setLevel(58);
                //trainer.pokemons[5].setLevel(62);
                break;
                default:
                throw new IllegalArgumentException("Unknown Trainer: " + trainerName);
        }
        trainerMap.put(trainerName, trainer);
        return trainer;
    }
}
