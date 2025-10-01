package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;

import java.util.Arrays;
import java.util.Objects;

public class Battle_Screen implements Screen {
    private Game game;
    private SpriteBatch batch;
    private Texture background;
    private int backgroundY;
    private Texture ground;
    private Texture subtitle_bar;
    private int subtitleBarY;
    private Texture choosing_ability_screen;
    private int choosingAbilityScreenY;
    private Texture ability_button;
    private Opponent opponent;
    private Pokemon playerPokemon;
    private Pokemon opponentPokemon;
    private boolean inDecideScreen = false;
    private boolean inAbilityScreen = true;

    public Battle_Screen(Game game) {
        this.game = game;
    }

    public int damage_formula(Pokemon attacker, Pokemon defender, Ability ability) {
        return (int) (Math.floor(((2 * attacker.level / 5 + 2) * ability.power * (attacker.attack / defender.defense) / 50) + 2) * damage_multiply(ability.type, defender.type));
    }

    public double damage_multiply(String attackType, String[] defenderType) {
        double[][] multiply_chart = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 0, 1, 1, 0.5, 1},
            {1, 0.5, 0.5, 2, 1, 2, 1, 1, 1, 1, 1, 2, 0.5, 1, 0.5, 1, 2, 1},
            {1, 2, 0.5, 0.5, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 1, 1},
            {1, 0.5, 2, 0.5, 1, 1, 1, 0.5, 2, 0.5, 1, 0.5, 2, 1, 0.5, 1, 0.5, 1},
            {1, 1, 2, 0.5, 0.5, 1, 1, 1, 0, 2, 1, 1, 1, 1, 0.5, 1, 1, 1},
            {1, 0.5, 0.5, 2, 1, 0.5, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 0.5, 1},
            {2, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 0.5, 2, 0, 1, 2, 2, 0.5},
            {1, 1, 1, 2, 1, 1, 1, 0.5, 0.5, 1, 1, 1, 0.5, 0.5, 1, 1, 0, 2},
            {1, 2, 1, 0.5, 2, 1, 1, 2, 1, 0, 1, 0.5, 2, 1, 1, 1, 2, 1},
            {1, 1, 1, 2, 0.5, 1, 2, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 0.5 , 1},
            {1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 0.5, 1, 1, 1, 1, 0, 0.5 ,1},
            {1, 0.5, 1, 2, 1, 1, 0.5, 0.5, 1, 0.5, 2, 1, 1, 0.5, 1, 2, 0.5 ,0.5},
            {1, 2, 1, 1, 1, 2, 0.5, 1, 0.5, 2, 1, 2, 1, 1, 1, 1, 0.5 ,1},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 0.5, 1 ,1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 0.5 ,0},
            {1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 2, 1, 1, 2, 1, 0.5, 1, 0.5},
            {1, 0.5, 0.5, 1, 0.5, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 0.5 ,2},
            {1, 0.5, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 1, 1, 1, 2, 2, 0.5 ,1}
        };
        int attackTypeInt = getRelativeInt(attackType);
        int defenderTypeInt1 = getRelativeInt(defenderType[0]);
        int defenderTypeInt2;
        if (defenderType.length > 1) {
            defenderTypeInt2 = getRelativeInt(defenderType[1]);
            return multiply_chart[attackTypeInt][defenderTypeInt1] * multiply_chart[attackTypeInt][defenderTypeInt2];
        }
        return multiply_chart[attackTypeInt][defenderTypeInt1];
    }

    public int getRelativeInt(String type) {
        switch (type) {
            case "Normal": return 0;
            case "Fire": return 1;
            case "Water": return 2;
            case "Grass": return 3;
            case "Electric": return 4;
            case "Ice": return 5;
            case "Fighting": return 6;
            case "Poison": return 7;
            case "Ground": return 8;
            case "Flying": return 9;
            case "Psychic": return 10;
            case "Bug": return 11;
            case "Rock": return 12;
            case "Ghost": return 13;
            case "Dragon": return 14;
            case "Dark": return 15;
            case "Steel": return 16;
            case "Fairy": return 17;
            default: return -1;
        }
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        background = new Texture("Grassland_Field_Background.png");
        ground = new Texture("Grass_Ground.png");
        subtitle_bar = new Texture("Subtitle.png");
        choosing_ability_screen = new Texture("Choosing_Ability_Screen.png");
        ability_button = new Texture("AbilityButton/Fire_AbilityButton.png");
        opponent = Main.opponentFactory.Cynthia();
        opponentPokemon = opponent.pokemons[0];
        Pokemon charmander = Main.pokemonFactory.createPokemon("Charmander");
        playerPokemon = charmander;
        charmander.abilities[0] = Main.abilityFactory.createAbility("Growl");
        charmander.abilities[1] = Main.abilityFactory.createAbility("Scratch");
        charmander.abilities[2] = Main.abilityFactory.createAbility("Ember");
    }

    public void abilityButton(int buttonX, int buttonY, Texture buttonTexture, Ability ability) {
        batch.draw(ability_button, buttonX, buttonY);
        Rectangle buttonBounds = new Rectangle(buttonX, buttonY, buttonTexture.getWidth(), buttonTexture.getHeight());
        if (Gdx.input.justTouched()) {
            float touchX = Gdx.input.getX();
            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
            if (buttonBounds.contains(touchX, touchY)) {
                opponentPokemon.currentHP -= damage_formula(playerPokemon, opponentPokemon, ability);
            }
        }
    }

    public void allAbilityButton(Pokemon pokemon) {
        int Row1ButtonY = subtitleBarY - 24 - ability_button.getHeight();
        int Row2ButtonY = Row1ButtonY - 7 - ability_button.getHeight();
        int buttonX;
        int buttonY;
        int abilityNo = 1;
        while (abilityNo <= Arrays.stream(pokemon.abilities).filter(Objects::nonNull).count()) {
            switch (abilityNo) {
                case 1:
                    buttonX = 2;
                    buttonY = Row1ButtonY;
                    abilityButton(buttonX, buttonY, ability_button, pokemon.abilities[0]);
                    break;
                case 2:
                    buttonX = 6 + ability_button.getWidth();
                    buttonY = Row1ButtonY;
                    abilityButton(buttonX, buttonY, ability_button, pokemon.abilities[1]);
                    break;
                case 3:
                    buttonX = 2;
                    buttonY = Row2ButtonY;
                    abilityButton(buttonX, buttonY, ability_button, pokemon.abilities[2]);
                    break;
                case 4:
                    buttonX = 6 + ability_button.getWidth();
                    buttonY = Row2ButtonY;
                    abilityButton(buttonX, buttonY, ability_button, pokemon.abilities[3]);
                    break;
            }
            abilityNo++;
        }
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1f, 0f, 0f, 1f);

