package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;

public class Battle_Screen implements Screen {
    private Game game;
    private SpriteBatch batch;

    public Battle_Screen(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1f, 0f, 0f, 1f); // 紅色背景表示戰鬥畫面
        // 在這裡添加戰鬥畫面的內容
        Pokemon charizard = Main.pokemonFactory.createPokemon("Charizard"); // 噴火龍
        batch.begin();
        Texture background = new Texture("9926cea75b7feebf809ee0d9bf576f21.png");
        batch.draw(background, 0, Gdx.graphics.getHeight() - background.getHeight());
        if (charizard.sprites != null) {
            // 假設 sprites 是 TextureRegion
            batch.draw(charizard.sprites[0], 400, Gdx.graphics.getHeight() - 100); // 在 (100, 100) 繪製
        }
        batch.end();
    }

    @Override
    public void dispose() {
        if (batch != null) batch.dispose();
    }

    @Override public void resize(int width, int height) {}
    @Override public void pause() {}
    @Override public void resume() {}
    @Override public void hide() {}
}
