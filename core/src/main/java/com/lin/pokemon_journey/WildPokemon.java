package com.lin.pokemon_journey;

public class WildPokemon extends Opponent {
    Pokemon pokemon;
    public WildPokemon(Pokemon pokemon) {
        super("Wild " + pokemon.name);
        this.pokemon = pokemon;
    }
    @Override
    public BattleMove nextMove(Pokemon currentPokemon, Pokemon opponent) {
        return new UseAbility(currentPokemon, opponent, UseAbility.bestAbility(this));
    }
}
