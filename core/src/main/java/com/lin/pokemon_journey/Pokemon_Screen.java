package com.lin.pokemon_journey;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import java.util.Arrays;
import java.util.Objects;

public class Pokemon_Screen implements Screen {
    private Texture pokemonScreen;
    private Texture BottomScreen;
    private Texture pokemonScreenFirstPokemonCard;
    private Texture pokemonScreenPokemonCard;
    private Texture pokemonScreenBackButton;
    private Texture Pokemon_Info;
    private Texture Pokemon_TrainerMemo;
    private Texture Pokemon_BattleMoves;
    private Texture Pokemon_PokemonSkills;
    private Texture Pokemon_PokemonSkills_Desc;
    private SpriteBatch batch;
    private Viewport viewport;
    private OrthographicCamera camera;
    private int screenWidth;
    private int screenHeight;
    private int upperScreenStartY;
    private int lowerScreenY;
    @Override
    public void show() {
        pokemonScreen = new Texture("Pokemon_Journey/Pokemon_Screen.png");
        BottomScreen = new Texture("Pokemon_Journey/Empty_Bottom_Screen.png");
        Pokemon_Info = new Texture("Pokemon_Journey/Pokemon_Info.png");
        Pokemon_TrainerMemo = new Texture("Pokemon_Journey/Pokemon_TrainerMemo.png");
        Pokemon_BattleMoves = new Texture("Pokemon_Journey/Pokemon_BattleMoves.png");
        Pokemon_PokemonSkills = new Texture("Pokemon_Journey/Pokemon_PokemonSkills.png");
        Pokemon_PokemonSkills_Desc = new Texture("Pokemon_Journey/Pokemon_PokemonSkills_Desc.png");
        upperScreenStartY = BottomScreen.getHeight();
        lowerScreenY = 0;
        camera = new OrthographicCamera();
        screenWidth = Pokemon_Info.getWidth();
        screenHeight = Pokemon_Info.getHeight() + BottomScreen.getHeight();
        viewport = new FitViewport(screenWidth, screenHeight, camera);
    }

    public void setPokemonScreen() {
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0f, 0f, 0f, 1f);
        viewport.apply();
        batch.setProjectionMatrix(camera.combined);

        batch.begin();
        batch.draw(Pokemon_Info, 0, upperScreenStartY);
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void dispose() {
    }
}
