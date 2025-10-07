package com.lin.pokemon_journey;

import java.util.HashMap;
import java.util.Map;

public class AbilityFactory {
    private static final Map<String, Ability> abilityMap = new HashMap<>();

    public static Ability createAbility(String abilityName) {
        if (abilityMap.containsKey(abilityName)) {
            return abilityMap.get(abilityName);
        }
        Ability ability;
        switch (abilityName) {
            case "Growl":
                ability = new Ability("Growl", "Normal", "Status", 0, 100);
                break;
            case "Scratch":
                ability = new Ability("Scratch", "Normal", "Physical", 40, 100);
                break;
            case "Ember":
                ability = new Ability("Ember", "Fire", "Special", 40, 100);
                break;
            default:
                throw new IllegalArgumentException("Unknown Ability: " + abilityName);
        }
        abilityMap.put(abilityName, ability);
        return ability;
    }
}
