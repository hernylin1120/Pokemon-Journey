package com.lin.pokemon_journey;

import static java.lang.Math.floorDiv;

public class AbilityCalculator {
    public static int floorMul(double a, double b) {
        return (int) Math.floor(a * b);
    }
    public static float damage_multiply(String attackType, String[] defenderType) {
        float[][] multiply_chart = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5f, 0, 1, 1, 0.5f, 1},
            {1, 0.5f, 0.5f, 2, 1, 2, 1, 1, 1, 1, 1, 2, 0.5f, 1, 0.5f, 1, 2, 1},
            {1, 2, 0.5f, 0.5f, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 0.5f, 1, 1, 1},
            {1, 0.5f, 2, 0.5f, 1, 1, 1, 0.5f, 2, 0.5f, 1, 0.5f, 2, 1, 0.5f, 1, 0.5f, 1},
            {1, 1, 2, 0.5f, 0.5f, 1, 1, 1, 0, 2, 1, 1, 1, 1, 0.5f, 1, 1, 1},
            {1, 0.5f, 0.5f, 2, 1, 0.5f, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 0.5f, 1},
            {2, 1, 1, 1, 1, 2, 1, 0.5f, 1, 0.5f, 0.5f, 0.5f, 2, 0, 1, 2, 2, 0.5f},
            {1, 1, 1, 2, 1, 1, 1, 0.5f, 0.5f, 1, 1, 1, 0.5f, 0.5f, 1, 1, 0, 2},
            {1, 2, 1, 0.5f, 2, 1, 1, 2, 1, 0, 1, 0.5f, 2, 1, 1, 1, 2, 1},
            {1, 1, 1, 2, 0.5f, 1, 2, 1, 1, 1, 1, 2, 0.5f, 1, 1, 1, 0.5f, 1},
            {1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 0.5f, 1, 1, 1, 1, 0, 0.5f, 1},
            {1, 0.5f, 1, 2, 1, 1, 0.5f, 0.5f, 1, 0.5f, 2, 1, 1, 0.5f, 1, 2, 0.5f, 0.5f},
            {1, 2, 1, 1, 1, 2, 0.5f, 1, 0.5f, 2, 1, 2, 1, 1, 1, 1, 0.5f, 1},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 0.5f, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 0.5f, 0},
            {1, 1, 1, 1, 1, 1, 0.5f, 1, 1, 1, 2, 1, 1, 2, 1, 0.5f, 1, 0.5f},
            {1, 0.5f, 0.5f, 1, 0.5f, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 0.5f, 2},
            {1, 0.5f, 1, 1, 1, 1, 2, 0.5f, 1, 1, 1, 1, 1, 1, 2, 2, 0.5f, 1}
        };
        int attackTypeInt = getRelativeInt(attackType);
        int defenderTypeInt1 = getRelativeInt(defenderType[0]);
        int defenderTypeInt2;
        float multiplier;
        if (defenderType.length > 1) {
            defenderTypeInt2 = getRelativeInt(defenderType[1]);
            multiplier = multiply_chart[attackTypeInt][defenderTypeInt1] * multiply_chart[attackTypeInt][defenderTypeInt2];
        } else {
            multiplier = multiply_chart[attackTypeInt][defenderTypeInt1];
        }
        return multiplier;
    }
    public static int damage_formula(int attack, int defense, int level, Ability ability, float multiplier) {
        return floorMul((floorDiv(((floorDiv(2 * level, 5) + 2) * ability.power * floorDiv(attack, defense)), 50) + 2), multiplier);
    }
    public static int getRelativeInt(String type) {
        switch (type) {
            case "Normal":
                return 0;
            case "Fire":
                return 1;
            case "Water":
                return 2;
            case "Grass":
                return 3;
            case "Electric":
                return 4;
            case "Ice":
                return 5;
            case "Fighting":
                return 6;
            case "Poison":
                return 7;
            case "Ground":
                return 8;
            case "Flying":
                return 9;
            case "Psychic":
                return 10;
            case "Bug":
                return 11;
            case "Rock":
                return 12;
            case "Ghost":
                return 13;
            case "Dragon":
                return 14;
            case "Dark":
                return 15;
            case "Steel":
                return 16;
            case "Fairy":
                return 17;
            default:
                return -1;
        }
    }
    public static String abilityDamage(Pokemon attacker, Pokemon target, Ability ability) {
        int attack = 0;
        int defense = 0;
        int level = attacker.level;
        float multiplier = damage_multiply(ability.type, target.type);
        ability.currentPP--;
        switch (ability.category) {
            case "Physical":
                attack = attacker.currentAttack;
                defense = target.currentDefense;
                break;
            case "Special":
                attack = attacker.currentSpecialAttack;
                defense = target.currentSpecialDefense;
                break;
            case "Status":
                break;
        }
        target.currentHP -= AbilityCalculator.damage_formula(attack, defense, level, ability, multiplier);
        if (multiplier == 0) {
            return "It doesn't affect " + target.name + "...";
        } else if (multiplier < 1) {
            return "It's not very effective...";
        } else if (multiplier > 1) {
            return "It's super effective!";
        }
        return "";
    }
}
