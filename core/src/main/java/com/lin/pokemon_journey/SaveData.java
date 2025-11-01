package com.lin.pokemon_journey;

public class SaveData {
    public PlayerData playerData;
    public long lastSaveTime;

    public static class PlayerData {
        public String name;
        public PokemonData[] pokemons;
        public long lastSaveTime;
        public int stage;
    }

    public static class PokemonData {
        public int id;
        public String name;
        public int level;
        public int currentHP;
        public int currentAttack;
        public int currentDefense;
        public int currentSpecialAttack;
        public int currentSpecialDefense;
        public int currentSpeed;
        public int[] iv;
        public int[] ev;
        public AbilityData[] abilities;
    }

    public static class AbilityData {
        public String name;
        public int currentPP;
    }
}
