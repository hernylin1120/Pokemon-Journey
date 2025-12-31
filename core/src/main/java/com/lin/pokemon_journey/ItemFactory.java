package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;
import java.util.Map;
public class ItemFactory {
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
            default:
                throw new IllegalArgumentException("Unknown item: " + itemName);
        }
        items.put(itemName, newItem);
        return newItem;
    }
}
