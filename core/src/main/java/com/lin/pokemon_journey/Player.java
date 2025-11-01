package com.lin.pokemon_journey;

public class Player {
    String name;
    long lastSaveTime;
    Pokemon[] pokemons;
    Item[] items;
    int stage;

    public Player(String name) {
        this.name = name;
        this.stage = 1;
    }
}
