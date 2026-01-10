package com.lin.pokemon_journey;

public class SwitchPokemon extends BattleMove {
    Pokemon selectedPokemon;
    Object whoUse;
    public SwitchPokemon(Object whoUse, Pokemon selectedPokemon, String[] subtitle) {
        super(20, subtitle);
        this.selectedPokemon = selectedPokemon;
        this.whoUse = whoUse;
    }
    public void activate() {
        if (whoUse instanceof Player) {
            ((Player) whoUse).currentPokemon = selectedPokemon;
        } else if (whoUse instanceof Trainer) {
            ((Trainer) whoUse).currentPokemon = selectedPokemon;
        }
    }
}
