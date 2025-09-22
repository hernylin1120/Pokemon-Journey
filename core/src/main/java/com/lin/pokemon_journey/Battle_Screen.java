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
    private Texture background;
    private Texture subtitle_bar;
    private Texture choosing_ability_screen;

    public Battle_Screen(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        background = new Texture("Grassland_Field_Background.png");
        subtitle_bar = new Texture("Subtitle.png");
        choosing_ability_screen = new Texture("Choosing_Ability_Screen.png");
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1f, 0f, 0f, 1f);
        Pokemon charizard = Main.pokemonFactory.createPokemon("Charizard");
        batch.begin();
        int backgroundY = Gdx.graphics.getHeight() - background.getHeight();
        batch.draw(background, 0, backgroundY);
        if (charizard.sprites != null) {
            batch.draw(charizard.sprites[0], 150, Gdx.graphics.getHeight() - 100);
        }
        int subtitleBarY = backgroundY - subtitle_bar.getHeight();
        batch.draw(subtitle_bar, 0, subtitleBarY);
        int choosingAbilityScreenY = subtitleBarY - choosing_ability_screen.getHeight();
        batch.draw(choosing_ability_screen, 0, choosingAbilityScreenY);
        batch.end();
    }

    @Override
    public void dispose() {
        if (batch != null) batch.dispose();
        if (background != null) background.dispose();
        if (subtitle_bar != null) subtitle_bar.dispose();
        if (choosing_ability_screen != null) choosing_ability_screen.dispose();
    }

    @Override public void resize(int width, int height) {}
    @Override public void pause() {}
    @Override public void resume() {}
    @Override public void hide() {}
}
