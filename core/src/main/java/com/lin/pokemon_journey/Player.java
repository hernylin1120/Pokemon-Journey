package com.lin.pokemon_journey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Player {
    String name;
    long lastSaveTime;
    Pokemon[] pokemons;
    int stage;
    Pokemon currentPokemon;
    List<Pokemon> pokemonBox;
    Map<Item, Integer> bag;
    public Player(String name) {
        this.name = name;
        this.stage = 1;
        this.pokemonBox = new ArrayList<>();
        this.bag = new HashMap<>();
        this.pokemons = new Pokemon[6];
    }

    public void setCurrentPokemon() {
        int playerPokemonCount = (int) Arrays.stream(pokemons).filter(Objects::nonNull).count();
        for (int i = 0; i < playerPokemonCount; i++) {
            if (!pokemons[i].condition.equals("Fainted")) {
                currentPokemon = pokemons[i];
                break;
            }
        }
    }
}
