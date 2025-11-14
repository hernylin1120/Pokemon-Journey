package com.lin.pokemon_journey;

public class UseAbility extends BattleMove {
    Ability ability;
    Pokemon attacker;
    Pokemon target;
    public double damage_multiply(String attackType, String[] defenderType) {
        double[][] multiply_chart = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 0, 1, 1, 0.5, 1},
            {1, 0.5, 0.5, 2, 1, 2, 1, 1, 1, 1, 1, 2, 0.5, 1, 0.5, 1, 2, 1},
            {1, 2, 0.5, 0.5, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 1, 1},
            {1, 0.5, 2, 0.5, 1, 1, 1, 0.5, 2, 0.5, 1, 0.5, 2, 1, 0.5, 1, 0.5, 1},
            {1, 1, 2, 0.5, 0.5, 1, 1, 1, 0, 2, 1, 1, 1, 1, 0.5, 1, 1, 1},
            {1, 0.5, 0.5, 2, 1, 0.5, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 0.5, 1},
            {2, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 0.5, 2, 0, 1, 2, 2, 0.5},
            {1, 1, 1, 2, 1, 1, 1, 0.5, 0.5, 1, 1, 1, 0.5, 0.5, 1, 1, 0, 2},
            {1, 2, 1, 0.5, 2, 1, 1, 2, 1, 0, 1, 0.5, 2, 1, 1, 1, 2, 1},
            {1, 1, 1, 2, 0.5, 1, 2, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 0.5, 1},
            {1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 0.5, 1, 1, 1, 1, 0, 0.5, 1},
            {1, 0.5, 1, 2, 1, 1, 0.5, 0.5, 1, 0.5, 2, 1, 1, 0.5, 1, 2, 0.5, 0.5},
            {1, 2, 1, 1, 1, 2, 0.5, 1, 0.5, 2, 1, 2, 1, 1, 1, 1, 0.5, 1},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 0.5, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 0.5, 0},
            {1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 2, 1, 1, 2, 1, 0.5, 1, 0.5},
            {1, 0.5, 0.5, 1, 0.5, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 0.5, 2},
            {1, 0.5, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 1, 1, 1, 2, 2, 0.5, 1}
        };
        int attackTypeInt = getRelativeInt(attackType);
        int defenderTypeInt1 = getRelativeInt(defenderType[0]);
        int defenderTypeInt2;
        double multiplier;
        if (defenderType.length > 1) {
            defenderTypeInt2 = getRelativeInt(defenderType[1]);
            multiplier = multiply_chart[attackTypeInt][defenderTypeInt1] * multiply_chart[attackTypeInt][defenderTypeInt2];
        } else {
            multiplier = multiply_chart[attackTypeInt][defenderTypeInt1];
        }
        if (multiplier == 0) {
//            abilityEffectText = "It doesn't affect " + opponentPokemon.name + "...";
        } else if (multiplier < 1) {
//            abilityEffectText = "It's not very effective...";
        } else if (multiplier > 1) {
//            abilityEffectText = "It's super effective!";
        }
        return multiplier;
    }

    public int damage_formula(Pokemon attacker, Pokemon defender, Ability ability) {
        return (int) (Math.floor(((2 * attacker.level / 5 + 2) * ability.power * (attacker.attack / defender.defense) / 50) + 2) * damage_multiply(ability.type, defender.type));
    }

    public int getRelativeInt(String type) {
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

    public UseAbility(Pokemon attacker, Pokemon target, Ability ability) {
        super(ability.priority, attacker.name + " used " + ability.name + ".");
        this.attacker = attacker;
        this.target = target;
        this.ability = ability;
    }

    @Override
    public void activate() {
        ability.currentPP--;
        if (!ability.category.equals("Status")) {
            target.currentHP -= damage_formula(attacker, target, ability);
        }
    }
}
