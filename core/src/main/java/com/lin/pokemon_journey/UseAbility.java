package com.lin.pokemon_journey;

public class UseAbility extends BattleMove {
    Ability ability;
    Pokemon attacker;
    Pokemon target;
    public static void bestAbility(Opponent type) {
        if (type instanceof WildPokemon) {

        } else if (type instanceof Trainer) {
            if (!((Trainer) type).advance) {
                
            } else {

            }
        }
    }
    public UseAbility(Pokemon attacker, Pokemon target, Ability ability) {
        super(ability.priority, attacker.name + " used " + ability.name + ".");
        this.attacker = attacker;
        this.target = target;
        this.ability = ability;
    }
    @Override
    public void activate() {
        ability.currentPP--;
        AbilityCalculator.abilityDamage(attacker, target, ability);
    }
}
