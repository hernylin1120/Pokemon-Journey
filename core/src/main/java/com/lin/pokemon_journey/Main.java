package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    public static PokemonFactory pokemonFactory;
    public static TrainerFactory trainerFactory;
    public static AbilityFactory abilityFactory;
    public static SaveManager saveManager;
    public static SaveData saveData;
    public static Player player;


    @Override
    public void create() {
        pokemonFactory = new PokemonFactory();
        trainerFactory = new TrainerFactory();
        saveManager = new SaveManager();
        if (saveManager.hasSaveFile()) {
            saveData = saveManager.loadGame();
            player = saveManager.restorePlayer(saveData);
        }
        setScreen(new Home_Screen(this));
    }

//    @Override
//    public void pause() {
//        // 遊戲暫停時自動儲存
//        if (currentPlayer != null) {
//            saveManager.saveGame(currentPlayer);
//        }
//    }
}
