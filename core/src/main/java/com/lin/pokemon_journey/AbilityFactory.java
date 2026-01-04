package com.lin.pokemon_journey;

import java.util.HashMap;
import java.util.Map;

public class AbilityFactory {
    private AbilityFactory() {
    }
    private static final Map<String, Ability> abilityMap = new HashMap<>();
    public static Ability createAbility(String abilityName) {
        if (abilityMap.containsKey(abilityName)) {
            return abilityMap.get(abilityName);
        }
        Ability ability;
        switch (abilityName) {
            //Bug
            case "Silver Wind":
                ability = new Ability("Silver Wind", "Bug", "Special", 60, 100, 5, "The target is attacked with powdery scales blown by wind. It may also raise all the user’s stats.");
                break;
            //Dark
            case "Dark Pulse":
                ability = new Ability("Dark Pulse", "Dark", "Special", 80, 100, 15, "The user releases a horrible aura imbued with dark thoughts. It may also make the target flinch.");
                break;
            case "Embargo":
                ability = new Ability("Embargo", "Dark", "Status", 0, 100, 15, "t prevents the target from using its held item. Its Trainer is also prevented from using items on it.");
                break;
            //Dragon
            //Electric
            //Fighting
            //Fire
            case "Ember":
                ability = new Ability("Ember", "Fire", "Special", 40, 100, 25, "");
                break;
            case "Overheat":
                ability = new Ability("Overheat", "Fire", "Special", 130, 90, 5, "The user attacks the foe at full power. The attack's recoil sharply reduces the user's Sp. Atk stat.");
                break;
            //Flying
            //Ghost
            //Grass
            //Ground
            //Ice
            //Normal
            case "Growl":
                ability = new Ability("Growl", "Normal", "Status", 0, 100, 40, "");
                break;
            case "Scratch":
                ability = new Ability("Scratch", "Normal", "Physical", 40, 100, 35, "");
                break;
            //Poison
            //Psychic
            case "Psychic":
                ability = new Ability("Psychic", "Psychic", "Special", 90, 100, 10, "The target is hit by a strong telekinetic force. It may also reduce the target's Sp. Def stat.");
                break;
            //Rock
            //Steel
            //Water
            default:
                throw new IllegalArgumentException("Unknown Ability: " + abilityName);
        }
        abilityMap.put(abilityName, ability);
        return ability;
    }
}
