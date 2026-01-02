package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;
public class ItemFactory {
    //the if statement should be handled with the class
    private static final Map<String, Item> items = new HashMap<>();
    public static Item createItem(String itemName) {
        if (items.containsKey(itemName)) {
            return items.get(itemName);
        }
        Item newItem;
        switch (itemName) {
            case "Antidote":
                newItem = new HealingItems(
                    "Antidote",
                    "Cures one Pokémon of the Poison status effect.",
                    new Texture(""),
                    pokemon -> {
                        if (pokemon.condition.equals("Poisoned")) {
                            pokemon.condition = "";
                        }
                    }
                );
                break;
            case "Awakening":
                newItem = new HealingItems(
                    "Awakening",
                    "Awakens one Pokémon with the Sleep status effect.",
                    new Texture(""),
                    pokemon -> {
                        if (pokemon.condition.equals("Sleep")) {
                            pokemon.condition = "";
                        }
                    }
                );
                break;
            case "Burn Heal":
                newItem = new HealingItems(
                    "Burn Heal",
                    "Cures one Pokémon of the Burn status effect.",
                    new Texture(""),
                    pokemon -> {
                        if (pokemon.condition.equals("Burn")) {
                            pokemon.condition = "";
                        }
                    }
                );
                break;
            case "Elixir":
                newItem = new HealingItems(
                    "Elixir",
                    "Restores 10 PP to every move of a selected Pokémon.",
                    new Texture(""),
                    pokemon -> {
                        if (pokemon.condition.equals("Poisoned")) {
                            pokemon.condition = "";
                        }
                    }
                );
                break;
            case "Potion":
                newItem = new HealingItems(
                    "Potion",
                    "Restores 20 HP to one Pokémon.",
                    new Texture(""),
                    pokemon -> {{
                        pokemon.currentHP += 20;
                        if (pokemon.currentHP > pokemon.maxHP) {
                            pokemon.currentHP = pokemon.maxHP;
                        }
                    }}
                );
            default:
                throw new IllegalArgumentException("Unknown item: " + itemName);
        }
        items.put(itemName, newItem);
        return newItem;
    }
}