//        float scale = Gdx.graphics.getWidth() / 256f;
//        batch.setProjectionMatrix(batch.getProjectionMatrix().scale(scale, scale, 1));

        batch.begin();
        backgroundY = Gdx.graphics.getHeight() - background.getHeight();
//      backgroundY = (int) ((Gdx.graphics.getHeight() / scale) - background.getHeight());
        batch.draw(background, 0, backgroundY);
        batch.draw(ground, 0, backgroundY);

//        Pokemon charizard = Main.pokemonFactory.createPokemon("Charizard");
//        if (charizard.sprites != null) {
//            batch.draw(charizard.sprites[0], 150, Gdx.graphics.getHeight() - 100);
//        }

        batch.draw(opponentPokemon.sprites[0], 150, Gdx.graphics.getHeight() - 100);
        batch.draw(playerPokemon.sprites[2], 24, backgroundY - 8);

        BitmapFont font = new BitmapFont();
        font.getData().setScale(25f);
        font.draw(batch, String.valueOf(opponentPokemon.currentHP), 500, 500);

        subtitleBarY = backgroundY - subtitle_bar.getHeight();
        batch.draw(subtitle_bar, 0, subtitleBarY);

        if (inDecideScreen) {

        } else if (inAbilityScreen) {
            choosingAbilityScreenY = subtitleBarY - choosing_ability_screen.getHeight();
            batch.draw(choosing_ability_screen, 0, choosingAbilityScreenY);
            allAbilityButton(playerPokemon);
        }

        batch.end();
//        batch.setProjectionMatrix(batch.getProjectionMatrix().scale(1 / scale, 1 / scale, 1));
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
