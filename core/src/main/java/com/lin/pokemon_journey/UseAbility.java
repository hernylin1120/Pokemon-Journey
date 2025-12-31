package com.lin.pokemon_journey;

import java.util.Arrays;
import java.util.Objects;

public class UseAbility extends BattleMove {
    Ability ability;
    Pokemon attacker;
    Pokemon target;
    public static Ability bestAbility(Opponent type) {
        if (type instanceof WildPokemon) {
            int range = (int) Arrays.stream(((WildPokemon) type).pokemon.abilities).filter(Objects::nonNull).count();
            return ((WildPokemon) type).pokemon.abilities[new java.util.Random().nextInt(range)];
        } else if (type instanceof Trainer) {
            if (!((Trainer) type).advance) {

            } else {

            }
        }
        return null;
    }
    public UseAbility(Pokemon attacker, Pokemon target, Ability ability) {
        super(ability.priority, attacker.name + " used " + ability.name + ".");
        this.attacker = attacker;
        this.target = target;
        this.ability = ability;
    }
    @Override
    public void activate() {
        System.out.println(this.target.name);
        ability.useAbility();
        AbilityCalculator.abilityDamage(attacker, target, ability);
        this.effect = AbilityCalculator.effectiveness;
    }
}
