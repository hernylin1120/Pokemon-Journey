package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;

public class Trainer extends Opponent {
    String name;
    Boolean advance = false;
    Pokemon[] pokemons;
    Texture[] sprites;
    int PokemonAvailable;
    Pokemon currentPokemon;
    public Trainer(String name, Pokemon[] pokemons, Texture[] sprites) {
        super(name);
        this.pokemons = pokemons;
        this.sprites = sprites;
        this.PokemonAvailable = pokemons.length;
    }
    @Override
    public BattleMove nextMove(Pokemon currentPokemon, Pokemon opponent) {
//        int score = 0;
//        Map<BattleMove, Integer> possibleMoves = new HashMap<>();
//        for (Ability ability: currentPokemon.abilities) {
//            UseAbility move = new UseAbility(currentPokemon, opponent, ability);
//            double damageMultiplier = AbilityCalculator.damage_multiply(ability.type, opponent.type);
//            if (damageMultiplier == 0) {
//                possibleMoves.put(move, -999);
//                continue;
//            } else if (damageMultiplier > 0) {
//
//            }
//            for (int i = 0; i < opponent.type.length; i++) {
//                if (ability.type.equals(opponent.type[i])) {
//                    score += 10;
//                }
//            }
//            possibleMoves.put(move, score);
//        }

        return new UseAbility(currentPokemon, opponent, currentPokemon.abilities[0], new String[] {"The opposing " + currentPokemon.name + "used " + currentPokemon.abilities[0].name});
    }
}
