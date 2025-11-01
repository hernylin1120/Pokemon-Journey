package com.lin.pokemon_journey;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Json;

public class SaveManager {
    private static final String SAVE_FILE = "pokemon_save.json";
    private Json json;

    public SaveManager() {
        json = new Json();
        json.setUsePrototypes(false);
    }

    // 儲存遊戲
    public void saveGame(Player player) {
        SaveData saveData = new SaveData();
        saveData.lastSaveTime = System.currentTimeMillis();
        saveData.playerData = convertPlayerToData(player);

        String jsonString = json.toJson(saveData);
        FileHandle file = Gdx.files.local(SAVE_FILE);
        file.writeString(jsonString, false);

        Gdx.app.log("SaveManager", "Game saved successfully");
    }

    // 讀取遊戲
    public SaveData loadGame() {
        FileHandle file = Gdx.files.local(SAVE_FILE);
        if (!file.exists()) {
            Gdx.app.log("SaveManager", "No save file found");
            return null;
        }

        String jsonString = file.readString();
        SaveData saveData = json.fromJson(SaveData.class, jsonString);
        Gdx.app.log("SaveManager", "Game loaded successfully");
        return saveData;
    }

    // 檢查是否有存檔
    public boolean hasSaveFile() {
        return Gdx.files.local(SAVE_FILE).exists();
    }

    // 轉換 Player 到 SaveData
    private SaveData.PlayerData convertPlayerToData(Player player) {
        SaveData.PlayerData data = new SaveData.PlayerData();

        if (player.pokemons != null) {
            data.pokemons = new SaveData.PokemonData[player.pokemons.length];
            for (int i = 0; i < player.pokemons.length; i++) {
                if (player.pokemons[i] != null) {
                    data.pokemons[i] = convertPokemonToData(player.pokemons[i]);
                }
            }
        }

        return data;
    }

    private SaveData.PokemonData convertPokemonToData(Pokemon pokemon) {
        SaveData.PokemonData data = new SaveData.PokemonData();
        data.id = pokemon.id;
        data.name = pokemon.name;
        data.level = pokemon.level;
        data.currentHP = pokemon.currentHP;
        data.currentAttack = pokemon.currentAttack;
        data.currentDefense = pokemon.currentDefense;
        data.currentSpecialAttack = pokemon.currentSpecialAttack;
        data.currentSpecialDefense = pokemon.currentSpecialDefense;
        data.currentSpeed = pokemon.currentSpeed;
        data.iv = pokemon.iv;
        data.ev = pokemon.ev;

        if (pokemon.abilities != null) {
            data.abilities = new SaveData.AbilityData[pokemon.abilities.length];
            for (int i = 0; i < pokemon.abilities.length; i++) {
                if (pokemon.abilities[i] != null) {
                    data.abilities[i] = new SaveData.AbilityData();
                    data.abilities[i].name = pokemon.abilities[i].name;
                    data.abilities[i].currentPP = pokemon.abilities[i].currentPP;
                }
            }
        }

        return data;
    }

    // 從 SaveData 還原 Player
    public Player restorePlayer(SaveData saveData) {
        Player player = new Player("Player");

        if (saveData.playerData.pokemons != null) {
            player.pokemons = new Pokemon[saveData.playerData.pokemons.length];
            for (int i = 0; i < saveData.playerData.pokemons.length; i++) {
                if (saveData.playerData.pokemons[i] != null) {
                    player.pokemons[i] = restorePokemon(saveData.playerData.pokemons[i]);
                }
            }
        }

        return player;
    }

    private Pokemon restorePokemon(SaveData.PokemonData data) {
        Pokemon pokemon = Main.pokemonFactory.createPokemon(data.name);
        pokemon.setLevel(data.level);
        pokemon.currentHP = data.currentHP;
        pokemon.iv = data.iv;
        pokemon.ev = data.ev;

        if (data.abilities != null) {
            for (int i = 0; i < data.abilities.length; i++) {
                if (data.abilities[i] != null) {
                    pokemon.abilities[i] = Main.abilityFactory.createAbility(data.abilities[i].name);
                    pokemon.abilities[i].currentPP = data.abilities[i].currentPP;
                }
            }
        }

        return pokemon;
    }
}
