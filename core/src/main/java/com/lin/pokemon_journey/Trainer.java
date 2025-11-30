package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;

public class Trainer {
    String name;
    Pokemon[] pokemons;
    Texture[] sprites;
    int PokemonAvailable;
    public Trainer(String name, Pokemon[] pokemons, Texture[] sprites) {
        this.name = name;
        this.pokemons = pokemons;
        this.sprites = sprites;
        this.PokemonAvailable = pokemons.length;
    }

    public BattleMove nextMove(Pokemon currentPokemon, Pokemon opponent) {
        int score = 0;
        Map<BattleMove, Integer> possibleMoves = new HashMap<>();
        for (Ability ability: currentPokemon.abilities) {
            UseAbility move = new UseAbility(currentPokemon, opponent, ability);
            double damageMultiplier = move.damage_multiply(ability.type, opponent.type);
            if (damageMultiplier == 0) {
                possibleMoves.put(move, -999);
                continue;
            } else if (damageMultiplier > 0) {

            }
            for (int i = 0; i < opponent.type.length; i++) {
                if (ability.type.equals(opponent.type[i])) {
                    score += 10;
                }
            }
            possibleMoves.put(move, score);
        }

        return new BattleMove(0,"");
    }
}
