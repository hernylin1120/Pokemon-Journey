package com.lin.pokemon_journey;

import java.util.Arrays;
import java.util.Objects;

public class Player {
    String name;
    long lastSaveTime;
    Pokemon[] pokemons;
    Item[] items;
    int stage;
    Pokemon currentPokemon;
    public Player(String name) {
        this.name = name;
        this.stage = 1;
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
